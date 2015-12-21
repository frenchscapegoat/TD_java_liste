package gestion.poulailler;

public class Canard extends Volaille{
	private static double prixKilo=1.2;
	private static double poidsAbattage=1.5;
	
	//
	// GET / SET
	//
	
	public double getPrix() {
		return poids*prixKilo;
	}
	public static void changerPrixKilo(double prix) {
		Canard.prixKilo = prix;
	}
	public static double getPoidsAbattage() {
		return poidsAbattage;
	}
	public static void setPoidsAbattage(double poidsAbattage) {
		Canard.poidsAbattage = poidsAbattage;
	}

	boolean assezGrosse(){
		return poids >= poidsAbattage;
	}
	
	//
	public Canard(double p, int i) {
		super(p,i);
	}
	
	

}
