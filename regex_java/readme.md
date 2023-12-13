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


