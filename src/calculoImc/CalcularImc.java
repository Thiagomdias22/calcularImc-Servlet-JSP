package calculoImc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcularImc
 */
@WebServlet("/CalcularImc")
public class CalcularImc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcularImc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
response.setContentType("text/html;charset=UTF-8");
		
		double peso= Double.parseDouble(request.getParameter("peso"));
		double altura=Double.parseDouble(request.getParameter("altura"));
		
		try (PrintWriter out = response.getWriter()){
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet meuServ</title>");
			out.println("</head>");
			out.println("<body>");
			double imc = peso/(altura*altura);
			if(imc < 18.5) {
				out.println("<h2>RESULTADO: Magreza</h2>");
				out.println("<h4>Sinto muito, seu IMC é "+String.format("%.2f", imc)+" Kg/m2 e você precisa ganhar peso!</h4>");
			}
			else if(imc >= 18.5 && imc < 24.9) {
				out.println("<h2>RESULTADO: Normal</h2>");
				out.println("<h4>Parabéns, seu IMC é "+String.format("%.2f", imc)+" Kg/m2 e você está dentro do peso adequado!</h4>");
			}
			else if(imc >= 24.9 && imc < 30) {
				out.println("<h2>RESULTADO: Sobrepeso</h2>");
				out.println("<h4>Sinto muito, seu IMC é "+String.format("%.2f", imc)+" Kg/m2 e por isso você está acima do peso e deveria emagrecer!</h4>");
			}
			else if(imc >= 30) {
				out.println("<h2>RESULTADO: Obesidade</h2>");
				out.println("<h4>Sinto muito, seu IMC é "+String.format("%.2f", imc)+" Kg/m2 e por isso você está acima do peso e deveria emagrecer!</h4>");
			}
			out.println("</body>");
			out.println("</html>");
		}
	}
}
