import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet",urlPatterns = "/calculate")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float firstOpera = Integer.parseInt(request.getParameter("firstOperand"));
        float secondOpera = Integer.parseInt(request.getParameter("secondOperand"));
        char operator = request.getParameter("operator").charAt(0);
        PrintWriter writer = response.getWriter();
        writer.println("<html/>");
        writer.println("<h1>Result:</h1>");
        try {
            float result = Calculator.calculator(firstOpera,secondOpera,operator);
            writer.println(firstOpera + " " + operator + " " + secondOpera + " = " + result);
        }catch (Exception ex){
            writer.println("Erro" + ex.getMessage());
        }
        writer.println("<html/>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
