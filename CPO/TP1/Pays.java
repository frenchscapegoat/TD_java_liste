import java.util.ArrayList;

public class Pays
{
	private String nomPays;
	private ArrayList <Ville> sesVilles;
	/**
	 * @return the nomPays
	 */
	public String getNomPays() {
		return nomPays;
	}
	/**
	 * @param nomPays the nomPays to set
	 */
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}
	/**
	 * @return the sesVilles
	 */
	public ArrayList<Ville> getSesVilles() {
		return sesVilles;
	}
	/**
	 * @param sesVilles the sesVilles to set
	 */
	public void setSesVilles(ArrayList<Ville> sesVilles) {
		this.sesVilles = sesVilles;
	}
	public Pays(String nomPays, ArrayList<Ville> sesVilles) {
		super();
		this.nomPays = nomPays;
		this.sesVilles = sesVilles;
	}
	public Pays(String nomPays) {
		super();
		this.nomPays = nomPays;
	}
	public Pays(ArrayList<Ville> sesVilles) {
		super();
		this.sesVilles = sesVilles;
	}
	public Pays() {
		nomPays="lala";
	}
	
	
	

}