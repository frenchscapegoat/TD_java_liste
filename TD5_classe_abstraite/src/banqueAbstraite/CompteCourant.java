package banqueAbstraite;

public class CompteCourant extends Compte {
	private double decouvertAutorise;
	static int nbComptes;
	private final static double SEUIL=200;
	
	// CONSTRUCTEURS
	public CompteCourant(double decouvertAutorise) {
		super();
		this.decouvertAutorise = decouvertAutorise;
	}
	
	public CompteCourant(){
		super();
		decouvertAutorise = 0;
	}
	
	public CompteCourant(int i, int j) {
		// TODO Auto-generated constructor stub
	}

	// GET | SET
	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}
	public void setDecouvertAutorise(double decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}
	public static int getNbComptes() {
		return nbComptes;
	}
	public static void setNbComptes(int nbComptes) {
		CompteCourant.nbComptes = nbComptes;
	}
	
	@Override
	public String toString() {
		return "CompteCourant [numero=" + numero + ", proprietaire=" + proprietaire + ", solde=" + solde
				+ ", decouvertAutorise=" + decouvertAutorise + "]";
	}
	
	// METHODES
	public void debiter (double montant){
		if (solde - montant >= -SEUIL){
			solde-=montant;
		}
	}	
	
	
	// MAIN
	public static void main(String args[]){
		// Créer un CompteCourant
		CompteCourant c = new CompteCourant();
		
		// Appeler une méthode
		System.out.println(c);
		c.crediter(150);
		System.out.println(c);
	}

	public void setSeuil(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void crediter(double montant) {
		// TODO Auto-generated method stub
		solde+=montant;
		
	}
}
