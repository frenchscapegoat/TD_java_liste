
public class Banque {
	final static int TAILLEMAX=2;
	private CompteCourant [] tabcomptes;
	private int nbComptes;
	
	// Constructeur
	Banque(){
		tabcomptes = new CompteCourant[TAILLEMAX];
	}
	
	Banque (int nbComptes){
		tabcomptes = new CompteCourant[nbComptes];
	}
	
	// METHODES
	
	public void ajouterCompte(CompteCourant nouveauCompte){
		tabcomptes [nbComptes] = nouveauCompte;
		nbComptes ++;
	}
	
	public void afficherComptes(){
		for (CompteCourant c : tabcomptes){
			System.out.println("Num�ro de Compte : " +c.getNumero());
			System.out.println("Solde du Compte : " +c.getSolde());
		}
	}
	
	public void afficherComptesClient(String nomClient){
		// On teste dans quelle banque se trouve le client
		for (CompteCourant c : tabcomptes){
			if (c!= null){
				if (c.getProprietaire().getNom().equals(nomClient)){ // .equals correspond a comparaison objet
					System.out.println("N� compte :" + c.getNumero());
					System.out.println("Solde du compte" +c.getSolde());
				}
			}
		}
	}
	
	public void afficherProprietaire(int numeroCompte){
		for (CompteCourant c : tabcomptes){
			if (c!=null){
				if (c.getNumero() == numeroCompte){
					Client client = c.getProprietaire();
					
					System.out.println("Nom du Client :" +client.getNom());
					System.out.println("Ann�e de naissance du client : " +client.getAnneeNaissance());
					// revenir au porgramme
					return;
				}
			}
		}
	}
	
	// MAIN
	public static void main(String[] args){
		CompteCourant cDupont = new CompteCourant(120,0);
		CompteCourant cDurand = new CompteCourant(123,1000);
		cDurand.setSeuil(2000);
		
		// 2 - Tableau d'objets
		Banque banqueOrsay = new Banque(2);
		banqueOrsay.ajouterCompte(cDupont);
		
		Banque banqueBures = new Banque(10);
		banqueBures.ajouterCompte(cDurand);
		
		// Affichage comptes
		banqueOrsay.afficherComptes();
		banqueBures.afficherComptes();
		
		// Cr�ation Client
		Client clientDupont = new Client();
		clientDupont.setNom("Dupont");
		Client clientDurand = new Client();
		clientDurand.setNom("Durand");
		
	}
}
		