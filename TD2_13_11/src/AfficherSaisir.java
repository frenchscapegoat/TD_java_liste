import java.math.*;
import java.util.*;
public class AfficherSaisir {
	static double  pi=Math.PI;
	
	public static void main(String[] args) {
		System.out.println("Bonjour ! ");
		
		// Afficher PI avec 3 decimales
		System.out.println("Pi = " +pi);
		System.out.format("%.3f%n", pi);     // -->  "3.142"
		
		// Effectuer une saisie d'un double n
		Scanner sc = new Scanner(System.in);		
		System.out.println("Veuillez saisir un r�el : ");
		double j = sc.nextInt();
		System.out.println("Vous avez saisi le nombre : " +j);
		
		// Afficher un nombre entre 0 et n de facon al�atoire
		double n = sc.nextDouble();
		
	}

}
