
public class CompteCourant {
	private int numero;
	private double solde;
	private double decouvertAutorise;
	
	public CompteCourant(int numero, double solde){
		this.numero = numero;
		this.solde = solde;
		this.decouvertAutorise = 10;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public void setNumero(int n){
		this.numero=n;
	}
}