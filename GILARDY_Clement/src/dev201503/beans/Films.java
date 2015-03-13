package dev201503.beans;

import java.sql.ResultSet;
import java.util.ArrayList;

import bdd.connecteurs.MysqlB3A;

public class Films extends ArrayList<Film> {

	public void init()
	{
		MysqlB3A handle = new MysqlB3A("localhost","films","root","chiennes");
		String request = "SELECT * from films";
		ResultSet rs = handle.select(request);
		try
		{
			while(rs.next())
			{
				try
				{
					this.add(new Film(rs.getInt("codeFilm"), 
						rs.getString("titreFilm"),
						rs.getInt("anneeFilm")));
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
	
	public Films findByRegex(String regex)
	{
		Films tmp = new Films();
		for(Film f : this)
		{
			if(f.getTitreFilm().matches(regex))
			{
				tmp.add(f);
			}
		}
		return tmp;
	}
	
	public Film getByCode(int code)
	{
		for(Film f : this)
		{
			if(f.getCodeFilm() == code)
			{
				return f;
			}
		}
		return null;
	}
	
	public String toString()
	{
		String all = null;
		for(Film f : this)
		{
			if(all != null)
				all = all+ f.toString();
			else
				all = f.toString();
		}
		
		return all;
	}
}
