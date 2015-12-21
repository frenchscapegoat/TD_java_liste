package interfacejdk;

import java.util.*;

public class Personne implements Comparable{
	String prenom ;

	String nom ;

	int anneeNaissance ;

	// Tester cette classe

	public static void main (String args []) {

		Personne p0 = new Personne ("Durand", "Albert", 1978);

		Personne p1 = new Personne ("Acap", "Paul", 1975);

		Personne p2 = new Personne ("Durand", "Albert", 1973);

		Personne tp [] = new Personne [3];

		tp [0] = p0 ;

		tp [1] = p1 ;

		tp [2] = p2 ;

		System.out.println ("AVANT LE TRI :");

		afficher (tp);

		System.out.println ("TRI EN COURS ...");

		Arrays.sort (tp) ;

		System.out.println ("APRES LE TRI :");

		afficher (tp);

	}

	// Constructeur

	Personne (String nom, String prenom, int anneeNaissance) {

		this.nom = nom ;

		this.prenom = prenom ;

		this.anneeNaissance = anneeNaissance ;

	}

	// Pouvoir comparer deux personnes (ON CHOISIT SELON LEUR ANNEE DE NAISSANCE)
	// Retourner une version chaine de caracteres

	public String toString () {

		return nom.toUpperCase() + " " + prenom + " (" + anneeNaissance + ")";

	}

	// Afficher un tableau de personnes
	static void afficher (Personne t[]) {

		System.out.println ();

		for (int i=0; i < t.length; i++){

			System.out.println (t[i] + " ");
		}
	}

	@Override
	public int compareTo(Object o) {
		// On fait un Downcast pour dire qu'on est sur une personne
		if (((Personne) o).anneeNaissance < this.anneeNaissance)
			return +1;
		else if (((Personne) o).anneeNaissance > this.anneeNaissance)
			return -1;
		return 0;
	}
}