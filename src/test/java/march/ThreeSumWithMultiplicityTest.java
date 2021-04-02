package march;

import com.javamultiplex.march.ThreeSumWithMultiplicity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 23/03/21 11:22 pm
 * @copyright www.javamultiplex.com
 */
public class ThreeSumWithMultiplicityTest {

    @Test
    public void shouldFind3Sum() {
        assertEquals(20, ThreeSumWithMultiplicity.threeSumMulti(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5}, 8));
        assertEquals(12, ThreeSumWithMultiplicity.threeSumMulti(new int[]{1, 1, 2, 2, 2, 2}, 5));
    }
}
