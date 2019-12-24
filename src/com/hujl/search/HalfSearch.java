package com.hujl.search;

/**
 * 折半查找
 * @author hujl
 * @since 2019/8/21 11:47
 */
public class HalfSearch {

    public static void main(String[] args) {
        int[] arr=new int[]{1,2};
        int i = halfSearch(arr, 0, arr.length - 1, 1);
        System.out.println(i);
    }

    private static int halfSearch(int[] arr,int low,int high,int tar){
        if (low==high) return low;
        int mid = low + ((high - low) >> 1);
        if (arr[mid] == tar ){
            return mid;
        }else if (tar < arr[mid]) {
            //递归继续查找
            return halfSearch(arr, low, mid - 1, tar);
        }else {
            //递归继续查找
            return halfSearch(arr, mid + 1, high, tar);
        }
    }
}
