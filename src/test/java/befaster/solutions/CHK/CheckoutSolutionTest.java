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
}