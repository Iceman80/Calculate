import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CalculateTest {

    @Before
    public void setUp() throws Exception {

    }


    @Test
    public void testCalA() throws Exception {
        Calculate calculate = new Calculate();
        int n = calculate.calA(2, 2);

        assertEquals("Ошибка в сложении", 4, n);


    }

    @Test
    public void testCalA1() throws Exception {
        Calculate calculate = new Calculate();
        int n = calculate.calA(0, 2);

        assertNotNull("Not null", n);
    }

    @Test
    public void testCalA2() throws Exception {
        Calculate calculate = new Calculate();
        int n = calculate.calA(-2, 2);

        assertNotNull("Not null", n);
    }

    @Test
    public void testCalS() throws Exception {
        Calculate calculate = new Calculate();
        int n = calculate.calS(-2, 2);

        assertTrue(n < 0);

    }

    @Test
    public void testCalS1() throws Exception {
        Calculate calculate = new Calculate();
        int n = calculate.calS(2, -2);

        assertEquals(4, n);
    }

    @Test
    public void testCalS2() throws Exception {
        Calculate calculate = new Calculate();
        int n = calculate.calS(0, -2);

        assertEquals(2, n);
    }

    @Test(timeout = 10)
    public void testCalS3() throws Exception {
        Calculate calculate = new Calculate();
        int n = calculate.calS(1000, 50);

        assertEquals(950, n);
    }

    @Test
    public void testCalM() throws Exception {
        Calculate calculate = new Calculate();
        int n = calculate.calM(0, 1);

        assertEquals("*0", 0, n);
    }

    @Test(timeout = 10)
    public void testCalM1() throws Exception {
        Calculate calculate = new Calculate();
        int n = calculate.calM(0, 0);

        assertNotNull(n);
    }

    @Test
    public void testCal2() throws Exception {
        Calculate calculate = new Calculate();
        int n = calculate.calM(15, -1);
        assertTrue(n < 0);
        assertEquals("-", -15, n);
    }

    @Test
    public void testCalD() throws Exception {
        Calculate calculate = new Calculate();
        int n = calculate.calD(15, 3);

        assertEquals("/", 5, n);
    }

    @Test
    public void testCalD1() throws Exception {
        Calculate calculate = new Calculate();
        int n = calculate.calD(15, 15);

        assertEquals("/", 1, n);
    }

    @Test
    public void testCalD2() throws Exception {
        Calculate calculate = new Calculate();
        int n = calculate.calD(15, 0);

        assertEquals("/0", 0, n);
    }

    @Test
    public void testCalD3() throws Exception {
        Calculate calculate = new Calculate();
        int n = calculate.calD(15, -5);

        assertEquals("/-", -3, n);
    }

    @Test
    public void testCalD4() throws Exception {
        Calculate calculate = new Calculate();
        int n = calculate.calD(0, 9);

        assertTrue(n == 0);
    }

    @After
    public void tearDown() throws Exception {

    }
}