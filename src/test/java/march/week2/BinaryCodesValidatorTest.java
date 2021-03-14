package march.week2;

import com.javamultiplex.march.week2.BinaryCodesValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Rohit Agarwal on 14/03/21 3:28 pm
 * @copyright www.javamultiplex.com
 */
public class BinaryCodesValidatorTest {
    @Test
    public void shouldValidateBinaryCodes_method1() {
        assertTrue(BinaryCodesValidator.method1("00110110", 2));
        assertTrue(BinaryCodesValidator.method1("00110", 2));
        assertTrue(BinaryCodesValidator.method1("0110", 1));
        assertFalse(BinaryCodesValidator.method1("0110", 2));
        assertFalse(BinaryCodesValidator.method1("0000000001011100", 4));
    }

    @Test
    public void shouldValidateBinaryCodes_method2() {
        assertTrue(BinaryCodesValidator.method2("00110110", 2));
        assertTrue(BinaryCodesValidator.method2("00110", 2));
        assertTrue(BinaryCodesValidator.method2("0110", 1));
        assertFalse(BinaryCodesValidator.method2("0110", 2));
        assertFalse(BinaryCodesValidator.method2("0000000001011100", 4));
    }
}
