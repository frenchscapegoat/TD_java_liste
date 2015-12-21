package ArrayList;

public class CompteCourant {
	private int numero;
	private static int nbComptes;
	private static final double SEUIL_SECURITE=1000;
	
	private Client proprietaire;
	private double solde;
	private double decouvertAutorise;
	// CONSTRUCTEURS
	public CompteCourant(){
		//
		// incrémenter le nbClients
		nbComptes ++;
		// Fixer le numéro de ce client
		numero = nbComptes;
		//
		this.solde = 0;
		this.decouvertAutorise = 0;		
	}
	
	
	public CompteCourant(double solde){
		this();
		this.solde = solde;
		this.decouvertAutorise = 10;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public void setNumero(int n){
		this.numero=n;
	}
	public void setSeuil(int n){
		this.decouvertAutorise = n;
	}
	public double getSolde(){
		return this.solde;
	}

	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}


	public void setDecouvertAutorise(double decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}


	public void setProprietaire(Client proprietaire) {
		this.proprietaire = proprietaire;
	}


	public void setSolde(double solde) {
		if (solde<SEUIL_SECURITE){
			this.solde=solde;
		}
		else{
			System.out.println("ATTENTION tentative d'affectation suspecte. Arret");
		}
	}


	public Client getProprietaire() {
		return proprietaire;
	}
		// En static, pour y accéder, on doit mettre le type.attribut
	public void deposer(double montant){
		solde = montant;
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
	
	
}
