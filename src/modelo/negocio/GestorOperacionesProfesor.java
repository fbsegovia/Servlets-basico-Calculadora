package modelo.negocio;

import modelo.entidades.Operacion;

public class GestorOperacionesProfesor {
	
	boolean hayError = false;

	public Operacion sumar (int n1, int n2) {
		Operacion operacion = new Operacion();
		operacion.setNumero1(n1);
		operacion.setNumero1(n1);
		operacion.setTipoOperacion("SUMAR");
		operacion.setResultado(n1+n2);
		return operacion;
	}
	
	public Operacion restar (int n1, int n2) {
		Operacion operacion = new Operacion();
		operacion.setNumero1(n1);
		operacion.setNumero1(n1);
		operacion.setTipoOperacion("SUMAR");
		operacion.setResultado(n1-n2);
		return operacion;
	}
	
	public Operacion multiplicar (int n1, int n2) {
		Operacion operacion = new Operacion();
		operacion.setNumero1(n1);
		operacion.setNumero1(n1);
		operacion.setTipoOperacion("MULTIPLICAR");
		operacion.setResultado(n1*n2);
		return operacion;
	}
	
	public Operacion dividir (int n1, int n2) throws Exception {
		Operacion operacion = new Operacion();
		operacion.setNumero1(n1);
		operacion.setNumero1(n1);
		operacion.setTipoOperacion("DIVIDIR");
		try{
			double resultado = n1/n1;
			operacion.setResultado(resultado);
		}catch (Exception e) {
			System.out.println("No se puede dividir por 0");
			throw e;
		}
		return operacion;
	}
	
	
}
