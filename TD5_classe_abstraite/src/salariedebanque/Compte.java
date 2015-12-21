package salariedebanque;

public abstract class Compte {
	private static final double SEUIL_SECURITE =200;
	protected int numero;
	protected double solde;
	protected Client proprietaire;
	
	// CONSTRUCTEURS
	public Compte(){
		numero ++;
		this.solde = 0;
		}
	
	
	public Compte(double solde){
		this();
		this.solde = solde;
	}
	
	// GET | SETTEURS
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		//PAas bon setsolde !!
		if (solde > SEUIL_SECURITE){
			System.out.println("Vous avez dépassé le seuil");
		}
		else
		this.solde = solde;
	}
	public Client getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(Client proprietaire) {
		this.proprietaire = proprietaire;
	}

	// METHODES
	public abstract void crediter (double montant);
	
	public abstract void debiter (double montant);
}
