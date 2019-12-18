package befaster.solutions.SUM;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumSolutionTest {
    private SumSolution sum;

    @Before
    public void setUp() {

        sum = new SumSolution();
    }

    @Test
    public void compute_sum() {
        assertThat(sum.compute(1, 1), equalTo(2));
    }

    @Test
    public void shouldComputeMinimalSum() {
        assertThat(sum.compute(0, 0), equalTo(0));
    }

    @Test
    public void shouldComputeMaximumSum() {
        assertThat(sum.compute(100, 100), equalTo(200));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAcceptNegativeFirstArgument() {
        sum.compute(-1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAcceptNegativeSecondArgument() {
        sum.compute(1, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldBeLessThan101FirstArgument() {
        sum.compute(101, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldBeLessThan101SecondArgument() {
        sum.compute(0, 101);
    }

}




