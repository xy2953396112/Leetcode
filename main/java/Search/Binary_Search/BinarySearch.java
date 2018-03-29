package Search.Binary_Search;

public class BinarySearch {

    public int searchInsert(int[] A, int target) {

        int mid;
        int low = 0;
        int high = A.length - 1;

        while (low <= high) {
            mid = low + (high - low)/ 2;

            if (A[mid] == target) {
                return mid;
            } else if (A[mid] < target){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}
