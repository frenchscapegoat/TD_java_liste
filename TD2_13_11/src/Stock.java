import java.util.Scanner;

public class Stock {

	// D�claration constantes
	static int TAILLE_TAB=5;
	
	// MAIN
	
	public static void main(String[] args) {
		// ---
		// D�clarer Tableaux
		// ---
		char tabchar[];
		double tabdouble[];
		
		
		final int NB_ARTICLES;
		System.out.println("Pouvez-vous me donner un nombre d'articles svp ?");
		Scanner sc = new Scanner(System.in);
		NB_ARTICLES = sc.nextInt();
		
		// ---
		// Allouer les tableaux
		// ---
		tabchar = new char[TAILLE_TAB];
		//int effectiveTabchar = 0;
		tabdouble = new double[NB_ARTICLES];
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
		
		
		// ---
		// Parcours des 2 tableaux avec 2 boucles foreach
		// ---
		//System.out.println("A")
		
		for (char i : tabchar){
			System.out.print(" " +i);
		}
		
		System.out.println();
		
		for (double i : tabdouble){
			System.out.print(" " +i);
		}
		
		System.out.println();
		
		// ---
		// Parcours des 2 tableaux en parall�le avec while + bool
		// ---
		
		boolean fini = false;
		int i = 0;
		while (!fini){
			System.out.println("" +tabchar[i]+ " - " +tabdouble[i]+ " Euros");
			i++;
			fini = (i==tabdouble.length);
		}
		
		

	}

}
