package dev201503.beans;

import java.sql.ResultSet;
import java.util.ArrayList;

import bdd.connecteurs.MysqlB3A;

public class Jouent extends ArrayList<Joue> {
	
	public void init()
	{
		MysqlB3A handle = new MysqlB3A("localhost","films","root","chiennes");
		String request = "SELECT codeF,codeA from joue";
		ResultSet rs = handle.select(request);
		try
		{
			while(rs.next())
			{
				try
				{
					this.add(new Joue(rs.getInt("codeA"), 
						rs.getInt("codeF")));
				}
				catch(Exception e)
				{
					System.err.println(e.getMessage());
				}
			}
		}
		catch(Exception e)
		{
			System.err.println("Erreur durant la connexion à la base de données");
		}
	}
	
	public Acteurs getActeursByCodeFilm(int codeFilm, Acteurs acteurs)
	{
		Acteurs tmp = new Acteurs();
		for(Joue j : this)
		{
			if(j.getCodeFilm() == codeFilm)
			{
				for(Acteur a : acteurs)
				{
					if(a.getCodeActeur() == j.getCodeActeur())
					{
						tmp.add(a);
					}
				}
			}
		}
		
		return tmp;
	}
	
	public Films getFilmsByCodeActeur(int codeActeur, Films films)
	{
		Films tmp = new Films();
		for(Joue j : this)
		{
			if(j.getCodeActeur() == codeActeur)
			{
				for(Film f : films)
				{
					if(f.getCodeFilm() == j.getCodeFilm())
					{
						tmp.add(f);
					}
				}
			}
		}
		
		return tmp;
	}

}
