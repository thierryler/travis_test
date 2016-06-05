package com.thi.travis;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculetteTest {

	private Calculette calc;

	@Before
	public void setUp() {
		calc = new Calculette();
	}

	@Test
	public void testAdd() {
		// Arrange
		final int a = 1;
		final int b = 2;
		final int expected = 3;

		// Act
		final int result = calc.add(a, b);

		// Assert
		Assert.assertEquals(expected, result);
	}

}
