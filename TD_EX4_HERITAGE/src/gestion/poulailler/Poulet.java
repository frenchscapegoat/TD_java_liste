package gestion.poulailler;

public class Poulet extends Volaille{
	private static double prixKilo=1;
	private static double poidsAbattage=1.2;
	
	//
	// GET / SET
	//
	
	public double getPrix() {
		return poids*prixKilo;
	}
	public static double getPrixKilo() {
		return prixKilo;
	}
	public static void setPrixKilo(double prix) {
		prixKilo = prix;
	}
	public static double getPoidsAbattage() {
		return poidsAbattage;
	}
	public void setPoidsAbattage(double poidsAbattage) {
		this.poidsAbattage = poidsAbattage;
	}
	boolean assezGrosse(){
		return poids >= poidsAbattage;
	}
	public Poulet(double p,int i) {
		super(p,i);
	}
	
	
	
	
}
