// Correction en commentaires
public class Enfant {
	private final static int MAX_CADEAUX = 5;
	
	private String prenom;
	private boolean sage;
	private Cadeau[] cadeaux;
	private int currentNbCadeaux;
	
	public Enfant(String prenom, boolean sage){
		this.prenom = prenom;
		this.sage = false;
		// On initialise les autres oaram�tres
		this.cadeaux = new Cadeau[MAX_CADEAUX];
		this.currentNbCadeaux = 0;
		//
	}
	
	public void ajouterCadeau(Cadeau aOffrir){
		// V�rification n�cessaire
		if(currentNbCadeaux < MAX_CADEAUX){
			cadeaux[currentNbCadeaux] = aOffrir;
			currentNbCadeaux++;
		}
		//

	}
	
	public boolean aEteSage(){
		// On v�rifie si sage ou pas sage
		return this.sage;
		//
	}
	
	public String getPrenom(){
		System.out.println("Le pr�nom de cet enfant est : " + prenom);
		//
		return this.prenom;
	}
	
	public int getCurrentNbCadeaux(){
		System.out.println("Le nombre de cadeaux de cet enfant est : " + currentNbCadeaux);
		//
		return this.currentNbCadeaux;
		
	}
	
	
}
