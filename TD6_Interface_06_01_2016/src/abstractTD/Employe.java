package abstractTD;

public abstract class Employe {
	private String nom;
	private String prenom;
	private int date;
	private int age;
	
	// Un constructeur si possible
	public Employe(String nom, String prenom, int date, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.date = date;
		this.age = age;
	}
	
	// METHODES
	public abstract double calculerSalaire(); // A passer en double
		
	


	public String getNom(){
		return prenom.concat(nom); // sinon on pouvait faire + prenom + " " + nom;
	}
}
