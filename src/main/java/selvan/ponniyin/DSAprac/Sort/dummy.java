package selvan.ponniyin.DSAprac.Sort;

import java.util.Arrays;

public class dummy {

    public static void main(String[] args) {
        //nums1 =
        //[4,5,6,0,0,0]
        //m =
        //3
        //nums2 =
        //[1,2,3]
//nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        mergeII(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        mergeII(new int[]{1}, 1, new int[]{}, 0);
        mergeII(new int[]{0}, 0, new int[]{1}, 1);
        mergeII(new int[] {4,5,6,0,0,0},3,new int[] {1,2,3},3);
        mergeII(new int[]{4,0,0,0,0,0},1,new int[]{1,2,3,5,6},5);
    }


    public static void mergeII(int[] nums1, int m, int[] nums2, int n) {
        int t = n - 1;
        int o = m - 1;
        int i = nums1.length - 1;

        if(m==0 && n!=0){
            nums1[0]=nums2[0];
        }

        while (i >= 0 && t >=0 && o >=0) {
            if (nums1[o] < nums2[t]) {
                nums1[i--]=nums2[t--];
            }else {
                nums1[i--]=nums1[o--];
            }
        }

        if(o < 0 && t >=0 ){
            while(i>=0){
                nums1[i--]=nums2[t--];
            }
        }

        System.out.println(Arrays.toString(nums1));


    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        while (i < nums1.length) {
            if (i < m && j < n) {
                if (nums1[i] <= nums2[j]) {
                    i++;
                } else {
                    int temp = nums1[i];
                    nums1[i] = nums2[j++];
                    nums1[++i] = temp;
                    i++;
                }
            } else {
                if (j < n) {
                    nums1[i++] = nums2[j++];
                } else {
                    i++;
                    j++;
                }
            }
        }

        System.out.println(Arrays.toString(nums1));
    }

}
