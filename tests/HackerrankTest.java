import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author jeavydsouza on 21/11/2017.
 */
public class HackerrankTest {

    @Test
    public void testSemiPrime(){
        assertEquals(true, new SemiPrime().run(629));
    }

    @Test
    public void testUnpaired(){
        assertEquals(6, new Unpaired().run(new int[]{2, 4, 6, 4, 2}));
    }

    @Test
    public void testRomanNumerals(){
        assertEquals("MMXIV", new RomanNumeral().findRomanEquivalent(2014));
    }

    @Test
    public void testMaximumSubarray(){
        assertEquals(6, new MaximumSubArray().maxKadaneSubarray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        assertEquals(-2, new MaximumSubArray().maxKadaneSubarray(new int[]{-2,-10,-4}));
    }
}
