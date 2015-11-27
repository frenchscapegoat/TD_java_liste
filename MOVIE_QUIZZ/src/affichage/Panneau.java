package affichage;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Panneau extends JPanel{
	
	public void paintComponent(Graphics g)
	{
		try {
			Image maquette = ImageIO.read(new File("./Images/java.png"));
			g.drawImage(maquette, 0, 0, this);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
