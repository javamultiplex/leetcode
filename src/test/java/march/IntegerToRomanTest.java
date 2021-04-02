package march;

import com.javamultiplex.march.IntegerToRoman;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 12/03/21 11:22 pm
 * @copyright www.javamultiplex.com
 */
public class IntegerToRomanTest {

    @Test
    public void shouldConvertIntToRoman() {
        assertEquals("V", IntegerToRoman.intToRoman(5));
        assertEquals("XV", IntegerToRoman.intToRoman(15));
        assertEquals("XXIII", IntegerToRoman.intToRoman(23));
        assertEquals("XXXIX", IntegerToRoman.intToRoman(39));
        assertEquals("XLIV", IntegerToRoman.intToRoman(44));
        assertEquals("LXXIII", IntegerToRoman.intToRoman(73));
    }
}
