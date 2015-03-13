package dev201503.beans;

public class Acteur {
	
	private int codeActeur;
	private String prenomActeur;
	private String nomActeur;
	private int sexeActeur;
	private int anneeNaissance;
	
	public Acteur()
	{
		
	}
	
	public Acteur(int code, String prenom, String nom, int sexe, int anneeNaissance)
	{
		this.codeActeur = code;
		this.prenomActeur = prenom;
		this.nomActeur = nom;
		this.sexeActeur = sexe;
		this.anneeNaissance = anneeNaissance;
	}

	public int getCodeActeur() {
		return codeActeur;
	}

	public String getPrenomActeur() {
		return prenomActeur;
	}

	public String getNomActeur() {
		return nomActeur;
	}
	
	public String toString()
	{
		return this.prenomActeur+" "+this.nomActeur+" ("+this.anneeNaissance+")";
	}
	
	public String getNomComplet()
	{
		if(this.sexeActeur == 1)
		{
			return "Mme "+this.prenomActeur+" "+this.nomActeur;
		}
		else
		{
			return "Mr "+this.prenomActeur+" "+this.nomActeur;
		}
	}

	public int getSexeActeur() {
		return sexeActeur;
	}

	public int getAnneeNaissance() {
		return anneeNaissance;
	}
	

}
