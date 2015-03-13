package dev201503.beans;

import java.sql.ResultSet;
import java.util.ArrayList;
import bdd.connecteurs.MysqlB3A;


public class Acteurs extends ArrayList<Acteur> {
	
	public void init()
	{
		MysqlB3A handle = new MysqlB3A("localhost","films","root","chiennes");
		String request = "SELECT * from acteurs";
		ResultSet rs = handle.select(request);
		try
		{
			while(rs.next())
			{
				try
				{
					this.add(new Acteur(rs.getInt("codeActeur"), 
						rs.getString("nomActeur"),
						rs.getString("prenomActeur"),
						rs.getInt("sexeActeur"),
						rs.getInt("anneeNaissanceActeur")));
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
	
	public Acteurs findByRegex(String regex)
	{
		Acteurs tmp = new Acteurs();
		for(Acteur a : this)
		{
			if(a.getNomComplet().matches(regex))
			{
				tmp.add(a);
			}
		}
		return tmp;
	}
	
	public Acteur getByCodeActeur(int code)
	{
		for(Acteur a : this)
		{
			if(a.getCodeActeur() == code)
			{
				return a;
			}
		}
		return null;
	}
	
	public String toString()
	{
		String all = null;
		for(Acteur a : this)
		{
			if(all != null)
				all = all+ a.toString();
			else
				all = a.toString();
		}
		
		return all;
	}

}
