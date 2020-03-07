package McParland.Krista.Chapter6.Java.Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMathTest {

	@Test
	public void testThatZeroNumeratorReturnsZero() {
		SimpleMath cat = new SimpleMath();
		assertEquals(0, cat.divide(0,7),.001);
	}
	@Test
	public void testThatSmallerNumeratorReturnsDecimalValue() {
		SimpleMath cat = new SimpleMath();
		assertEquals(.25, cat.divide(1,4),.001);
	}
	@Test(expected=ArithmeticException.class)
	public void testThatZeroDenominatorThrowsException() {
		SimpleMath cat = new SimpleMath();
		cat.divide(6,0);
	}
}
