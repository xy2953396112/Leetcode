package Leetcode.code_223_Rectangle_Area;

public class Solution {


    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        long area = (long) (C - A) * (D - B) + (long)(G - E) * (H - F);
        // Math.min(C, G) 表示右边边的最小的边
        // Math.max(A, E) 表示左边边的最大的边
        // 下面的减法会产生数组越介，要扩大数据范围
        long width = Math.max((long)Math.min(C, G) - (long)Math.max(A, E), 0);
        // Math.min(D, H) 表示顶边边的最小的边
        // Math.max(B, F) 表示底边边的最大的边
        long height = Math.max((long)Math.min(D, H) - (long)Math.max(B, F), 0);

        return (int)(area - width * height);
    }
}
