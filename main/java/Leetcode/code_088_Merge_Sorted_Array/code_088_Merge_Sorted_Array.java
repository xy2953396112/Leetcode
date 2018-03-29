package Leetcode.code_088_Merge_Sorted_Array;

public class code_088_Merge_Sorted_Array {

        public void merge(int[] nums1, int m, int[] nums2, int n) {

            int a = m-1;
            int b = n-1;
            for(int i=a+b-1;i>=0;i--){
                if(b<0 || (a>=0 && nums1[a]>nums2[b])){
                    nums1[i]= nums1[a];
                    a--;
                }else{
                    nums1[i]= nums2[b];
                    b--;
                }
            }
        }

    public static void main(String[] args) {

            code_088_Merge_Sorted_Array obj = new code_088_Merge_Sorted_Array();
            int[] a = {1,3,5,6,8,9,0,0,0,0,0};

            int[] b = {2,4,7,8,10};

            obj.merge(a,a.length,b,b.length);
            for(int i : a){
                System.out.println(i);
            }

    }
}
