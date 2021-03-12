package march.week2;

import com.javamultiplex.march.week2.Problem4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 12/03/21 11:22 pm
 * @copyright www.javamultiplex.com
 */
public class Problem4Test {

    @Test
    public void shouldConvertIntToRoman() {
        assertEquals("V", Problem4.intToRoman(5));
        assertEquals("XV", Problem4.intToRoman(15));
        assertEquals("XXIII", Problem4.intToRoman(23));
        assertEquals("XXXIX", Problem4.intToRoman(39));
        assertEquals("XLIV", Problem4.intToRoman(44));
        assertEquals("LXXIII", Problem4.intToRoman(73));
    }
}
