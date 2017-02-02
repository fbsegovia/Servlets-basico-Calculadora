package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Catch;

import modelo.entidades.Operacion;
import modelo.negocio.GestorOperaciones;
import modelo.negocio.GestorOperacionesProfesor;

/**
 * Servlet implementation class CalculadoraServletProfesor
 */
public class CalculadoraServletProfesor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculadoraServletProfesor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sNumero1 = request.getParameter("numero1");
		String sNumero2 = request.getParameter("numero2");
		String tipoOperacion = request.getParameter("operacion");
		int iNumero1 = Integer.parseInt(sNumero1);
		int iNumero2 = Integer.parseInt(sNumero2);
		GestorOperacionesProfesor gop = new GestorOperacionesProfesor();
		Operacion op = null;
		boolean hayError = false;
		
		switch (tipoOperacion) {
		case "SUMAR":
			op = gop.sumar(iNumero1,iNumero2);
			break;
		case "RESTAR":
			op = gop.restar(iNumero1,iNumero2);
			break;
		case "MULTIPLICAR":
			op = gop.multiplicar(iNumero1,iNumero2);
			break;
		case "DIVIDIR":
			try{
				op = gop.dividir(iNumero1,iNumero2);
			}catch (Exception e){
				hayError = true;
			}
			break;
		default:
			break;
		}
		
		PrintWriter pw = response.getWriter();
		if(!hayError){
			pw.println("<p>El tipo de operacion ha sido "+op.getTipoOperacion()+" el numero 1 ha sido "+op.getNumero1()+
					" el numero 2 ha sido "+ op.getNumero2()+" el resultado ha sido "+op.getResultado()+"</p>");
		}else{
			pw.println("<p style='color:red'>Ha introducido mal algún dato</p>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
