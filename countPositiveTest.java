package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class countPositiveTest {

	@Test
	public void test() {
		JunitTesting junit = new JunitTesting();
		int answer = junit.count("Alpha");
		assertEquals(2,answer);
	}

}
