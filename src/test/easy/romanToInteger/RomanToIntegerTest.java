package easy.romanToInteger;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("III", 3),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void test(String romanNumber, int answer) {
        //given
        RomanToInteger test = new RomanToInteger();
        //when
        int result = test.romanToInt(romanNumber);
        //then
        assertEquals(result, answer);
    }

}