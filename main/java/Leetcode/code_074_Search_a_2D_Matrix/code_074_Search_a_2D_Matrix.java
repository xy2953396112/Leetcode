package Leetcode.code_074_Search_a_2D_Matrix;

public class code_074_Search_a_2D_Matrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int row = matrix.length;
        int column = matrix[0].length;
        int low = 0;
        int high = row - 1;
        int mid = 0;

        // 找结果所在的行
        while (low <= high) {
            mid = low + (high - low) / 2;

            if (target < matrix[mid][column - 1]) {
                high = mid - 1;
            } else if (target > matrix[mid][column - 1]) {
                low = mid + 1;
            } else {
                return true;
            }
        }

        // 决定行所在的最终位置
        int targetRow = mid;
        if (matrix[mid][column - 1] < target) {
            targetRow++;
        }

        // 目标行超出，无结果
        if (targetRow >= row) {
            return false;
        }

        low = 0;
        high = column - 1;
        // 找所在的列，找到返回true，没有返回false
        while (low <= high) {
            mid = low + (high - low) / 2;

            if (target < matrix[targetRow][mid]) {
                high = mid - 1;
            } else if (target > matrix[targetRow][mid]) {
                low = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
