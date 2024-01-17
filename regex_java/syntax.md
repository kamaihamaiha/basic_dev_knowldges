## 正则表达式语法

- 不同正则表达式解析引擎可能有细微的语法差别
- 是高级版关键字搜索
- 正则表达式加入了很多具有特殊意义的元字符

### 示例

```regexp
# 匹配a开头的单词
\ba\w*\b
```

- `\b`、`\w`、`*` 都是元字符
  - `\b`: 单词边界
  - `\w`: 匹配字母、数字、下划线
  - `*`: 前一个字符可以出现0次或多次

### 语法分类

- 普通字符: 明确的关键字
- 字符集合: 关键字的值范围
- 限定符: 给前一个字符追加出现次数范围
- 定位符: 标记匹配位置的元字符
- 子表达式: 内嵌的子正则表达式
- 省略符: 为了简化正则表达式的元字符
- 修饰符: 指定匹配策略


#### 普通字符

主要包括文字字符、符号；

- 文字字符：英文字母、数字、中文字符
- 符号: @、%、_ 这些符号字符
    - 在正则表达式中大部分符号直接写就可以了

```regexp
# 匹配文本中的 get_
get_

# 匹配文本中的 "@我们"
@我们
```

- 部分符号需要转义
  - `.` & `*`
  - `\` & `|`
  - `[` & `]`
  - `(` & `)`
  - `{` & `}`
  - `^` & `$`
  - `+` & `?`

```regexp
# 匹配为本中的 get*
get\*
```

- 不太常用的字符
  - 非打印字符
    - `\n`
    - `\r`
    - `\f`: 换页符
    - `\t`
    - `\v`: 垂直制表符
  - 其他字符
    - `\x00`: 16进制转义值，2位16进值数，如 \x20 代表空格
    - `\000`: 8进制转义值，3位8进值数，如 \040 代表空格
    - `\u000`: Unicode编码值，4位16进值数，如 \u0020 代表空格

#### 字符集合

- 单个关键字的值范围，包含在一对 `[]` 中间
- 简化连续值范围，使用 `-` 符号
  - `[a-d]` 等价于 `[abcd]`
  - `[a-dz]` 等价于 `[abcdz]`
- `^`: 排除在外的取值范围(脱字符号)

```regexp
# [eo] 表示匹配a或e；匹配文本中的 get 和 got
g[eo ]t
```

如果差异不只是在一个字符上，则不适合采用字符集合。
```regexp
# 匹配文本中的 get 和 goat
g(e|oa)t
```


#### 限定符

给前一个字符追加**出现次数的范围**

- 常用的限定符: `*`、`+`、`?`
  - `*`: 0次或多次
  - `+`: 1次或多次
  - `?`: 0次或1次
- 限制具体的次数，使用 `{}`
  - `{3}`: 出现3次
  - `{3,}`: 出现3次以上
  - `{3,6}`: 出现3-6次
  - `{0,}`: 等效 `*`
  - `{1,}`: 等效 `+`
  - `{0,1}`: 等效 `?`

前面为模糊匹配范围时，会产生贪婪匹配的问题：

```regexp
# 贪婪匹配 g[a-z]+d
匹配文本: ... gd ... gadxxgod ... goad
会匹配到 gadxxgod
```

```regexp
# 非贪婪匹配 g[a-z]+?d
匹配文本: ... gd ... gadxxgod ... goad
会匹配到 gad 和 god
```


#### 定位符

标记匹配位置的元字符

- `^`: 表示字符串开始的位置
- `$`: 表示字符串结尾的位置
- `\b`: 表示单词边界，字符与空格间的位置
- `\B`: 表示非单词边界 


```regexp
# 匹配手机号：1开头，总长度11位
^1[0-9]{10}$
```

#### 子表达式

包含在 `()` 中，子表达式与正则表达式语法相同，且允许子表达式再内嵌子表达式

##### 用 `|` 分割多个子表达式

```regexp
表达式: g(e|oa)t
想要匹配的文本 get 和 goat
```

##### 子表达式可以看成一个整体

```regexp
表达式: (got)+
可以匹配: got, gotgot, gotgotgot ...
```

##### 子表达式可标记子匹配项

```regexp
regex: ([a-z])\1([a-z])\2
匹配文本: aabb ... cczz .. xxyy ...
```

- `()`: 表示子表达式，标记一个子匹配内容
- `[a-z]`: 表示a-z的字符集合
- `\1`: 表示与第一个子匹配项相同的内容
- `\2`: 表示与第二个子匹配项相同的内容


##### 子表达式可作为 预查匹配项

- `(?=)`: 正向肯定预查，放在表达式末尾
- `(?!)`: 正向否定预查，放在表达式末尾
- `(?<=)`: 反向肯定预查，放在表达式开头
- `(?<!)`: 反向否定预查，放在表达式开头

```regexp
regex: ab(?=c)
文本: ab abc ab
匹配文本: abc
```

```regexp
regex: ab(?!c)
文本: ab abc ab
匹配文本: ab ab
```

```regexp
regex: (?<=a)bc
文本: ab abc ab
匹配文本: abc
```

```regexp
regex: (?<!a)bc
文本: ab abc ab
匹配文本: bc
```

#### 省略符

为了简化正则表达式而存在的元字符，以 `\` 开头

匹配文本中的数字:
```regexp
\d+
等价于:
[0-9]+
```
`\d` 表示0-9数字的省略符

##### 常见的省略符

- `.`: 匹配除换行符外的任何单个字符
- `\d`: 匹配一个数字字符
- `\D`: 匹配一个非数字字符
- `\s`: 匹配任何空白字符，包括空格、制表符、换页等
- `\S`: 匹配任何非空白字符
- `\w`: 匹配一个字母、数字、下划线字符
- `\W`: 匹配一个非字母、数字、下划线字符


#### 修饰符

修饰符是指匹配策略的，不是正则表达式的一部分；如不区分大小写、多行匹配等

- `i`: 将匹配设置为不区分大小写
- `g`: 查找所有匹配项
- `m`: 多行匹配
- `s`: 默认情况下的圆点`.`是匹配除换行符`\n`之外的任何字符，加上`s`修饰后，`.` 包含换行符 `\n`了

---

1. Repeaters (  *, +, and { } )  
   These symbols act as repeaters and tell the computer that the preceding character is to be used for more than just one time.

2. The asterisk symbol ( * )
   It tells the computer to match the preceding character (or set of characters) for 0 or more times (upto infinite).
```text
Example : The regular expression ab*c will give ac, abc, abbc, abbbc….and so on 
```

3. The Plus symbol ( + )
   It tells the computer to repeat the preceding character (or set of characters) at atleast one or more times(up to infinite).

```text
Example : The regular expression ab+c will give abc, abbc,
abbc, … and so on.
```

4. The curly braces { … }
   It tells the computer to repeat the preceding character (or set of characters) for as many times as the value inside this bracket.
```text
Example : {2} means that the preceding character is to be repeated 2
times, {min,} means the preceding character is matches min or  more
times. {min,max} means that the preceding character is repeated at
least min & at most max times.
```

5. Wildcard ( . )
   The dot symbol can take the place of any other symbol, that is why it is called the wildcard character.
```text
Example :
The Regular expression .* will tell the computer that any character
can be used any number of times.
```

6. Optional character ( ? )
   This symbol tells the computer that the preceding character may or may not be present in the string to be matched.
```text
Example :
We may write the format for document file as – “docx?”
The ‘?’ tells the computer that x may or may not be
present in the name of file format.
```

7. The caret ( ^ ) symbol ( Setting position for the match )
   The caret symbol tells the computer that the match must start at the beginning of the string or line.
```text
Example : ^\d{3} will match with patterns like "901" in "901-333-".
```
java 中要写成 ^\\d{3}

8.  The dollar ( $ ) symbol

It tells the computer that the match must occur at the end of the string or before \n at the end of the line or string.
```text
Example : -\d{3}$  will match with patterns like "-333" in "-901-333".
```