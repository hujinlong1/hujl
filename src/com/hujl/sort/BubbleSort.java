package com.hujl.sort;

/**
 * 冒泡排序
 * @author hujl
 * @since 2019/8/17 15:53
 */
public class BubbleSort {


    public static void main(String[] args) {
        int[] nums = {1, 3, 9, 8, 5, 7, 44, 66, 15, 95, 0, 24, 16, 38, 4};
        xuanze(nums);
        erfenchazhao(nums,44);
        //kuaisu(nums,0,nums.length-1);
        for (int a=0;a<nums.length;a++){
            System.out.println(nums[a]);
        }
    }

    /**
     * 冒泡排序
     * @param nums
     */
    static void maopao(int[] nums){

        for (int i=1;i<nums.length;i++){
            Boolean swap=false;
            for (int j=0;j<nums.length-i;j++){
                if (nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swap=true;
                }
            }
            if (!swap){
                break;
            }
        }
    }

    /**
     * 插入排序
     * @param nums
     */
    static void charu(int[] nums){

        //数组长度小于等于1不用排序
        if (nums.length>1){
            for (int i=1;i<nums.length;i++){
                //要插入的元素
                int x = nums[i];
                //要插入比较的位置，如果要插入的元素大于这个位置的元素则元素插入到这个j的后面
                //如果要插入的元素小于这个元素，那么这个位置向左移一位继续比较
                int j = i-1;
                //当x前面的值比X大的时候，一直往前找，找到比X小的值，则将X放置在这个值后面
                while (j>=0&&x<nums[j]){
                    //元素向右移一位，插入位置向左移一位
                    nums[j+1] = nums[j];
                    j--;
                }
                nums[j+1] = x;
            }
        }


    }

    /**
     * 选择排序
     * @param nums
     */
    static void xuanze(int[] nums){
        for (int i=0;i<nums.length-1;i++){
            int min =i;
            for (int j=i+1;j<nums.length;j++){
                if (nums[j]<nums[min]){
                    min=j;
                }
            }
            if (min!=i){
                //交换
                int temp = nums[min];
                nums[min] = nums[i];
                nums[i] = temp;
            }
        }
    }

    static void kuaisu(int[] arr,int begin,int end) {
        //先定义两个参数接收排序起始值和结束值
        int a = begin;
        int b = end;
        //先判断a是否大于b

        if (a >= b) {
            //没必要排序
            return;
        }
        //基准数,默认设置为第一个值
        int x = arr[a];

        //循环
        while (a < b) {
            //从后往前找,找到一个比基准数x小的值,赋给arr[a]
            //如果a和b的逻辑正确--a<b ,并且最后一个值arr[b]>x,就一直往下找,直到找到后面的值大于x
            while (a < b && arr[b] >= x) {
                b--;
            }
            //跳出循环,两种情况,一是a和b的逻辑不对了,a>=b,这时候排序结束.二是在后面找到了比x小的值
            if (a < b) {
                //将这时候找到的arr[b]放到最前面arr[a]
                arr[a] = arr[b];
                //排序的起始位置后移一位
                a++;
            }

            //从前往后找,找到一个比基准数x大的值,放在最后面arr[b]
            while (a < b && arr[a] <= x) {
                a++;
            }
            if (a < b) {
                arr[b] = arr[a];
                //排序的终止位置前移一位
                b--;
            }
        }
        //跳出循环 a < b的逻辑不成立了,a==b重合了,此时将x赋值回去arr[a]
        arr[a] = x;
        //调用递归函数,再细分再排序
        kuaisu(arr,begin,a-1);
        kuaisu(arr,a+1,end);
    }

    static void erfenchazhao(int[] nums,int a){
        int low=0;
        int high= nums.length-1;
        while (low<=high){
            int mid=low+((high-low)>>1);
            if (nums[mid]==a){
                System.out.println(nums[mid]);
                return;
            }
            if (nums[mid]>a){
                high=mid-1;
            }
            if (nums[mid]<a){
                low=mid+1;
            }
        }
    }

}
