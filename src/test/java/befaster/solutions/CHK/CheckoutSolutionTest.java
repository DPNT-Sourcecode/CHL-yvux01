package befaster.solutions.CHK;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class CheckoutSolutionTest {

    private CheckoutSolution chk;

    @Before
    public void setUp() throws Exception {
        chk = new CheckoutSolution();
    }

    @Test
    public void shouldReturnNegativeOneOnNull() {
        assertThat(chk.checkout(null), equalTo(-1));
    }

    @Test
    public void shouldReturnNegativeOneOnIllegalSku() {
        assertThat(chk.checkout("E"), equalTo(-1));
    }

    @Test
    public void shouldCalculateDSkus() {
        assertThat(chk.checkout("DD"), equalTo(30));
    }

    @Test
    public void shouldCalculateCSkus() {
        assertThat(chk.checkout("CC"), equalTo(40));
    }

/**
 * +------+-------+----------------+
 * | Item | Price | Special offers |
 * +------+-------+----------------+
 * | A    | 50    | 3A for 130     |
 * | B    | 30    | 2B for 45      |
 * | C    | 20    |                |
 * | D    | 15    |                |
 * +------+-------+----------------+
 *
 * */

    @Test
    public void shouldCalculateBSkus() {
        assertThat(chk.checkout("BBB"), equalTo(75));
    }

    @Test
    public void shouldCalculateASkus() {
        assertThat(chk.checkout("AAAA"), equalTo(180));
    }

    @Test
    public void shouldCalculateAllSkusNoOffers() {
        assertThat(chk.checkout("ABCD"), equalTo(115));
    }
}