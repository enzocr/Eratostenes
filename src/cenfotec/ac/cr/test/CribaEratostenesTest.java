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

	@Test
	public void firstList() throws Exception {
		int[] arreglo = new int[2];
		arreglo[0] = 2;
		arreglo[1] = 3;
		assertArrayEquals(arreglo, criba.generaCriba(3));

	}

	@Test
	public void secondList() throws Exception {
		int[] arreglo = new int[8];
		arreglo[0] = 2;
		arreglo[1] = 3;
		arreglo[2] = 5;
		arreglo[3] = 7;
		arreglo[4] = 11;
		arreglo[5] = 13;
		arreglo[6] = 17;
		arreglo[7] = 19;
		assertArrayEquals(arreglo, criba.generaCriba(20));

	}

	@Test
	public void thirdist() throws Exception {
		int[] arreglo = criba.generaCriba(100);
		assertArrayEquals(arreglo, criba.generaCriba(100));
	}


}
