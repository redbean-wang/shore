package com.shore.utils;

import java.util.Arrays;

public class StringUtils {
    /**
     * 判空
     *
     * @param param
     * @return
     */
    public static boolean isEmpty(String param) {
        return param == null || "".equals(param);
    }

    /**
     * 判断是否全为空
     *
     * @param param
     * @return
     */
    public static boolean isAllEmpty(String ... param) {
        return Arrays.asList(param).stream().allMatch(StringUtils::isEmpty);
    }

    /**
     * 判断是否有任意值为空
     *
     * @param param
     * @return
     */
    public static boolean isAnyEmpty(String ... param) {
        return Arrays.asList(param).stream().anyMatch(StringUtils::isEmpty);
    }

    /**
     * 判断两个字符串是否相等
     *
     * @param str1
     * @param str2
     * @return
     */
    public static boolean equals(String str1, String str2) {
        if (isAllEmpty(str1, str2)) {
            return true;
        }else if (isAnyEmpty(str1, str2)) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * 判断str是否与param任意字符串相等
     *
     * @param str
     * @param param
     * @return
     */
    public static boolean anyEquals(String str, String ... param) {
        if (!isEmpty(str) && isAllEmpty(param)) {
            return false;
        } else {
            return Arrays.asList(param).contains(str);
        }
    }
}
