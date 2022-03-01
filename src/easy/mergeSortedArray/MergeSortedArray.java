package easy.mergeSortedArray;

public class MergeSortedArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int totalLength = m + n - 1;

        while(totalLength >= 0){
            if(i < 0){
                nums1[totalLength] = nums2[j];
                j--;
            } else if(j < 0){
                nums1[totalLength] = nums1[i];
                i--;
            }else if(nums1[i] >= nums2[j]){
                nums1[totalLength] = nums1[i];
                i--;
            } else {
                nums1[totalLength] = nums2[j];
                j--;
            }
            totalLength--;
        }
        return nums1;
    }
}
