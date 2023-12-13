package com.regex.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        testMatch5();
    }

    public static void testMatch1(){
        String test_1 = "ac";
        String test_2 = "abc";
        String test_3 = "abbc";
        String test_4 = "bbbc";

        List<String> testList = new ArrayList<>();
        testList.add(test_1);
        testList.add(test_2);
        testList.add(test_3);
        testList.add(test_4);

        for (String s : testList) {
            System.out.println(s + ", check: " + match_1(s));
        }
    }

    public static void testMatch2(){
        String test_1 = "ac";
        String test_2 = "abc";
        String test_3 = "abbc";
        String test_4 = "bbbc";

        List<String> testList = new ArrayList<>();
        testList.add(test_1);
        testList.add(test_2);
        testList.add(test_3);
        testList.add(test_4);

        for (String s : testList) {
            System.out.println(s + ", check: " + match_2(s));
        }
    }

    public static void testMatch3(){
        String test_1 = "ac";
        String test_2 = "abc";
        String test_3 = "abbc";
        String test_4 = "bbbc";
        String test_5 = "ababc";

        List<String> testList = new ArrayList<>();
        testList.add(test_1);
        testList.add(test_2);
        testList.add(test_3);
        testList.add(test_4);
        testList.add(test_5);

        for (String s : testList) {
            System.out.println(s + ", check: " + match_3(s));
        }
    }

    public static void testMatch4(){
        String test_0 = "a";
        String test_1 = "ac";
        String test_2 = "abc";
        String test_3 = "abbc";
        String test_4 = "a2";

        List<String> testList = new ArrayList<>();
        testList.add(test_0);
        testList.add(test_1);
        testList.add(test_2);
        testList.add(test_3);
        testList.add(test_4);

        for (String s : testList) {
            System.out.println(s + ", check: " + match_4(s));
        }
    }

    public static void testMatch5(){
        String test_0 = "a";
        String test_1 = "ac";
        String test_2 = "abc";
        String test_3 = "abbc";
        String test_4 = "a2";

        List<String> testList = new ArrayList<>();
        testList.add(test_0);
        testList.add(test_1);
        testList.add(test_2);
        testList.add(test_3);
        testList.add(test_4);

        for (String s : testList) {
            System.out.println(s + ", check: " + match_5(s));
        }
    }

    /**
     * ab*c: 匹配ac之间没有b或者有b(一个或多个)的字符串
     * @param str
     * @return
     */
    private static boolean match_1(String str){
        String regex = "ab*c";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    /**
     * ab+c: 匹配ac之间有b(一个或多个)的字符串
     * @param str
     * @return
     */
    private static boolean match_2(String str){
        String regex = "ab+c";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    /**
     * ab{2}c: 匹配ac之间有2个b的字符串
     * @param str
     * @return
     */
    private static boolean match_3(String str){
        String regex = "ab{2}c";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    /**
     * .2: 匹配任意单个字符后面再跟上字符2
     * @param str
     * @return
     */
    private static boolean match_4(String str){
        String regex = ".2";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    /**
     * .{2}: 表示匹配任意两个字符
     * @param str
     * @return
     */
    private static boolean match_5(String str){
        String regex = ".{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

}