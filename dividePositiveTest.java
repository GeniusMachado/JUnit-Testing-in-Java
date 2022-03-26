package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class dividePositiveTest {

	@Test
	public void test() {
		JunitTesting junit = new JunitTesting();
		double answer = junit.divide(50, 5);
		assertEquals(10,answer,0);
	}

}
