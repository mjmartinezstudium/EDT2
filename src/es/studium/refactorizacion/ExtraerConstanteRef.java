package es.studium.refactorizacion;

public class ExtraerConstanteRef {
	//Refactorizada la cadena "El factorial de " como constante
	private static final String TEXTO = "El factorial de ";

	public static void main(String[] args) {
		int numero = 3;
		//Refactorizada la cadena "El factorial de " como constante
		System.out.println(TEXTO + numero + " es " + calcularFactorial(numero));
		numero = 5;
		System.out.println(TEXTO + numero + " es " + calcularFactorial(numero));
	}

	public static double calcularFactorial(double n) {
		if (n == 0) {
			return 1;
		} else {
			double resultado = n * calcularFactorial(n - 1);
			return resultado;
		}
	}

}
