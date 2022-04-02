package controller;
import model.Prime;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeSer
 */
@WebServlet("/PrimeSer")
public class PrimeSer extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public PrimeSer() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("view.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Prime obj=new Prime();
		obj.setNumber(Integer.parseInt(request.getParameter("txtnum")));
		int num=obj.getNumber();
		int i=1,count=0;
		while(i<=num)
		{
			if(num%i==0)
			{
				count++;
			}
			i++;
		}
		if(count==2)
		{
			response.sendRedirect("view.jsp?q="+"prime");
		}
		else
		{
			response.sendRedirect("view.jsp?q="+"not prime");
		}
	}

}
