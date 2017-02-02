package modelo.entidades;

public class Operacion {

		private int numero1;
		private int numero2;
		private String tipoOperacion;
		private double resultado;
		
		
		public int getNumero1() {
			return numero1;
		}
		public void setNumero1(int numero1) {
			this.numero1 = numero1;
		}
		public int getNumero2() {
			return numero2;
		}
		public void setNumero2(int numero2) {
			this.numero2 = numero2;
		}
		public String getTipoOperacion() {
			return tipoOperacion;
		}
		public void setTipoOperacion(String tipoOperacion) {
			this.tipoOperacion = tipoOperacion;
		}
		public double getResultado() {
			return resultado;
		}
		public void setResultado(double resultado) {
			this.resultado = resultado;
		}
		@Override
		public String toString() {
			return "Operacion [numero1=" + numero1 + ", numero2=" + numero2 + ", tipoOperacion=" + tipoOperacion
					+ ", resultado=" + resultado + "]";
		}

		
}
