package dev201503.beans;

public class Joue {
	private int codeActeur;
	private int codeFilm;
	
	public Joue()
	{
		
	}
	
	public Joue(int codeA, int codeF)
	{
		this.codeActeur = codeA;
		this.codeFilm = codeF;
	}

	public int getCodeActeur() {
		return codeActeur;
	}

	public int getCodeFilm() {
		return codeFilm;
	}
	
	public String toString()
	{
		return "";
	}
}
