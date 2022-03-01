package easy.peakIndexInAMountainArray;

public class PeakIndexInAMountainArray {

    public int peakIndexInMountainArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return i-1;
            }
            if (i == arr.length-1){
                return i;
            }
        }
        return -1;
    }

    public int peakIndexInMountainArray1(int[] arr) {
        if (arr.length < 3) {
            return -1;
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return -1;
    }
}
