package modelo.negocio;

public class GestorOperaciones {

	
	public double suma(double number1, double number2) {
		double resultado = number1+number2;
		return resultado;
	}
	
	public double resta(double number1, double number2) {
		double resultado = number1-number2;
		return resultado;
	}
	
	public double multiplicacion(double number1, double number2) {
		double resultado = number1*number2;
		return resultado;
	}
	
	public double division(double number1, double number2) {
		double resultado = number1/number2;
		return resultado;
	}
	
}
