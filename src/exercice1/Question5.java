package exercice1;

import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Question5 extends JFrame {

	private static final long serialVersionUID = 1L;

	public Question5() {
		this.setTitle("JFrame");
		this.getContentPane().add(new JLabel("Hello World!"));
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		
		JDialog dialog = new JDialog(this);
		dialog.setTitle("JDialog");
		dialog.setSize(new Dimension(100, 50));
		dialog.setLocationRelativeTo(this);
		dialog.setModal(true);
		dialog.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Question5();
	}
	
}
