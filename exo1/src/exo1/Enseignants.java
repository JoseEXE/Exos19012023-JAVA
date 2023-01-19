package exo1;

public class Enseignants {
	private String nom;
	private String prenom;
	private Specialites specialite;
	
	public Enseignants(String nom, String prenom, Specialites specialite) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.specialite = specialite;
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

	public Specialites getSpecialite() {
		return specialite;
	}

	public void setSpecialite(Specialites specialite) {
		this.specialite = specialite;
	}

	
	@Override
	public String toString() {
		return " - " + nom + " " + prenom;
	}
	
	
	

}
