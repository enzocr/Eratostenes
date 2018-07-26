package cenfotec.ac.cr.logica;

public class CribaEratostenes {

	static boolean[] primo;

	public CribaEratostenes() {

	}

	public static int[] generaCriba(int tope) {
		int i, j;
		if (tope >= 2) {
			int dim = tope + 1;
			inicializarArreglo(dim);

			for (i = 0; i < dim; i++) {
				primo[i] = true;
			}
			primo[0] = primo[1] = false;
			for (i = 2; i < Math.sqrt(dim) + 1; i++) {
				if (primo[i]) {
					for (j = 2 * i; j < dim; j += i) {
						primo[j] = false;
					}
				}
			}
			int cuenta = 0;

			for (i = 0; i < dim; i++) {
				if (primo[i])
					cuenta++;
			}
			int[] primos = new int[cuenta];
			for (i = 0, j = 0; i < dim; i++) {
				if (primo[i])
					primos[j++] = 1;
			}

			return primos;
		} else {
			return new int[0];
		}

	}

	private static void inicializarArreglo(int dim) {
		primo = new boolean[dim];

		for (int i = 0; i < dim; i++) {
			primo[i] = true;
		}
	}

}
