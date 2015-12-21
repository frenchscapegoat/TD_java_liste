import java.util.ArrayList;
public class Appli_Tournet
{
	private String nom;
	private String url;
	private ArrayList <Pays> sesPays;
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the sesPays
	 */
	public ArrayList<Pays> getSesPays() {
		return sesPays;
	}
	/**
	 * @param sesPays the sesPays to set
	 */
	public void setSesPays(ArrayList<Pays> sesPays) {
		this.sesPays = sesPays;
	}
	
	
	public static void main (String [] args)
	{
		Pays country = new Pays();
		System.out.println(country.getNomPays());
		System.out.println("Ses villes sont:");
		System.out.println(country.getSesVilles());
		/// CORRECTION
		
		Pays p = new Pays();
		p.setNomPays("Armor");
		
		ArrayList<Ville> listeV = new ArrayList<Ville>();
		Ville V1 = new Ville("Annuminas",p,null);
		Ville V2 = new Ville();
		V2.setNomVille("Fornost");
		V2.setSonPays(p);
		
		listeV.add(V1);
		listeV.add(V2);
		p.setSesVilles(listeV);
		
		System.out.println("Affichage contenu Pays : ");
		System.out.println("\t " + p.getNomPays());
		System.out.println("Affichage ville du pays : " +p.getNomPays());
		
		for (Ville V : p.getSesVilles()){
			System.out.println("\t" + V.getNomVille());
		}
		
		// ON PEUT AUSSI FAIRE AINSI
		System.out.println("Affichage 2e possibilité  : ");

		for (int i=0;i<p.getSesVilles().size();i++){
			System.out.println("\t" +p.getSesVilles().get(i).getNomVille());
		}
	}
}