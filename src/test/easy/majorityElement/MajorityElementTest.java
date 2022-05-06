package easy.majorityElement;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MajorityElementTest {

    /**
     * Given an array nums of size n, return the majority element.
     *
     * The majority element is the element that appears more than n/2 times.
     * You may assume that the majority element always exists in the array.
    * */

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 3}, 3),
                Arguments.of(new int[]{6, 5, 5}, 5),
                Arguments.of(new int[]{7, 7, 5, 7, 5, 1, 5, 7, 9, 3, 6, 6, 2, 3, 3, 67, 12, 21, 41, 14, 22, 53, 63, 544, 27, 52, 74, 55, 234, 5, 5, 7, 7, 7, 7, 7, 7}, 7),
                Arguments.of(new int[]{7, 7, 5, 7, 5, 1, 5, 7, 9,8,8, 8, 6,7}, 7),
                Arguments.of(new int[]{2, 2, 1, 1, 1, 2, 2}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void test(int[] arr, int answer) {
        //given
        MajorityElement test = new MajorityElement();
        //when
        int result = test.majorityElement(arr);
        //then
        assertEquals(result, answer);
    }

}