package befaster.solutions.HLO;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class HelloSolutionTest {

    private HelloSolution hlo;

    @Before
    public void setUp() throws Exception {
        hlo = new HelloSolution();
    }

    @Test
    public void shouldReturnHelloWorld() {
        assertThat(hlo.hello("foobar"), equalTo("Hello, World"));
    }
}

