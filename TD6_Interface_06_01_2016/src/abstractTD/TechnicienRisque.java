package abstractTD;

public class TechnicienRisque extends Technicien{
	public void calculerSalaire(){ // A passer en double
	return super().calculerSalaire()+PRIME; //Rajouter interface et mettre Prime = 200	
	}

}
