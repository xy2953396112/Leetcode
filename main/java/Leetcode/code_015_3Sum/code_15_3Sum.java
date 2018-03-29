package Leetcode.code_015_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class code_15_3Sum {

    public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        int len = num.length, tar = 0;

        if (len <= 2)
            return  ret;

        Arrays.sort(num);

        for (int i = 0; i <= len - 3; i++) {
            // first number : num[i]
            int j = i + 1;	// second number
            int k = len - 1;	// third number
            while (j < k) {
                if (num[i] + num[j] + num[k] < tar) {
                    ++j;
                } else if (num[i] + num[j] + num[k] > tar) {
                    --k;
                } else {
                    ret.add(Arrays.asList(num[i], num[j], num[k]));
                    ++j;
                    --k;
                    //保证没有重复元素
                    while (j < k && num[j] == num[j - 1])
                        ++j;
                    while (j < k && num[k] == num[k + 1])
                        --k;
                }
            }
            while (i <= len - 3 && num[i] == num[i + 1])
                ++i;
        }
        return ret;

    }
}
