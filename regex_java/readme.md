## 正则表达式

regex: regular expression

[学习网站](https://www.geeksforgeeks.org/write-regular-expressions/)

---

- [介绍&应用](#介绍应用)
- [语法详解](./syntax.md)


### 介绍&应用

一种用于**匹配和操作文本**的工具；常用于文本查找、文本替换、文本格式校验等场景；

正则表达式实质上是一段文本，或者说是一条字符串。

#### 示例
```regexp
# 匹配文本中所有字母a开头的单词
\b[aA]w*\b
```

#### 程序开发种，正则表达式的应用

一般关系型数据库都支持正则表达式查询，如 MySQL
```sql
# 查找名字为a开头的记录
select * from table where REGEXP_LIKE(name, '^a');
```

##### 优缺点

- 功能强大，有效缩减代码量，提高维护性
- 性能较慢，每次执行程序都需要重新解析正则表达式

#### 日常办公 正则表达式的应用

很多日常的文本编辑软件都支持正则表达式搜索、替换：vs code、nodepad++、word（语法存在差异）、excel（语法存在差异）



