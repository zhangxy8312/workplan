package com.bitsoft.test;

/**
 * Created by zhangxy on 2017/8/13.
 */
public class StringUtils {
    public static String fillWithZero(String oldstr, int maxLength) {
        if (oldstr == null) {
            throw new IllegalArgumentException("string is null");
        }
        int len = oldstr.length();
        StringBuffer strb = new StringBuffer();
        for (int i = 0; i < maxLength - len; i++) {
            strb.append("0");
        }
        strb.append(oldstr);
        return strb.toString();
    }
}