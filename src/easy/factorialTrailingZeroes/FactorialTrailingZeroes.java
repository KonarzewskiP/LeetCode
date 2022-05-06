package easy.factorialTrailingZeroes;

import java.math.BigInteger;

public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        if (n <= 0) return 0;
        BigInteger number = factorial(n);
        int counter = 0;
        while (number.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            counter++;
            number = number.divide(BigInteger.TEN);
        }
        return counter;
    }

    private BigInteger factorial(int num) {
        BigInteger total = BigInteger.valueOf(num);
        while (--num > 0) {
            total = total.multiply(BigInteger.valueOf(num));
        }
        return total;
    }
}
