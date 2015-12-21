package salariedebanque;

public class ClientInterne extends Salarie{
	private Compte compte;
	
	// Methodes
	public Compte getCompte(){
		return compte;
	}
	public void verserSalaire(){
		getCompte().solde+=getSalaire();
	}
}
