public class VoitureConstructeur {
	int annee;
	int puissance;
	double valeur;
	
	VoitureConstructeur (int an, double valeur) {
		annee = an;
		this.valeur = valeur; // Fait r�f�rence � l'objet actuel !
	}
	
	public static void main(String[] args) {
		VoitureConstructeur v = new VoitureConstructeur(2007,7);
		

	}

}
