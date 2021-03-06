package PrivateetAccesseurs;

import java.util.Arrays;
import java.util.Scanner;

public class Banque {
	final static int TAILLEMAX=2;
	private CompteCourant [] tabcomptes;
	private CompteEpargne [] tabepargne;
	// AJout static au nbComptes
	private static int nbComptes;
	private static int nbEpargne;
	// Ajout taux
	private static double taux = 0.01;
	
	// Constructeur
	Banque(){
		tabcomptes = new CompteCourant[TAILLEMAX];
		tabepargne = new CompteEpargne[TAILLEMAX];
	}
	
	Banque (int nbComptes){
		tabcomptes = new CompteCourant[nbComptes];
		tabepargne = new CompteEpargne[nbEpargne];

	}
	
	// METHODES
	
	public void ajouterCompte(CompteCourant nouveauCompte){
		tabcomptes [nbComptes] = nouveauCompte;
		nbComptes ++;
	}

	public void ajouterCompte(CompteEpargne nouveauCompte){
		tabepargne [nbEpargne] = nouveauCompte;
		nbEpargne ++;
	}
	
	public void afficherComptes(){
		for (CompteCourant c : tabcomptes){
			if (c!= null){
			System.out.println("Num�ro de Compte : " +c.getNumero());
			System.out.println("Solde du Compte : " +c.getSolde());
			}
		}
			
	}
	
	public void afficherCompteEpargne(){
		for (CompteEpargne c : tabepargne){
			if (c!= null){
			System.out.println("Num�ro de Compte : " +c.getNumero());
			System.out.println("Solde du Compte : " +c.getSolde());
			}
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
	
	public void afficherComptesEpargne(String nomClient){
		// On teste dans quelle banque se trouve le client
		for (CompteEpargne c : tabepargne){
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
	
	public void afficherProprietaireEpargne(int numeroCompte){
		for (CompteEpargne c : tabepargne){
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
	
	public void deposer(int numeroCompte,double montant){
		for (CompteCourant c : tabcomptes){
			if (c != null){
				if (c.getNumero() == numeroCompte){
					c.deposer(montant+montant*taux);
					return;
					//c.setSolde(c.getSolde()+montant);
				}
			}
		}
	}

	public void deposerEpargne(int numeroCompte,double montant){
		for (CompteEpargne c : tabepargne){
			if (c != null){
				if (c.getNumero() == numeroCompte){
					c.deposer(montant+montant*taux);
					return;	
				}
			}
		}
	}
	
	public static double getTaux() {
		return taux;
	}

	public static void setTaux(double taux) {
		Banque.taux = taux;
	}
	
	
	//--##--##--
	@Override
	public String toString() {
		return "Banque [tabcomptes=" + Arrays.toString(tabcomptes) + ", tabepargne=" + Arrays.toString(tabepargne)
				+ "]";
	}


	// MAIN
	public static void main(String[] args){
		CompteCourant cDupont = new CompteCourant(0);
		CompteCourant cDurand = new CompteCourant(1000);
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
		
		// JAout d'un montant
		cDupont.deposer(10); // TERMINER
		
		// Augmenter le taux 
		System.out.println("Rentrez un nouveau taux svp");
		Scanner sc = new Scanner(System.in);
		double tauxTmp = sc.nextDouble();
		banqueOrsay.setTaux(tauxTmp);
		System.out.println(cDupont);	
	}
}
		