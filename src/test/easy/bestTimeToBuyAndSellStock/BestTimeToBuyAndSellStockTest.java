package easy.bestTimeToBuyAndSellStock;

import easy.degreeOfAnArray.DegreeOfAnArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{7,1,5,3,6,4}, 5),
                Arguments.of(new int[]{7,6,4,3,1}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void test(int[] numArr, int answer) {
        //given
        BestTimeToBuyAndSellStock test = new BestTimeToBuyAndSellStock();
        //when
        int result = test.maxProfit(numArr);
        //then
        assertEquals(answer, result);
    }

}