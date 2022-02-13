package easy.romanToInteger;

import java.util.HashMap;

public class RomanToInteger {

    public int romanToInt(String s) {
        HashMap<Character, Integer> romanNumber = new HashMap<>();
        romanNumber.put('I', 1);
        romanNumber.put('V', 5);
        romanNumber.put('X', 10);
        romanNumber.put('L', 50);
        romanNumber.put('C', 100);
        romanNumber.put('D', 500);
        romanNumber.put('M', 1000);

        char[] chars = s.toCharArray();
        int total = romanNumber.get(chars[0]);
        for (int i = 1; i < chars.length; i++) {

            if (romanNumber.get(chars[i]) > romanNumber.get(chars[i - 1])) {
                total += (romanNumber.get(chars[i])) - (2 * romanNumber.get(chars[i - 1]));
            } else {
                total += romanNumber.get(chars[i]);
            }
        }
        return total;
    }
}
