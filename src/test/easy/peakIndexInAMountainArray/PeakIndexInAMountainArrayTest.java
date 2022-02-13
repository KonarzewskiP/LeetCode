package easy.peakIndexInAMountainArray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PeakIndexInAMountainArrayTest {


    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 0}, 1),
                Arguments.of(new int[]{0, 2, 1, 0}, 1),
                Arguments.of(new int[]{0, 10, 5, 2}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void test(int[] arr, int rightIndex) {
        //given
        PeakIndexInAMountainArray test = new PeakIndexInAMountainArray();
        //when
        int result = test.peakIndexInMountainArray(arr);
        //then
        assertEquals(result, rightIndex);
    }

}