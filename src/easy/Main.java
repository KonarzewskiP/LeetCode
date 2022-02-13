package easy;

import easy.twoSum.TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = TwoSum.twoSum(new int[]{3, 2, 4}, 6);
//        int[] arr = TwoSum.twoSum(new int[]{3, 3}, 6);
//        int[] arr = TwoSum.twoSum(new int[]{15,7,11,2}, 9);

        Arrays.stream(arr).forEach(System.out::println);
    }
}
