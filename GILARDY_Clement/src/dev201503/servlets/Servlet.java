package dev201503.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev201503.beans.Acteurs;
import dev201503.beans.Films;
import dev201503.beans.Jouent;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//URL pour les fichiers JSP
	private  String urlAfficheActeurs;
	private  String urlAfficheFilms;
	
	//Instanciation des objets
	private Jouent jouent;
	private Films films;
	private Acteurs acteurs;
	
	
	protected void service(HttpServletRequest req, HttpServletResponse rep)
			throws ServletException, IOException {
		String action = req.getParameter("action");
		
		if(action == null)
		{
			System.out.println("action == null");
			req.setAttribute("films", films);
			getServletContext().getRequestDispatcher(urlAfficheFilms).forward(req, rep);
		}
		else if (action.equals("afficheFilms"))
		{
			System.out.println("action == afficheFilms");
			String codeActeur = req.getParameter("codeActeur");
			String regexFilm = req.getParameter("regexFilm");
			
			if(codeActeur != null)
			{
				System.out.println("codeActeur != null");
				Films tmp = new Films();
				tmp = jouent.getFilmsByCodeActeur(Integer.parseInt(codeActeur), films);
				req.setAttribute("films", tmp);
				getServletContext().getRequestDispatcher(urlAfficheFilms).forward(req, rep);
			}
			
			if(regexFilm != null)
			{
				Films tmp = new Films();
				String recherche = req.getParameter("rechercheFilm");
				
				tmp = films.findByRegex(recherche);
				req.setAttribute("films", tmp);
				getServletContext().getRequestDispatcher(urlAfficheFilms).forward(req, rep);
			}
			
			if(regexFilm == null && codeActeur == null)
			{
				req.setAttribute("films", films);
				getServletContext().getRequestDispatcher(urlAfficheFilms).forward(req, rep);
			}
		}
		else if (action.equals("afficheActeurs"))
		{
			String codeFilm = req.getParameter("codeFilm");
			String regexActeur = req.getParameter("regexActeur");
			if(codeFilm != null)
			{
				Acteurs tmp = new Acteurs();
				tmp = jouent.getActeursByCodeFilm(Integer.parseInt(codeFilm), acteurs);
				req.setAttribute("acteurs", tmp);
				getServletContext().getRequestDispatcher(urlAfficheActeurs).forward(req, rep);
			}
			else if (regexActeur  != null)
			{
				Acteurs tmp = new Acteurs();
				String recherche = req.getParameter("rechercheActeur");
				tmp = acteurs.findByRegex(recherche);
				
				req.setAttribute("acteurs", tmp);
				getServletContext().getRequestDispatcher(urlAfficheActeurs).forward(req, rep);
			}
			
			if(regexActeur == null && codeFilm == null)
			{
				req.setAttribute("acteurs", acteurs);
				getServletContext().getRequestDispatcher(urlAfficheActeurs).forward(req, rep);
			}
		}
		
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init appelé");
		urlAfficheActeurs 	= getInitParameter("afficheActeurs");
		urlAfficheFilms		= getInitParameter("afficheFilms");
		
		jouent = new Jouent();
		jouent.init();
		
		films = new Films();
		films.init();
		
		acteurs = new Acteurs();
		acteurs.init();
		
	}


}
