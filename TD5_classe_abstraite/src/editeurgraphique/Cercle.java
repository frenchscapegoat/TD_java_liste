package editeurgraphique;
import java.math.*;

public class Cercle extends FormeGeometrique{
	
	double rayon;
	@Override
	double perimetre() {
		double p=2*Math.PI*rayon;// TODO Auto-generated method stub
		return p;
	}

	@Override
	double surface() {
		double s=Math.PI*rayon*rayon;// TODO Auto-generated method stub
		return s;
	}
	

}
