package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class divideNegativeTest {

	@Test
	public void test() {
		JunitTesting junit = new JunitTesting();
		double answer = junit.divide(50, 5);
		assertEquals(15,answer,0);
	}

}
