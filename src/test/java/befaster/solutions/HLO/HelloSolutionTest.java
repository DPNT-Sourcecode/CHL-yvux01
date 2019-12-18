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
    public void shouldReturnHelloWorldWithFirstName() {
        String friendName = "Craftsman";
        assertThat(hlo.hello(friendName), equalTo("Hello, Craftsman!"));
    }

    @Test
    public void shouldReturnFallbackHelloWorldWithNullFirstName() {
        String friendName = null;
        assertThat(hlo.hello(friendName), equalTo("Hello, World!"));
    }
}




