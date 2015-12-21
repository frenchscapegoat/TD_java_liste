
public class Pile {
	final int NB_MAX=100;
	private int nbValeurs;
	private int tabEntier[] = new int [NB_MAX];
	
	// CONSTRUCTEUR
	Pile(){
		nbValeurs = 10;
		tabEntier  = new int [NB_MAX];
		for (int i : tabEntier){
			tabEntier[i] = i;
			i++;
		}
		
	}
	
	Pile(int nb){
		// A NE PAS FAIRE !!!
		/*int tabEntier[]  = new int [nb];
		for (int i : tabEntier){
			tabEntier[i] = i;
			i++;
		}*/
		
		// LUI IL EST CORRECT
		
		tabEntier  = new int [nb];
		for (int i : tabEntier){
			tabEntier[i] = i;
			i++;
		}
	}
	// GET | SET
	
	public int getNbValeurs() {
		return nbValeurs;
	}

	public void setNbValeurs(int nbValeurs) {
		this.nbValeurs = nbValeurs;
	}

	public int[] getTabEntier() {
		return tabEntier;
	}

	public void setTabEntier(int[] tabEntier) {
		this.tabEntier = tabEntier;
	}

	// METHODES
	void empiler(int i){
		nbValeurs=nbValeurs+1;
		tabEntier[nbValeurs]=i;
	}
	
	void empiler(int i, int j){
		nbValeurs=nbValeurs+1;
		tabEntier[nbValeurs]=i;
		nbValeurs=nbValeurs+1;
		tabEntier[nbValeurs]=j;
	}
	
	void afficherSommet(){
		System.out.println("Affichage du sommet :" +tabEntier[nbValeurs]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pile unePile = new Pile();
		unePile.nbValeurs=0;
		
		
		// Afiichage de toutes les valeurs
		for (int i=0; i<unePile.nbValeurs; i++){
			System.out.println("tabEntier["+ i +"] = " + unePile.tabEntier[i]);
		}
	}

}
