import junit.framework.TestCase;

/*
 * Esta clase ejecuta la prueba unitaria de la suma
 */
public class TestSumar extends TestCase{
	private Sumadora sum;
	public void init() {
		sum = new Sumadora();
	}
	public void testsumar() {
		init();
		assertEquals(4, sum.sumar(1, 3));
	}
}
