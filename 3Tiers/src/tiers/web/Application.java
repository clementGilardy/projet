package tiers.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tiers.DAO.DaoImpl;
import tiers.services.ServiceImpl;

/**
 * Servlet implementation class Application
 */
@WebServlet("/Application")
public class Application extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String urlList;
	private ServiceImpl service;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse rep)
			throws ServletException, IOException {
		req.setAttribute("personnes", service.getDao().getAll());
		String action = req.getParameter("action");
		
		if(action != null && action.equals("supp"))
		{
			String id = req.getParameter("id");
			if(id != null && !id.isEmpty())
			{
				if(id.matches("\\d"))
				{
					service.deleteOne(Integer.parseInt(id));
				}
			}
		}
		
		
		getServletContext().getRequestDispatcher(urlList).forward(req, rep);
	}

	@Override
	public void init() throws ServletException {
		DaoImpl daoimpl = new DaoImpl();
		daoimpl.init();
		service = new ServiceImpl();
		service.setDao(daoimpl);
		urlList = getInitParameter("urlList");
	}
       


}
