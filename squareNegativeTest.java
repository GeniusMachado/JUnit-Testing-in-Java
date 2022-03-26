package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareNegativeTest {

	@Test
	public void test() {
		JunitTesting junit = new JunitTesting();
		int answer = junit.square(5);
		assertEquals(10,answer);
	}

}
