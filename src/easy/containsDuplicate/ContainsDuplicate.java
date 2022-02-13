package easy.containsDuplicate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (numbers.contains(nums[i])) {
                return true;
            }
            numbers.add(nums[i]);
        }
        return false;
    }

    public boolean containsDuplicate1(int[] nums) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        numbers.put(nums[0], 0);

        for (int i = 1; i < nums.length; i++) {
            if (numbers.containsKey(nums[i])) {
                return true;
            }
            numbers.put(nums[i], 1);
        }
        return false;
    }
}
