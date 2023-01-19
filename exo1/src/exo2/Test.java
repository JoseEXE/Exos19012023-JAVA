package exo2;

import java.util.ArrayList;
import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		ArrayList<Filieres> filieres = new ArrayList<Filieres>();

		filieres.add(new Filieres("CDA","CDA"));
		filieres.add(new Filieres("MK","Marketing"));
		filieres.add(new Filieres("AV","Assistance de vie"));
					
		ArrayList<Apprenants> apprenants = new ArrayList<Apprenants>();
		
		apprenants.add(new Apprenants("Simpson","Homer",filieres.get(0)));
		apprenants.add(new Apprenants("Simpson","Bart",filieres.get(0)));
		apprenants.add(new Apprenants("Sultan","Vanessa",filieres.get(1)));
		apprenants.add(new Apprenants("Simpson","Marge",filieres.get(1)));
		apprenants.add(new Apprenants("Simpson","Lisa",filieres.get(1)));
		
		boolean entre = false;
		int cont = 0;
		for (Filieres elementFilier : filieres) {
			System.out.println("Filière: "+ elementFilier.getTitre());
			
			for (Apprenants elementApprenant : apprenants) {
				if(elementFilier.getCode().equalsIgnoreCase(elementApprenant.getFilier().getCode())) {
					cont++;
					System.out.println(cont+". " + elementApprenant);
					entre = true;
				}				
			}
			if(entre == false) {
				System.out.println(" - Pas d’inscrit");
			}
			entre = false;
			cont = 0;
			System.out.println("===========");
			
			
		}
		
		/* VERSION EXO3 AVEC FORMATEUR*/
		System.out.println("");
		System.out.println("======* VERSION EXO3 AVEC FORMATEUR *======");
		ArrayList<Formateurs> formateurs = new ArrayList<Formateurs>();
		
		formateurs.add(new Formateurs("Burns","Charles",filieres.get(0)));
		formateurs.add(new Formateurs("Kas","Zack",filieres.get(1)));
		
		for (Filieres elementFilier : filieres) {
			System.out.println(""+ elementFilier.getTitre());
			
			for (Formateurs elementFormateur : formateurs) {
				if(elementFilier.getCode().equals(elementFormateur.getFilier().getCode())) {
					System.out.println("Formateur : " + elementFormateur);
					
				}
			}
			
			for (Apprenants elementApprenant : apprenants) {
				if(elementFilier.getCode().equalsIgnoreCase(elementApprenant.getFilier().getCode())) {
					cont++;
					System.out.println(cont+". " + elementApprenant);
					entre = true;
				}				
			}
			if(entre == false) {
				System.out.println(" - Pas d’inscrit");
			}
			entre = false;
			cont = 0;
			System.out.println("===========");
			
			
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("===============* EXO4 *===============");
		System.out.println("Vous voulez faire une recherche par :");
		System.out.println("Tapez (1) - Si vous souhaitez effectuer une recherche par prénom");
		System.out.println("Tapez (2) - Si vous souhaitez effectuer une recherche par filière.");
		int option = sc.nextInt();
		
		switch(option) {
			case 1 : 
				System.out.println("OPTION 1 - Recherche par prénom");
				System.out.println("Ecrivez le prenom: ");
				String prenom = sc.next();
				boolean prenomTrouve = false;
				int preContappre = 0;
				for (Formateurs elementFormateur : formateurs) {
					if(elementFormateur.getPrenom().equalsIgnoreCase(prenom)) {				
						for (Apprenants elementApprenant : apprenants) {
							if(elementFormateur.getFilier().equals(elementApprenant.getFilier())) {
								preContappre++;										
							}
						}	
						System.out.println(prenom + " anime la formation "+elementFormateur.getFilier().getTitre()+" avec "+ preContappre +" apprenants.");
						prenomTrouve = true;
						preContappre = 0;
						for (Apprenants elementApprenant : apprenants) {
							if(elementFormateur.getFilier().equals(elementApprenant.getFilier())) {
								preContappre++;
								System.out.println(preContappre +". "+ elementApprenant);												
							}
						}	
					}
				}
				if(prenomTrouve==false) {
					System.out.println("Le prenom "+ prenom +" n'a pas été trouvé dans notre base");
				}
				prenomTrouve=false;
				break;
			case 2 :
				System.out.println("OPTION 2 - Recherche par filière");
				System.out.println("Saisissez une filière !");
				String filiere = sc.next();
				boolean filiTrouve = false;
				int filiContappre = 0;
				String formateur = "";
				for (Filieres elementFiliere : filieres) {
					if(elementFiliere.getTitre().equalsIgnoreCase(filiere)) {
						filiTrouve=true;
						
						for (Formateurs elementFormateurs : formateurs) {
							if(elementFiliere.getTitre().equals(elementFormateurs.getFilier().getTitre())) {
								formateur = elementFormateurs.toString();
								break;
							}		
						}
						for (Apprenants elementApprenant : apprenants) {
							if(elementFiliere.getTitre().equals(elementApprenant.getFilier().getTitre())) {
								filiContappre++;
							}		
						}	
						
						System.out.println(filiere + " est animé par "+ formateur +" avec "+ filiContappre +" apprenants.");
						filiContappre = 0;
						for (Apprenants elementApprenant : apprenants) {
							if(elementFiliere.getTitre().equals(elementApprenant.getFilier().getTitre())) {
								filiContappre++;
								System.out.println(filiContappre+". "+ elementApprenant);
							}		
						}								
						
					}
				}
				if(filiTrouve == false) {
					System.out.println("La filière "+ filiere + " n'a pas été trouvé dans notre base");
				}
				break;
			default:
				System.out.println("OPTION N'EXISTE PAS");
				break;
			
		}
		
		sc.close();
		
		
	}
	
	
	
	

}
