package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;

public class MainView extends JFrame {

	public static void main(String[] args) {
		MainView spiel = new MainView();
	}

	Image bild;

	MainView() {

		super("Mein Frogger");
		this.bild = java.awt.Toolkit.getDefaultToolkit().getImage(
				"smiley.gif");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(200, 300);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}

	public void paint(Graphics g) {
		super.paint(g);
	//	g.drawLine(50, 50, 200, 200);
		g.drawImage(bild, 10, 10, null);

	}
}
