
public class Stock {

	// D�claration constantes
	static int TAILLE_TAB=5;
	
	
	public static void main(String[] args) {
		// ---
		// D�clarer Tableaux
		// ---
		char tabchar[];
		double tabdouble[];
		
		
		// ---
		// Allouer les tableaux
		// ---
		tabchar = new char[TAILLE_TAB];
		//int effectiveTabchar = 0;
		tabdouble = new double[TAILLE_TAB];
		//int effectiveTabdouble = 0;
		
		// ---
		// Mettre des valeurs dans les cases
		// ---
		tabchar[0]='A';
		tabchar[1]='B';
		tabchar[2]='C';
		
		tabdouble[0]=10.5;
		tabdouble[1]=2.5;
		tabdouble[2]=21.5;
		final int NB_ARTICLES;
		NB_ARTICLES=3;
		// ---
		// Parcours des 2 tableaux avec 2 boucles foreach
		// ---
		for (double i : tabdouble){
			System.out.println(tabchar[i]);
			System.out.println(tabdouble[i]);
		}
		
		// ---
		// Parcours des 2 tableaux en parall�le avec while + bool
		// ---
		
		
		

	}

}
