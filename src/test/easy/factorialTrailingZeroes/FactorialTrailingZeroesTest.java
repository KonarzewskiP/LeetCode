package easy.factorialTrailingZeroes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTrailingZeroesTest {

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(30, 7),
                Arguments.of(5, 1),
                Arguments.of(0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void test(int factorial, int answer) {
        //given
        FactorialTrailingZeroes test = new FactorialTrailingZeroes();
        //when
        int result = test.trailingZeroes(factorial);
        //then
        assertEquals(result, answer);
    }

}