import java.awt.Image;
import java.util.ArrayList;

public class Hotel
{
	private String nomHotel;
	private Image photo;
	private String commentaire;
	private Ville saVille;
	private ArrayList <Type_chambre> sesTypes_Chambres;
	/**
	 * @return the nomHotel
	 */
	public String getNomHotel() {
		return nomHotel;
	}
	/**
	 * @param nomHotel the nomHotel to set
	 */
	public void setNomHotel(String nomHotel) {
		this.nomHotel = nomHotel;
	}
	/**
	 * @return the photo
	 */
	public Image getPhoto() {
		return photo;
	}
	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(Image photo) {
		this.photo = photo;
	}
	/**
	 * @return the commentaire
	 */
	public String getCommentaire() {
		return commentaire;
	}
	/**
	 * @param commentaire the commentaire to set
	 */
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	/**
	 * @return the saVille
	 */
	public Ville getSaVille() {
		return saVille;
	}
	/**
	 * @param saVille the saVille to set
	 */
	public void setSaVille(Ville saVille) {
		this.saVille = saVille;
	}
	/**
	 * @return the sesTypes_Chambres
	 */
	public ArrayList<Type_chambre> getSesTypes_Chambres() {
		return sesTypes_Chambres;
	}
	/**
	 * @param sesTypes_Chambres the sesTypes_Chambres to set
	 */
	public void setSesTypes_Chambres(ArrayList<Type_chambre> sesTypes_Chambres) {
		this.sesTypes_Chambres = sesTypes_Chambres;
	}
	
}