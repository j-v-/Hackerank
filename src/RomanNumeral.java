import java.util.HashMap;
import java.util.Map;

/**
 * Gets Roman numeral equivalent for any number < 4000
 *
 * @author jeavydsouza on 20/11/2017.
 */
public class RomanNumeral {
    private static Map<Integer, String> numerals;
    private static int[] den = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

    static{
        numerals = new HashMap<Integer, String>();
        numerals.put(1, "I");
        numerals.put(4, "IV");
        numerals.put(5, "V");
        numerals.put(9, "IX");
        numerals.put(10, "X");
        numerals.put(40, "XL");
        numerals.put(50, "L");
        numerals.put(90, "XC");
        numerals.put(100, "C");
        numerals.put(400, "CD");
        numerals.put(500, "D");
        numerals.put(900, "CM");
        numerals.put(1000, "M");
    }

    public String findRomanEquivalent(int n){
        if ( n <= 0 || n >= 4000 )
            return "Number needs to be in range 1 < n < 4000";
        StringBuffer sb = new StringBuffer();
        for(int i = den.length-1; i >= 0; i--){
            while(n >= den[i] ){
                sb.append(numerals.get(den[i]));
                n -= den[i];
            }
        }
        return sb.toString();
    }
}
