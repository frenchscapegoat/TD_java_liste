import java.util.Scanner;

public class TypesDeBase {

	public static void main(String[] args) {
		//----------- 
		// Declaration de vairables locales � la m�thode main():
		// Types de base qui existent en C
		//----------- 
		short s;
		int i;
		long l;
		
		float f;
		double d;
		char c;

		//----------- 
		// Declaration de vairables locales � la m�thode main():
		// Types de base qui existent en C
		//----------- 
		byte by;
		boolean b;
		
		//----------- 
		// Affectation de qques valeurs
		//----------- 
		i = 0;
		b = true ;
		c ='a';
		
		//----------- 
		// Afichages
		//----------- 
		System.out.print(i); // Affichage de i sans retour � la ligne
		System.out.println(c); // Affichage du contenu de c avec retour � la ligne
		System.out.println("i vaut " +i); // Texte + contenu de i
		System.out.printf("Affichage format� : %3.2f", 100.678); // Affiche flottant avec 3 chiffres pour entiers, et 2 pour virgule ; arrondi au dessus
		System.out.println(); // retour ligne
		
		//-----------
		// Lecture clavier
		//-----------
		Scanner sc = new Scanner(System.in); // A QUOI CA SERT
		System.out.println("Veuillez saisir un mot : ");
		String str = sc.nextLine();
		System.out.println("Vous avez saisi : " +str);
		
		System.out.println("Veuillez saisir un entier : ");
		int j = sc.nextInt();
		System.out.println("Vous avez saisi le nombre : " +j);

		//----------- 
		// Constantes
		//----------- 
		final int N = 20;
		final int M;
		System.out.println("Veuillez saisir un entier : ");
		M = sc.nextInt();
		
		//----------- 
		// Conversions implicites
		//----------- 
		int k = 1000;
		long lo;
		lo = k;
		System.out.println("J'ai effectu� uneconversion implicite : " +lo);
		
		//----------- 
		// Conversions explicites
		//-----------
		i = (int) 2.5;
		System.out.println("valeur de (int) 2.5 : " +i);
		
	}

}
