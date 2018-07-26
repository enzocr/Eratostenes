package cenfotec.ac.cr.logica;

public class CribaEratostenes {

	static boolean[] primo;

	public CribaEratostenes() {

	}

	public int[] generaCriba(int tope) throws Exception {

		if (isValid(tope)) {

			return empezarCriba(tope);
		} else {
			return new int[0];
		}

	}

	public boolean isValid(int tope) throws Exception {
		if (tope >= 2) {
			return true;
		} else {
			if (tope == 0) {
				return false;
			} else {
				throw new Exception("NUMEROS NEGATIVOS NO PERMITIDOS");
			}
		}
	}

	private static int[] empezarCriba(int tope) {
		int[] primos;
		int dim = tope + 1;

		inicializarArreglo(dim);
		setCeroyUno();
		marcarPares(dim);

		primos = new int[contarPrimos(dim)];

		for (int i = 0, j = 0; i < dim; i++) {
			if (primo[i])
				primos[j++] = i;
		}
		return primos;
	}

	private static void inicializarArreglo(int dim) {
		primo = new boolean[dim];

		for (int i = 0; i < dim; i++) {
			primo[i] = true;
		}
	}

	private static void setCeroyUno() {
		primo[0] = primo[1] = false;
	}

	private static void marcarPares(int dim) {
		for (int i = 2; i < Math.sqrt(dim) + 1; i++) {
			if (primo[i]) {
				for (int j = 2 * i; j < dim; j += i) {
					primo[j] = false;
				}
			}
		}
	}

	private static int contarPrimos(int dim) {

		int cuenta = 0;

		for (int i = 0; i < dim; i++) {
			if (primo[i])
				cuenta++;
		}
		return cuenta;
	}

}
