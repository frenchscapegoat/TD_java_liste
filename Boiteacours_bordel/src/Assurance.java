
public class Assurance {

	public static void main(String[] args) {
		Voiture scenic;
		scenic = new Voiture();
		
		// Affecter une valeur � l'attribut de l'objet scenic
		scenic.annee = 1998;
		
		// Afficher valeur
		System.out.println("Ann�e du Sc�nic " +scenic);
		
		// Declaarer reference vers une 2e voiture
		Voiture audi = new Voiture();
		audi.puissance = 140;
		
	}

}
