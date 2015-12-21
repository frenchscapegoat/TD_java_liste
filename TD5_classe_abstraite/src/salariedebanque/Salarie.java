package salariedebanque;

public abstract class Salarie {
	private double salaire;
	protected String nom;
	// Mehtodes
	public double getSalaire(){
		return (salaire);
	}
	public abstract void  verserSalaire();
}
