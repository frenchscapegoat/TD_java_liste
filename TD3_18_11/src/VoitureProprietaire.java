
public class VoitureProprietaire {
	int annee;
	int puissance;
	double valeur;
	Personne proprietaire;
	
	// Methode
	public static void main (String args[]) {
		VoitureProprietaire voiture1 = new VoitureProprietaire();
		//System.out.println(voiture1.proprietaire.anneeNaissance); // Exception in thread: NULLPOINTEREXCEPTION
		VoitureProprietaire voiture2 = new VoitureProprietaire();
		
			
		Personne p = new Personne();
		
		p.anneeNaissance = 1965;
		
		voiture1.proprietaire = p;
		
		voiture2.proprietaire = p;
		
		System.out.println(voiture1.proprietaire.anneeNaissance);
		
		System.out.println(voiture2.proprietaire.anneeNaissance);
		
	}

}