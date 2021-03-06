
public class Tabtables {
	final int NB_MAX = 10;
	
	Table tabTable[];
	int nbTables;
	
	// Constructeur
	Tabtables(){
		tabTable = new Table[NB_MAX];
	}
	
	// Ajouter
	void  ajouterTable (Table uneTable) {
		tabTable[nbTables] = uneTable;
		nbTables++;
	}
	
	// afficher
	/* Explications
	 * Pour le tableau d'objet qu'on va passer en cible
	 * On parcourt tout le tableau, qu'il pointe vers une r�f�rence ou qu'il pointe vers null
	 * Pour enlever ceux qui pointent vers null, on utilise le if uneTable!=null
	 * uneTable est une r�f�rence ; java va copier
	 * tableauDeTables.tabTable[0], et le contenu vers lequel il pointe (attributs nb_pieds, couleur,etc...)
	 * On utilise la m�thode afficher de la classe table, pour afficher le contenu de la table 
	 *  
	 */
	void afficherTable(){ 
		System.out.println("Contenu de la table");
		for(Table uneTable : tabTable){
			if (uneTable!=null){
				uneTable.afficher();	
			}
		}
	}
	
	public static void main(String args[]){
		Tabtables tableauDeTables = new Tabtables();
		Table table1 = new Table(6);
		tableauDeTables.ajouterTable(table1);
		System.out.println("nb_pieds de table1 = " +tableauDeTables.tabTable[0].nb_pieds);
		table1.afficher();
	}
}
