package testSumarNumeros;

import static org.junit.Assert.*;

import org.junit.Test;

import sumarNumeros.Sum;

public class TestSum {
	
	@Test
	public void testSum3NumPosAndNeg() {
		assertEquals(6, Sum.sum3numeros(2, 1, 3));

	}
	
	@Test
	public void testSumNumerosPosAndNeg() {
		assertEquals(11, Sum.sumNumeros(1, 2, 3, 5));
		assertEquals(0, Sum.sumNumeros(1, 2, -3, 0));
		assertEquals(-8, Sum.sumNumeros(-1, -2, -3, -2));


	}

}
