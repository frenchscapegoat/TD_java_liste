package salariedebanque;

public class Employe extends Salarie{

	@Override
	public void verserSalaire() {
		// TODO Auto-generated method stub
		System.out.println("Versement de salaire sur compte externe : " + nom + getSalaire());
	}

}
