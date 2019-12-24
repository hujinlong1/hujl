package com.hujl.java8;

/**
 * @author hujl
 * @since 2019/8/23 09:38
 */
public class Test {

    public static void main(String[] args) {
        Function function = new Function() {
            @Override
            public double collect(int a) {
                return sqrt(a*100);
            }
        };
        System.out.println(function.sqrt(6));
        System.out.println(function.collect(6));
    }
}
