package medium.RotateArray;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int steps = k % nums.length;

        reverse(nums,0,nums.length-1);
        reverse(nums,0,steps-1);
        reverse(nums,steps,nums.length-1);
    }

    public void reverse(int[] arr, int startIndex, int endIndex){
        int temp;

        for(int i = startIndex; i < endIndex ; i++){
            temp = arr[i];
            arr[i] = arr[endIndex];
            arr[endIndex--] = temp;
        }
    }
}
