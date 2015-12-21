import java.util.ArrayList;

public class Ville
{
	private String nomVille;
	private Pays sonPays;
	private ArrayList <Hotel> sesHotels;
	/**
	 * @return the nomVille
	 */
	public String getNomVille() {
		return nomVille;
	}
	/**
	 * @param nomVille the nomVille to set
	 */
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}
	/**
	 * @return the sonPays
	 */
	public Pays getSonPays() {
		return sonPays;
	}
	/**
	 * @param sonPays the sonPays to set
	 */
	public void setSonPays(Pays sonPays) {
		this.sonPays = sonPays;
	}
	/**
	 * @return the sesHotels
	 */
	public ArrayList<Hotel> getSesHotels() {
		return sesHotels;
	}
	/**
	 * @param sesHotels the sesHotels to set
	 */
	public void setSesHotels(ArrayList<Hotel> sesHotels) {
		this.sesHotels = sesHotels;
	}
	public Ville(String nomVille, Pays sonPays, ArrayList<Hotel> sesHotels) {
		super();
		this.nomVille = nomVille;
		this.sonPays = sonPays;
		this.sesHotels = sesHotels;
	}
	public Ville() {
	}
	
	
	
}