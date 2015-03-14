package tiers.bean;

public class Personne {

	private Integer id;
	private String nom;
	private String prenom;
	private Genre sexe;
	private Integer anneeNaissance;
	
	public Personne()
	{
		
	}
	
	public Personne(String nom, String prenom, Genre sexe, Integer anneeNaissance)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.anneeNaissance = anneeNaissance;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Genre getSexe() {
		return sexe;
	}

	public void setSexe(Genre sexe) {
		this.sexe = sexe;
	}

	public Integer getAnneeNaissance() {
		return anneeNaissance;
	}

	public void setAnneeNaissance(Integer anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}
	
	
	
	
}
