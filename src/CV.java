
public class CV {

	private String nom;
	private String prenom;
	private String formation;
	private int nbAnnees;
	private String[] competences;
	private String attentes;
	
	public CV(String pNom, String pPrenom, String pFormation, int pNbAnnees, String[] pCompetences, String pAttentes) {
		nom = pNom;
		prenom = pPrenom;
		formation = pFormation;
		nbAnnees = pNbAnnees;
		competences = pCompetences;
		attentes = pAttentes;
		
	}
	
	public void affiche() {
		System.out.println("Nom: " + nom +
						   "\nPrénom: " + prenom +
						   "\nFormation: " + formation +
						   "\nExpériences de travail: " + nbAnnees + "ans");
		System.out.println("\nCompetences: ");
		for(int i=0; i<competences.length; i++) {
			System.out.print(competences[i] + ", ");
		}
		System.out.println();
		System.out.println("\nAttentes: " + attentes);
	}
	
}
