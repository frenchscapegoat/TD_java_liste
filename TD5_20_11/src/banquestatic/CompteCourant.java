package banquestatic;

public class CompteCourant {
	private int numero;
	private static int nbComptes;
	
	private Client proprietaire;
	private double solde;
	private double decouvertAutorise;
	// CONSTRUCTEURS
	public CompteCourant(){
		//
		// incr�menter le nbClients
		nbComptes ++;
		// Fixer le num�ro de ce client
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
		this.solde = solde;
	}


	public Client getProprietaire() {
		return proprietaire;
	}
		// En static, pour y acc�der, on doit mettre le type.attribut
	public void deposer(double montant){
		solde = montant;
	}
}
