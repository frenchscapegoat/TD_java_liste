package abstractTD;

public abstract class Commercial extends Employe{
	// CONTIENT uniquement le chiffre d'affaire mensuel
	private double chiffreAffaireMensuel;
	
	// CONSTRUCTOR
	public Commercial(String nom, String prenom, int date, int age, double chiffreAffaireMensuel) {
		super(nom, prenom, date, age);
		this.chiffreAffaireMensuel=chiffreAffaireMensuel;
 }



	public double getChiffreAffaireMensuel() {
		return chiffreAffaireMensuel;
	}


}
