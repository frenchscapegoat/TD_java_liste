package abstractTD;

public class Technicien extends Employe{
	private final static int coeff=10;
	private int nbUnites; // nbUnités par mois
	
	public int getNbUnites() {
		return nbUnites;
	}

	public Technicien(String nom, String prenom, int date, int age, int nbUnites) {
		super(nom, prenom, date, age);
		this.nbUnites = nbUnites;
	}

	public double calculerSalaire(){ // A passer en double
		// Salaire = nbUnités * 10
		double salaire;
		salaire = getNbUnites()*coeff;
		return salaire;
	}
}
