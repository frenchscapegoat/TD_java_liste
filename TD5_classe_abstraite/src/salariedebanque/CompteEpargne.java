package salariedebanque;

public class CompteEpargne extends Compte{
	static int nbComptes;
	private double tauxInteret;
	
	@Override
	public String toString() {
		return "CompteEpargne [tauxInteret=" + tauxInteret + ", numero=" + numero + ", solde=" + solde
				+ ", proprietaire=" + proprietaire + "]";
	}

	/**
	 * @return the nbComptes
	 */
	public static int getNbComptes() {
		return nbComptes;
	}

	/**
	 * @param nbComptes the nbComptes to set
	 */
	public static void setNbComptes(int nbComptes) {
		CompteEpargne.nbComptes = nbComptes;
	}

	/**
	 * @return the tauxInteret
	 */
	public double getTauxInteret() {
		return tauxInteret;
	}

	/**
	 * @param tauxInteret the tauxInteret to set
	 */
	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}

	public void crediter(double montant){
		solde += (montant +(montant*tauxInteret));
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debiter(double montant) {
		// TODO Auto-generated method stub
		
	}

}
