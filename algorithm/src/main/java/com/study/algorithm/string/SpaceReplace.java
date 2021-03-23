package com.study.algorithm.string;

/**
 * 空格替换
 */
public class SpaceReplace {

    public static String replaceSpace(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char charValue = s.charAt(i);
            if (charValue == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(charValue);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String str = "we are happy";
        System.out.println(replaceSpace(str));
    }
}
