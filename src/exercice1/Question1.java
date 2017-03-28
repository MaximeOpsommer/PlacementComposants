package exercice1;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JWindow;

// ne s'affiche pas sur linux
public class Question1 extends JWindow{

	private static final long serialVersionUID = 1L;

	public Question1() {
		this.getContentPane().add(new JLabel("Hello World!"));
		this.setSize(new Dimension(500, 500));
		this.setBounds(0, 0, 300, 200);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new Question1();
	}

}