class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArr = new int[nums1.length + nums2.length];

         int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                mergedArr[k++] = nums1[i++];
            } else {
                mergedArr[k++] = nums2[j++];
            }
        }

        while (i < nums1.length) {
            mergedArr[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            mergedArr[k++] = nums2[j++];
        }
        int ml = mergedArr.length;

        double median;
        if (ml % 2 != 0){
            median = mergedArr[(ml-1)/2];
        }
        else {
            median = (mergedArr[ml/2]+mergedArr[(ml/2)-1])/2.0;
        }
        return median;

    }
}