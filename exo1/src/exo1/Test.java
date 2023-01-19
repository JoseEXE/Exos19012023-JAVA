package exo1;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Specialites> specialite = new ArrayList<Specialites>();
		
		specialite.add(new Specialites("JV","JAVA/JEE"));
		specialite.add(new Specialites("HTML","HTML/CSS"));
		specialite.add(new Specialites("JP","Gestion de projet"));
		specialite.add(new Specialites("JS","JS"));
		specialite.add(new Specialites("PHP","PHP"));


		ArrayList<Enseignants> enseignant = new ArrayList<Enseignants>();
		
		enseignant.add(new Enseignants("LAURENT","Jeam",specialite.get(0)));
		enseignant.add(new Enseignants("SIMON","Poul",specialite.get(0)));
		enseignant.add(new Enseignants("MICHEL","Charlotte",specialite.get(4)));
		enseignant.add(new Enseignants("MARTIN","Diep",specialite.get(3)));
		
		boolean exisEnseignan = false;
	

		for (Specialites elementSpecialite : specialite) {
			
			System.out.println("Especialite: "+ elementSpecialite + "\n Enseignans: ");
			
			for (Enseignants elementEnseignant : enseignant) {
				if(elementEnseignant.getSpecialite().equals(elementSpecialite)) {
					System.out.println(elementEnseignant);
					exisEnseignan = true;
				}
				
			}

			if(exisEnseignan==false) {
			System.out.println("Aucun enseignant pour la spécialité " + elementSpecialite);
			}
			exisEnseignan=false;
			System.out.println("========" );
		}
		

	}

}
