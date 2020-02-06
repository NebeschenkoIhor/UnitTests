package Tests;


import Calculation.Arithmetics;
import org.junit.*;
import org.junit.rules.ExpectedException;

public class TestArithmetics {
    private static Arithmetics a;
    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @BeforeClass
    public static void createObject() {
        a = new Arithmetics();
    }

    @AfterClass
    public static void deleteObj() {
        a = null;
    }

    @Ignore
    @Test
    public void testAdd() {
        double res = a.add(3, 7);
        Assert.assertTrue(res == 10);
    }

    @Test
    public void testDeduct() {
        double res = a.deduct(3, 7);
        Assert.assertFalse("method deduct() fails test", res == 4);
    }

    @Test
    public void testMult() {
        double res = a.mult(3, 7);
        Assert.assertTrue(res == 21);
    }

    @Test(timeout = 1000)
    public void testTime() {
        a.mult(3, 7);
    }

    @Test
    public void testDiv() {
        double res = a.div(21, 7);
        Assert.assertTrue(res == 3);
    }

    @Test
    public void testDivException() {
        exp.expect(ArithmeticException.class);
        a.div(10.0, 0.0);
    }

    @Test
    public void testObj() {
        Assert.assertNotNull(a);
    }


}
