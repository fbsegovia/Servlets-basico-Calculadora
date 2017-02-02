package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.negocio.GestorOperaciones;

/**
 * Servlet implementation class CalculadoraServlet
 */
public class CalculadoraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculadoraServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet -> Recibiendo datos");
		
		String num1 = request.getParameter("numero1");
		String num2 = request.getParameter("numero2");
		String operaciones = request.getParameter("operacion");
		
		System.out.println(num1+" , "+num2+" , "+operaciones);
		
		double number1 = Integer.parseInt(num1);
		double number2 = Integer.parseInt(num2);
		int operacion = Integer.parseInt(operaciones);
		
		GestorOperaciones go = new GestorOperaciones();
		double resultado = 0;
		if(operacion == 0){
			resultado = go.suma(number1,number2);
		}else if(operacion == 1){
			resultado = go.resta(number1,number2);
		}else if(operacion==2){
			resultado = go.multiplicacion(number1,number2);
		}else if(operacion==3){
			resultado = go.division(number1,number2);
		}
		
		PrintWriter pw = response.getWriter();
			pw.println("El resultado es "+resultado);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
