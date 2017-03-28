package exercice1;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Question4 extends JFrame {

	private static final long serialVersionUID = 1L;

	public Question4() {
		this.setTitle("JFrame");
		this.getContentPane().add(new JLabel("Hello World!"));
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
	}
	
	public static void main(String[] args) {
		new Question4();
	}
	
}
