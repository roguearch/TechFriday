package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathTest {
	Math math;
	
	@BeforeEach
	void setUp() throws Exception {
		math = new Math();
	}

	@Test
	void testAdd() {
		int result = 5 + 6 + (-20);
		assertEquals(result, math.add(5, 6, -20));
	}

	@Test
	void testSubtract() {
		fail("Not yet implemented");
	}

}
