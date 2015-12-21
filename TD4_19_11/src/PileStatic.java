/* VERSION STATIC */
public class PileStatic {
	final int NB_MAX=100;
	
	// STATIC
	static int nbValeurs;
	static int tabEntier[];
	// METHODES
	static void empiler(int i){
		nbValeurs=nbValeurs+1;
		tabEntier[nbValeurs]=i;
	}
	
	static void empiler(int i, int j){
		nbValeurs=nbValeurs+1;
		tabEntier[nbValeurs]=i;
		nbValeurs=nbValeurs+1;
		tabEntier[nbValeurs]=j;
	}
	
	static void afficherSommet(){
		System.out.println("Affichage du sommet :" +tabEntier[nbValeurs]);
	}
	
	/* ----- MAIN ----- */
	public static void main(String[] args) {
		nbValeurs=0;
		empiler(10);
		
		// Afiichage de toutes les valeurs
		for (int i=0; i<nbValeurs; i++){
			System.out.println("tabEntier["+ i +"] = " + tabEntier[i]);
		}
		
		
	}

}
