package cenfotec.ac.cr.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CribaEratostenesTest {

	static CribaEratostenes criba;

	@Before
	public void init() {
		criba = new CribaEratostenes();
	}

	@Test(expected = Throwable.class)
	public void isCero() throws Exception {
		int[] arreglo = new int[1];
		arreglo[0] = 0;
		assertArrayEquals(arreglo, criba.generaCriba(0));
	}

	@Test
	public void validNumber() throws Exception {
		assertTrue(criba.isValid(8));

	}

	@Test(expected = Exception.class)
	public void isNegative() throws Exception {
		assertFalse(criba.isValid(-1));

	}

}
