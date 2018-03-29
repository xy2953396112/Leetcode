package Leetcode.code_035_Search_Insert_Position;

public class Solution {

        public int searchInsert(int[] A, int target) {

            if (A == null) {
                return -1;
            }

            int i;
            for (i = 0; i < A.length; i++) {
                if (A[i] >= target) {
                    return i;
                }
            }

            return i;
        }

}
