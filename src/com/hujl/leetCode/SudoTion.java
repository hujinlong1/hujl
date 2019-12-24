package com.hujl.leetCode;

import java.util.Stack;

/**
 * @author hujl
 * @since 2019/10/12 17:30
 * 有效的括号
 */
public class SudoTion {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        String aaa="({})[]";
        Stack objects = new Stack();
        int flag=0;
        for (int i=0;i<aaa.length();i++){
            char c = aaa.charAt(i);
            if (c == '(' || c == '{' || c == '['){
                objects.push(c);
            }else {
                char pop = (char)objects.pop();
                if ((pop =='(' && c == ')')||(pop =='{' && c == '}')||(pop =='(' && c == ')')){
                    flag=1;
                }else {
                    break;
                }
            }
        }
        System.out.println(System.currentTimeMillis()-l);
        if (flag==0||!objects.isEmpty()){
            System.out.println("不是的");
        }else {
            System.out.println("是的");
        }
    }
}
