package affichage;

import java.awt.Color;

import javax.swing.JFrame;

public class Fenetre extends JFrame {

	//DEFINITION CONSTRUCTEUR PAR DEFAULT
	public Fenetre() {
		this.setTitle("Movie quiz IUT Orsay -- beta");
		this.setSize(480, 800);
		this.setResizable(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		Panneau panTest = new Panneau();
		panTest.setBackground(Color.BLACK);
		
		this.setContentPane(panTest);
		
	}
	
	//MAIN POUR FAIRE DES TESTS AVEC LA FENETRE
	public static void main(String[] args) {
		Fenetre fenTest = new Fenetre();

	}

}
