package gestion.poulailler;

public class Ferme {
	private Volaille lesVolailles[] = new Volaille[NB_MAX];// = new Volaille();
	private int nbBetes=0;
	
	private final static int NB_MAX=100;
	
	void ajouter(Volaille uneVolaille){
		lesVolailles[nbBetes] = uneVolaille;
		nbBetes++;
	}
	
	double evaluerBetesAbatre(){
		double res = 0;
		for(int i = 0; i<nbBetes;i++){
			if (lesVolailles[i].assezGrosse()){
				res = res+lesVolailles[i].getPrix();
			}
		}
		return res;
	}
	
	void triAnimaux(){
		
	}
	//----------------------------------------------------
	Volaille[] envoyerALAbattoir(){
		Volaille[] res = new Volaille[NB_MAX];
		int nb = 0;
		int i = 0;
		while (i < nbBetes){
			System.out.print("+");
			if (lesVolailles[i].assezGrosse()){
				res[nb] = lesVolailles[i];
				nb++;
				
				// Retirer cette volaille de l'élevage
				lesVolailles[i]=lesVolailles[nbBetes-1];
				nbBetes--;
			}
			else
			{
				i++;
			}
		}
		return res;
	}
	
	//----------------------------------------------------
	void ecrire(){
		for (int i=0; i<nbBetes; i++){
			System.out.println(lesVolailles[i].identite + " " +
					lesVolailles[i].poids + " " + lesVolailles[i].getPrix());
		}
	}
	
	public static void main (String args[]){
		Ferme maFerme = new Ferme();
		// On crée des poulets et des canards
		Canard c1 = new Canard(1,12);
		Canard c2 = new Canard(2, 13);
		Poulet p1 = new Poulet(3,10);
		Poulet p2 = new Poulet(1,11);
		
		// On ajoute
		maFerme.ajouter(c1);
		maFerme.ajouter(c2);
		maFerme.ajouter(p1);
		maFerme.ajouter(p2);
		
		//
		System.out.println("valeur des betes à abbatre : ");
		System.out.println(maFerme.evaluerBetesAbatre());
	}
}
