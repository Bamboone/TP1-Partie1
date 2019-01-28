
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
		System.out.print("Nom: " + nom +
						   "\nPrénom: " + prenom +
						   "\nFormation: " + formation +
						   "\nExpériences de travail: " + nbAnnees + "ans");
		System.out.print("\nCompetences: ");
		for(int i=0; i<competences.length; i++) {
			System.out.print(competences[i] + " ");
		}
		System.out.println("\nAttentes: " + attentes +"\n\n");
	}
	
	public static void main(String[] args) {
		System.out.println("Bienvenue chez Barrette!\n");
		String[] compGabriel = new String[] {"Programmation Objet", "C#", "Java", "HTML"};
		String[] compIlyas = new String[] {"Programmation Objet", "C#", "Java", "HTML"};
		CV gabriel = new CV("Lévesque-Duval", "Gabriel", "Techiques de l'informatique", 2, compGabriel, "Apprendre plus de choses sur la programmation.");
		CV ilyas = new CV("Elamraoui", "Ilyas", "Techiques de l'informatique", 2, compIlyas, "Apprendre à gérer Git");
		gabriel.affiche();
		ilyas.affiche();
	}
	
}
