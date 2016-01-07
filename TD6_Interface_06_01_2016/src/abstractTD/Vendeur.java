package abstractTD;

public class Vendeur extends Commercial{
	private final static double POURCENT = 0.2;
	private final static int BONUS = 200;
	
	public Vendeur(String nom, String prenom, int date, int age, double chiffreAffaireMensuel) {
		super(nom, prenom, date, age, chiffreAffaireMensuel);
	}
	
	public double calculerSalaire(){ // A passer en double
		double salaire;
		salaire = POURCENT*getChiffreAffaireMensuel(); // Le salaire = 20% du CA mensuel + 200 ; ne pas oublier le getChiffreAffaireMensuel()
		salaire += BONUS;
		return salaire;
	}
}
