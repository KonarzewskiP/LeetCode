package easy.twoSum;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();
        map.put(nums[0],0);
        int value;
        for (int i = 1; i < nums.length; i++) {
            value = target - nums[i];
            if (map.containsKey(value)){
                return new int[]{i, map.get(value)};
            }
            map.put(nums[i], i);
        }
        return null;
    }

}
