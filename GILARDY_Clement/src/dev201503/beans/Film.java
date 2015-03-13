package dev201503.beans;

public class Film {
	private int codeFilm;
	private String titreFilm;
	private int anneeFilm;
	
	public Film()
	{
		
	}
	
	public Film(int code, String titre, int annee)
	{
		this.codeFilm = code;
		this.titreFilm = titre;
		this.anneeFilm = annee;
	}
	
	
	
	public int getCodeFilm() {
		return codeFilm;
	}

	public String getTitreFilm() {
		return titreFilm;
	}

	public int getAnneeFilm() {
		return anneeFilm;
	}

	public String toString()
	{
		return this.titreFilm+" ("+this.anneeFilm+")";
	}
	
}
