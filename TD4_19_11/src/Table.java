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
	void afficher(){
		System.out.println(nb_pieds);
		System.out.println(couleur);
		System.out.println(prix);
		System.out.println();
	}

	public static void main(String[] args) {
		Table t1;
		t1 = new Table();
		System.out.println("Nombre de pieds : " +t1.nb_pieds);
		System.out.println("Prix : " +t1.prix);
		System.out.println("Couleur : " +t1.couleur);
		
		/// Suite exercice
		Table t = new Table();
		t.afficher();
		
		// Creer table2
		Table t2 = new Table(3);
		t2.afficher();
		
		// Creer table3
		Table t3 = new Table(6, Table.NOIR);
		t3.afficher();
		
		/* EXERCICE B */
		Table t4;
		t4 = t3;
		t3.prix=t3.prix*20/100.0; // Il faut affecter un t3.prix � 1 par d�faut, histoire d'afficher un r�sultat
		System.out.println(t4.prix); // On affiche via la r�f�rence t4
		// Sch�ma de la m�moire sur feuille libre
		
		/* EXERCICE C */
		
		// D�claration d'un tableau de tables
		final int NB_TABLES_MAX=4;
		Table tables[]; // On cr�e l'objet tables, qui contient des tables
		int nbTables = 3;
		
		// Cr�ation d'un tableau de 4 ref vers table
		Table table1 = new Table();
		
		// Cr�ation 3 table et stockage adresse dans les 3 premieres cases du tableau
		
		
		// Test avant attribut prix
		
		
		// Parcourt des 4 cases du tableau et affichage prix et calcul total de prix
		
		
		
	}

}