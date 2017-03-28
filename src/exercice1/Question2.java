package exercice1;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

// pas de setDefaultCloseOperation, veuillez bien quitter le processus apres fermeture
public class Question2 extends JFrame {

	private static final long serialVersionUID = 1L;

	public Question2() {
		this.setTitle("JFrame");
		this.getContentPane().add(new JLabel("Hello World!"));
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new Question2();
	}
	
}
