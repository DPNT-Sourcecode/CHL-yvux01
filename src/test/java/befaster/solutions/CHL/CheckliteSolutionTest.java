package befaster.solutions.CHL;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class CheckliteSolutionTest {

    private CheckliteSolution chl;

    @Before
    public void setUp() throws Exception {
        chl = new CheckliteSolution();
    }

    @Test
    public void shouldReturnNegativeOneOnNull() {
        assertThat(chl.checklite(null), equalTo(-1));
    }

    @Test
    public void shouldReturnNegativeOneOnIllegalSku() {
        assertThat(chl.checklite("E"), equalTo(-1));
    }

    @Test
    public void shouldCalculateDSkus() {
        assertThat(chl.checklite("DD"), equalTo(30));
    }

    @Test
    public void shouldCalculateCSkus() {
        assertThat(chl.checklite("CC"), equalTo(40));
    }

    @Test
    public void shouldCalculateBSkus() {
        assertThat(chl.checklite("BBB"), equalTo(75));
    }

    @Test
    public void shouldCalculateASkus() {
        assertThat(chl.checklite("AAAA"), equalTo(180));
    }

    @Test
    public void shouldCalculateAllSkusNoOffers() {
        assertThat(chl.checklite("CDBA"), equalTo(115));
    }

    @Test
    public void shouldCalculateAllSkusWithOffers() {
        assertThat(chl.checklite("BABAA"), equalTo(175));
    }

    @Test
    public void shouldCalculateFiveOrMoreASkus() {
        assertThat(chl.checklite("AAAAAAAAA"), equalTo(380));
    }

    @Test
    public void shouldCalculateFreeBSkuWith2ESkus() {
        assertThat(chl.checklite("EEEEBB"), equalTo(160));
    }
}