package banquestatic;

public class Client {
	// On crée un compteur d'instance
	private static int nbClients;
	private int numero;
	
	private String nom;
	private int anneeNaissance;
	
	// Constructeur
	public Client (){
		// incrémenter le nbClients
		nbClients ++;
		// Fixer le numéro de ce client
		numero = nbClients;
	}
	public Client (String nom){
		this();
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAnneeNaissance() {
		return anneeNaissance;
	}
	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}
	// MAIN
	
	public static void main (String args[]){
		Client c1 = new Client ("Petri");
		Client c2 = new Client ("Oups");
		
		System.out.println("Client" + c1.getNom() +" : no = " + c1.numero);
		System.out.println("Client" + c2.getNom() +" : no = " + c2.numero);
	}
}