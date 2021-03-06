package easy.validParentheses;

import easy.romanToInteger.RomanToInteger;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("()", true),
                Arguments.of("()[]{}", true),
                Arguments.of("(]", false)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void test(String testValue, boolean answer) {
        //given
        Solution test = new Solution();
        //when
        boolean result = test.isValid(testValue);
        //then
        assertEquals(result, answer);
    }
}