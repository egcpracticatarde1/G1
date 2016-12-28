package testSumarNumeros;

import static org.junit.Assert.*;

import org.junit.Test;

import sumarNumeros.Substract;

public class TestSub {
	
	@Test
	public void testSub2NumPosAndNeg() {
		assertEquals(6, Substract.sub2numeros(7, 1));
	}
	
	@Test
	public void testSubNumerosPosAndNeg() {
		assertEquals(1, Substract.subNumeros(10,8,1));
		assertEquals(-1, Substract.subNumeros(10,5,6));
		


	}

}
