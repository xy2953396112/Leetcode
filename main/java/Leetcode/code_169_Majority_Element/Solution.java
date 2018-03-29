package Leetcode.code_169_Majority_Element;

public class Solution {

    public static  void majorityElement(int[] num) {
        int main = num[0]; // 用于记录主元素，假设第一个是主元素
        int count = 1; // 用于抵消数的个数

        for (int i = 1; i < num.length; i++) { // 从第二个元素开始到最后一个元素
            if (main == num[i]) { // 如果两个数相同就不能抵消
                count++; // 用于抵消的数据加1
            } else {
                if (count > 0) { // 如果不相同，并且有可以抵消的数
                    count--; // 进行数据抵消
                } else { // 如果不相同，并且没有可以抵消的数
                    main = num[i]; // 记录最后不可以抵消的数
                }
            }
        }

        System.out.println(main);
        System.out.println("------");
        for(int i=0;i<num.length-1;i++){
                 System.out.println(num[i]);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,1,2,1,1};
        majorityElement(a);
    }
}
