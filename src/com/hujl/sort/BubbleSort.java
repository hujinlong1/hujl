package com.hujl.sort;

/**
 * 冒泡排序
 * @author hujl
 * @since 2019/8/17 15:53
 */
public class BubbleSort {


    public static void main(String[] args) {
        int[] nums = {1, 3, 9, 8, 5, 7, 44, 66, 15, 95, 0, 24, 16, 38, 4};
        sort(nums);
        for (int a=0;a<nums.length;a++){
            System.out.println(nums[a]);
        }
    }

    static void sort(int[] nums){
        for (int i=0;i<nums.length-1;i++){
            boolean sawp=false;
            for (int j=0;j<nums.length-1-i;j++){
                if (nums[j]>nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                    sawp=true;
                }
            }
            if (!sawp){
               break;
            }
        }
    }
}
