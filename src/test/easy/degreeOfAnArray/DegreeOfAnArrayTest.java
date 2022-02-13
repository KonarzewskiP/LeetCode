package easy.degreeOfAnArray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DegreeOfAnArrayTest {


    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{1,2,2,3,1}, 2),
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{1,2,2,3,1,4,2}, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void test(int[] numArr, int answer) {
        //given
        DegreeOfAnArray test = new DegreeOfAnArray();
        //when
        int result = test.findShortestSubArray(numArr);
        //then
        assertEquals(answer, result);
    }

}