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
 * Servlet implementation class ConvertToFahrenheit
 */
@WebServlet("/ConvertToFahrenheit")
public class ConvertToFahrenheit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConvertToFahrenheit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userTemp = request.getParameter("userTemp");
		TempConverter pojo = new TempConverter(Integer.parseInt(userTemp));
		pojo.setTempSelection("F");
		pojo.convertToFahrenheit(pojo.getTemp());
		request.setAttribute("calcTemp", pojo);
		getServletContext().getRequestDispatcher("/resultsC.jsp").forward(request, response);
		PrintWriter writer = response.getWriter();
		writer.println(pojo.toString());
		writer.close();
	}

}
