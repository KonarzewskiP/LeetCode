package medium.HouseRobber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HouseRobberTest {

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 1}, 4),
                Arguments.of(new int[]{9, 2, 3, 4, 2, 9, 1}, 22),
                                        // 9, 3, 2, 1
                                        // 2, 4, 9
                Arguments.of(new int[]{5}, 5),
                Arguments.of(new int[]{2, 7, 9, 3, 1}, 12)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void test(int[] arr, int expected) {
        //given
        HouseRobber test = new HouseRobber();
        //when
        int result = test.rob(arr);
        //then
        assertEquals(expected, result);
    }
}