package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import WebService.BanqueService;
import WebService.BanqueServicePortBindingStub;
import WebService.BanqueWS;
import WebService.BanqueWSLocator;

/**
 * Servlet implementation class ConvServlet
 */
@WebServlet("/ConvServlet")
public class ConvServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConvServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		double mt = Double.parseDouble(request.getParameter("mt"));
		BanqueService bw;
		try {
			bw = new BanqueWSLocator().getBanqueServicePort();
			double conv = bw.conversionED(mt);
			request.setAttribute("conv", conv);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 4 envoi des elts à la JSP
		// on indique le nom de la jsp concernée
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
