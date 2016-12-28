package testSumarNumeros;

import static org.junit.Assert.*;

import org.junit.Test;

import sumarNumeros.Sum;

public class TestSum {
	
	@Test
	public void testSum2NumPosAndNeg() {
		assertEquals(6, Sum.sum(2, 1, 3));
		assertEquals(-11, Sum.sum(-10, -1, 0));
		assertEquals(-14, Sum.sum(-10, -1, -3));

	}

}
