import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuipuTest {

    protected Quipu solution;

    @Before
    public void setUp() {
        solution = new Quipu();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String knots = "-XX-XXXX-XXX-";

        int expected = 243;
        int actual = solution.readKnots(knots);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String knots = "-XX--XXXX---XXX-";

        int expected = 204003;
        int actual = solution.readKnots(knots);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String knots = "-X-";

        int expected = 1;
        int actual = solution.readKnots(knots);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String knots = "-X-------";

        int expected = 1000000;
        int actual = solution.readKnots(knots);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String knots = "-XXXXXXXXX--XXXXXXXXX-XXXXXXXXX-XXXXXXX-XXXXXXXXX-";

        int expected = 909979;
        int actual = solution.readKnots(knots);

        Assert.assertEquals(expected, actual);
    }

}
