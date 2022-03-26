package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class squarePositiveTest {

	@Test
	public void test() {
		JunitTesting junit = new JunitTesting();
		int answer = junit.square(5);
		assertEquals(25,answer);
	}

}
