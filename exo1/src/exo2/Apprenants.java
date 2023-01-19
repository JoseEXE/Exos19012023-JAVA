package exo2;

public class Apprenants {
	private String nom;
	private String prenom;
	private Filieres filier;
	
	public Apprenants(String nom, String prenom, Filieres filier) {
		//super();
		this.nom = nom;
		this.prenom = prenom;
		this.filier = filier;
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

	public Filieres getFilier() {
		return filier;
	}

	public void setFilier(Filieres filier) {
		this.filier = filier;
	}

	@Override
	public String toString() {
		return prenom + " " + nom;
	}
	
	
	
	

}
