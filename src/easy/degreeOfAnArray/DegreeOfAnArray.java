package easy.degreeOfAnArray;

import java.util.HashMap;

public class DegreeOfAnArray {
    //[1,2,2,3,1] = 2
    //[1,2,2,3,1,4,2] = 6
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, int[]> numDetails = new HashMap<>();
        int degree = 1;
        int minLength = 1;

        for (int i = 0; i < nums.length; i++) {
            if (!numDetails.containsKey(nums[i])) {
                numDetails.put(nums[i], new int[]{i,i,1});
            } else {
                int[] details = numDetails.get(nums[i]);
                details[1] = i;
                details[2]++;

                if (details[2] > degree) {
                    degree = details[2];
                    minLength = i - details[0] + 1;
                } else if (details[2] == degree) {
                    minLength = Math.min(minLength, i - details[0] + 1);
                }
            }
        }
        return minLength;
    }



    public int findShortestSubArray1(int[] nums) {
        HashMap<Integer, Integer> numCount = new HashMap<>();
        int degree = 1;
        int minLength = 1;

        HashMap<Integer, Integer> firstAppearance = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            firstAppearance.putIfAbsent(nums[i], i);
            numCount.put(nums[i], numCount.getOrDefault(nums[i], 0) + 1);

            if (numCount.get(nums[i]) > degree) {
                degree = numCount.get(nums[i]);
                minLength = i - firstAppearance.get(nums[i]) + 1;
            } else if (numCount.get(nums[i]) == degree) {
                minLength = Math.min(i - firstAppearance.get(nums[i]) + 1, minLength);
            }
        }
        return minLength;
    }
}
