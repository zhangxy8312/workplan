package com.bitsoft.test;

/**
 * Created by zhangxy on 2017/8/13.
 */
public class HelloWorld {
    public static void main(String[] args) {
        int i = 200;
        String formatwithzero = StringUtils.fillWithZero(String.valueOf(i), 10);
        System.out.println("fillStr:" + formatwithzero);
        printMsg("zhangxiyang");
    }

    public static void printMsg(String msg) {
        System.out.println("Hello,this is the real msg:" + msg);
    }
}
