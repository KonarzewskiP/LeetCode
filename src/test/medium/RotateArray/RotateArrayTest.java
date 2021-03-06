package medium.RotateArray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateArrayTest {

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7}, 3, new int[]{5, 6, 7, 1, 2, 3, 4}),
                Arguments.of(new int[]{-1, -100, 3, 99}, 2, new int[]{3, 99, -1, -100})
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void test(int[] numArr, int k, int[] expectedArr) {
        //given
        RotateArray test = new RotateArray();
        //when
        test.rotate(numArr, k);
        //then
        assertArrayEquals(expectedArr, numArr);
    }
}