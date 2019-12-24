package com.hujl.java8;

/**
 * @author hujl
 * @since 2019/8/23 09:33
 */
@FunctionalInterface
public interface Function {
    double collect(int a);
    default double sqrt(int a){
        return Math.sqrt(a);
    }

}
