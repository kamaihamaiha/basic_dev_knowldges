## 正则表达式

regex: regular expression

[学习网站](https://www.geeksforgeeks.org/write-regular-expressions/)

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



