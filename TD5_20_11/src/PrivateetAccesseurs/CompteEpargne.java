package PrivateetAccesseurs;

public class CompteEpargne {
	private int numero;
	static int nbComptes;
	private static final double SEUIL_SECURITE=1000;
	
	private Client proprietaire;
	private double solde;
	private double tauxInteret;
	// CONSTRUCTEURS
	public CompteEpargne(){
		//
		// incrémenter le nbClients
		nbComptes ++;
		// Fixer le numéro de ce client
		numero = nbComptes;
		//
		this.solde = 0;
		
	}
	
	
	public CompteEpargne(double solde){
		this();
		this.solde = solde;
		
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public void setNumero(int n){
		this.numero=n;
	}
	
	public double getSolde(){
		return this.solde;
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
	
	public void setProprietaire(Client proprietaire) {
		this.proprietaire = proprietaire;
	}
	
	public static int getNbComptes() {
		return nbComptes;
	}
	
	
	public static void setNbComptes(int nbComptes) {
		CompteEpargne.nbComptes = nbComptes;
	}

	//--##--##--

	@Override
	public String toString() {
		return "CompteEpargne [numero=" + numero + ", proprietaire=" + proprietaire + ", solde=" + solde
				+ ", tauxInteret=" + tauxInteret + "]";
	}
	
	
	
	}
