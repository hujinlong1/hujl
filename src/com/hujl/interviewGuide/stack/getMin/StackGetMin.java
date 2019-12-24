package com.hujl.interviewGuide.stack.getMin;

import java.util.Stack;

/**
 * @author hujl
 * @since 2019/12/24 13:48
 * 实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈内最小元素的操作
 * 要求： pop  push   getMain  时间复杂度都为 O(1)
 *
 *
 */
public class StackGetMin {

    private Stack<Integer> stackData;

    private Stack<Integer> stackMin;

    public StackGetMin(){
        stackData = new Stack<>();
        stackMin = new Stack<>();
    }

    /**
     * 弹出元素时，将弹出的元素与s2中栈顶的元素比较，如果相等（说明当前弹出的为栈中最小的元素）则s2中栈顶的元素也相应弹出，
     * @return
     */
    private Integer pop(){
        if (stackData.empty()){
            return -1;
        }
        Integer pop = stackData.pop();
        Integer peek = stackMin.peek();
        if (pop.equals(peek)){
            stackMin.pop();
        }
        return pop;
    }

    /**
     * 压入元素时判断压入的元素是否小于等于s2中栈顶的元素，如果成立（表示当前压入的元素为栈中最小的元素），则将此元素同时压入s2
     * @param num
     */
    private void push(Integer num){
        stackData.push(num);
        if (stackMin.empty()){
            stackMin.push(num);
            return;
        }
        Integer peek = stackMin.peek();
        if(num<=peek){
            stackMin.push(num);
        }

    }

    /**
     * 直接获取s2中的栈顶元素
     * @return
     */
    private Integer getMin(){
        Integer peek = stackMin.peek();
        return peek;
    }

    public static void main(String[] args) {
        StackGetMin stackGetMin = new StackGetMin();
        stackGetMin.push(1);
        stackGetMin.push(3);
        stackGetMin.push(4);
        stackGetMin.push(0);
        stackGetMin.push(2);

        stackGetMin.pop();
        stackGetMin.pop();

        Integer min = stackGetMin.getMin();
        System.out.println(min);
    }

}
