package editeurgraphique;

public abstract class FormeGeometrique {
	protected double x;
	protected double y;
	
	void deplacer (double x2, double y2){
		x = x2;
		y = y2;
	}
	void afficher(){
		System.out.println("x= "+x+" ,y= "+y);
	}
	
	// METHODES ABTRAITES
	abstract double perimetre();
	abstract double surface();
	
	// ACCESSEUS
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
}

