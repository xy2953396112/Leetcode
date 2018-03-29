package Leetcode.code_240_Search_A_2D_Matrix_II;

public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
            return false;
        }
        int col = matrix[0].length-1;
        int row = 0;
        while(col >= 0 && row <= matrix.length-1) {
            if(target == matrix[row][col]) {
                return true;
            } else if(target < matrix[row][col]) {
                col--;
            } else if(target > matrix[row][col]) {
                row++;
            }
        }
        return false;
    }

    public boolean searchMatrix1(int[][] matrix, int target) {
        if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
            return false;
        }
        int col = matrix[0].length-1; //列
        int row = matrix.length-1; //行
        int i = 0,j=0 ;//行，列
        while(i<=row && j<= col ) {
            if(target == matrix[i][j]) {
                return true;
            } else if(target < matrix[i][j]) {
                    j++;
            } else if(target > matrix[row][col]) {
                   i++;
            }
        }
        return false;
    }
}
