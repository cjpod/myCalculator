package Tests;

import static org.junit.Assert.*;
import ie.gcd.maths.ScientificCalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ScientificCalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		ScientificCalculator c = new ScientificCalculator();
		assertEquals(5,c.add(2, 3));
	}

}
