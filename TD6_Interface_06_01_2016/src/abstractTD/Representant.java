package abstractTD;

public class Representant extends Commercial{
	private final static double POURCENT = 0.3;
	private final static int BONUS = 500;
	
	public Representant(String nom, String prenom, int date, int age, double chiffreAffaireMensuel) {
		super(nom, prenom, date, age, chiffreAffaireMensuel);
	}
	
	public double calculerSalaire(){ // A passer en double
		double salaire;
		salaire = POURCENT*getChiffreAffaireMensuel(); // Le salaire = 30% du CA mensuel + 500 ; ne pas oublier le getChiffreAffaireMensuel()
		salaire += BONUS;
		return salaire;
	}

}
