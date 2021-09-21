package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TempConverter;

/**
 * Servlet implementation class getTempServlet
 */
@WebServlet("/getTempServlet")
public class getTempServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTempServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TempConverter pojo = new TempConverter();
		pojo.setTempSelection(request.getParameter("userTemp"));
		if(pojo.getTempSelection().equalsIgnoreCase("F")) {
			request.setAttribute("temperature", pojo);
			getServletContext().getRequestDispatcher("/fahrenheit.jsp").forward(request, response);
			
			PrintWriter writer = response.getWriter();
			writer.println(pojo.toString());
			writer.close();
		} else if(pojo.getTempSelection().equalsIgnoreCase("C")) {
			request.setAttribute("temperature", pojo);
			getServletContext().getRequestDispatcher("/celsius.jsp").forward(request, response);
			
			PrintWriter writer = response.getWriter();
			writer.println(pojo.toString());
			writer.close();
		} else {
			PrintWriter writer = response.getWriter();
			writer.println("Error! Please go back and input ONLY F for fahrenheit or C for celsius");
			writer.close();
		}
	}
}
