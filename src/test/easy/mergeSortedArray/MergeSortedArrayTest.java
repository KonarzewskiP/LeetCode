package easy.mergeSortedArray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3, new int[]{1,2,2,3,5,6}),
                Arguments.of(new int[]{1}, 1, new int[]{}, 0, new int[]{1}),
                Arguments.of(new int[]{0}, 0, new int[]{1}, 1, new int[]{1})
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void test(int[] nums1, int m, int[] nums2, int n, int[] expected) {
        //given
        MergeSortedArray test = new MergeSortedArray();
        //when
        int[] result = test.merge(nums1,m,nums2,n);
        //then
        assertArrayEquals(result, expected);
    }

}