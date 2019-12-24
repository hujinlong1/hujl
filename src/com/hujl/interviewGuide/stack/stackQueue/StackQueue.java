package com.hujl.interviewGuide.stack.stackQueue;

import java.util.Stack;

/**
 * @author hujl
 * @since 2019/12/24 14:17
 * 用两个栈实现一个队列，实现队列的基本功能（add poll peek）
 *
 * 实现思路：使用两个栈组成一个队列，s1 s2 ,当向队列add元素时将元素压入s1,当要poll队列的元素时，利用另一个栈s2将s1中的数据逆序，保证队列的先进先出
 *
 * 注意：s2不为null时直接弹出s2中的元素，s2为null时，将s1的元素全部弹出到s2中然后再弹出
 *
 * 空间复杂度 O(n)  最好时间复杂度O(1)  最差时间复杂度O(n)  平均时间复杂度O(1)
 *
 *
 */
public class StackQueue {
    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    public StackQueue(){
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void add(Integer num){
        inStack.push(num);
    }

    public Integer poll(){
        if (outStack.empty() && inStack.empty()){
            return -1;
        }else if (outStack.empty()){
            while (!inStack.empty()){
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }

    public Integer peek(){
        if (outStack.empty() && inStack.empty()){
            return -1;
        }else if (outStack.empty()){
            while (!inStack.empty()){
                outStack.push(inStack.pop());
            }
        }
        return outStack.peek();
    }

    public static void main(String[] args) {
        StackQueue queue = new StackQueue();
        queue.add(9);
        queue.add(8);
        queue.add(7);
        queue.add(6);
        queue.add(5);
        queue.add(4);
        queue.add(3);
        queue.add(2);
        queue.add(1);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        queue.add(10);
        queue.add(11);
        queue.add(12);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
