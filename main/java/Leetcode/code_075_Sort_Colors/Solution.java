package Leetcode.code_075_Sort_Colors;

public class Solution {
    public void sortColors(int[] A) {

        if (A == null) {
            return;
        }

        int count = 0; // 统计1的个数
        int sum = 0; // 统计数组的和

        for (int i : A) {
            if (i == 1) {
                count++;
            }

            sum += i;
        }

        sum = (sum - count) /2; // 计算2的数目

        count = A.length - count - sum; // 1开始出现的位置

        sum = A.length - sum; // 2开始出现的位置

        for (int i = 0; i < count; i++) {
            A[i] = 0;
        }

        for (int i = count; i < sum; i++) {
            A[i] = 1;
        }

        for (int i = sum; i < A.length; i++) {
            A[i] = 2;
        }
    }
}
