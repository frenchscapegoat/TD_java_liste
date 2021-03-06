public class Table {
	int nb_pieds;
	String couleur;
	double prix;
	
	// Static
	final static String NOIR = "Noir";
	final static String BLANC = "Blanc";
	final static String MARRON = "Marron";
	
	// Constructeur
	Table (){
		nb_pieds=4;
		couleur = MARRON;
		prix = 1;
	}
	
	// Rajout constructeurs
	Table (int nb){
		this();
		nb_pieds=nb;
		//this.nb_pieds = nb; // C'est la meme chose qu'au dessus !!
	}
	
	Table (int nb, String coul){
		this(nb);
		couleur=coul;
	}
	
	// Affichage attributs de la cible
	public void afficher(){
		System.out.println("Affichage des caract�ristiques de la table ");
		System.out.println();
		System.out.println(nb_pieds);
		System.out.println(couleur);
		System.out.println(prix);
		System.out.println();
	}

	public static void main(String[] args) {
		// D�claration tableau
		Table t1;
		
		// Allocation m�moire t1
		t1 = new Table();
		
		// Affichage des caract�ristiques du constructeur de base
		System.out.println("Caract�ristiques Constructeur de base : ");
		System.out.println("Exemple de t1");
		System.out.println("Nombre de pieds : " +t1.nb_pieds);
		System.out.println("Prix : " +t1.prix);
		System.out.println("Couleur : " +t1.couleur);
		
		/// D�claration et allocation t
		Table t = new Table();
		System.out.println("Table t avec constructeur � 0 param�tre ");
		t.afficher();
		
		// D�claration et allocation table2
		Table t2 = new Table(3);
		System.out.println("Table t2 avc constructeur � 1 param�tre ");
		t2.afficher();
		
		// D�claration et allocation table3
		Table t3 = new Table(6, Table.NOIR);
		System.out.println("Table t3 avec constructeur � 2 param�tres ");
		t3.afficher();
		
		
		//
		/* EXERCICE B */
		//
		
		Table t4;
		t4 = t3;
		t3.prix=t3.prix*20/100.0; // Il faut affecter un t3.prix � 1 par d�faut, histoire d'afficher un r�sultat
		
		System.out.println(t4.prix); // On affiche via la r�f�rence t4
		
		//
		/* EXERCICE C */
		//
		

		
		// ----------------------------------------LALAL-------------------
		// Cr�ation d'un tableau de 4 ref vers table

		
		// Cr�ation 3 table et stockage adresse dans les 3 premieres cases du tableau
		
		
		// Test avant attribut prix
		
		
		// Parcourt des 4 cases du tableau et affichage prix et calcul total de prix
		
		
		
	}

}