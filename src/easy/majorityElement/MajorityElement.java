package easy.majorityElement;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Given an array nums of size n, return the majority element.
 *
 * The majority element is the element that appears more than n/2 times.
 * You may assume that the majority element always exists in the array.
 * */

public class MajorityElement {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    // [7, 7, 5, 7, 5, 1 | 5, 7,9,8,6 | 5, 5, 7, 7 | 7]
    // Boyer-Moore
    public int majorityElementTwo(int[] nums) {
        int counter = 0;
        int candidate = nums[0];

        for (int x : nums) {
            if (counter == 0) {
                candidate = x;
            }
            counter += (candidate == x) ? 1 : -1;
        }
        return candidate;

    }


    public int majorityElementOne(int[] nums) {
        int mostPopular = nums[0];
        int numberOfAppearance = 1;
        HashMap<Integer, Integer> counter = new HashMap<>();

        for (int x : nums) {
            counter.put(x, counter.getOrDefault(x, 0) + 1);
            if (counter.get(x) > numberOfAppearance) {
                numberOfAppearance = counter.get(x);
                mostPopular = x;
            }
        }
        return mostPopular;
    }
}
