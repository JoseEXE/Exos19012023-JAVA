package exo1;

public class Specialites {
	private String code;
	private String titre;
	
	public Specialites(String code, String titre) {
		//super();
		this.code = code;
		this.titre = titre;
	}

	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}


	@Override
	public String toString() {
		return titre;
	}
	
	
	
	
	

}
