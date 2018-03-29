package Leetcode.code_278_First_Bad_Version;

public class Solution {

    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end-start) / 2;
            if (!isBadVersion(mid)) start = mid + 1;
            else end = mid;
        }
        return start;
    }
    static boolean isBadVersion(int version){
        return true;
    }
}
