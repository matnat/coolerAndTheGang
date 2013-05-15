package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class MainView extends JFrame {

	private static final String SPIELTITEL = "Mein Spiel";
	private static final int FENSTERHOEHE = 400;
	private static final int FENSTERBREITE = 600;
	private static final int FROGHOEHE = 30;
	private static final int FROGBREITE = 30;
	private static final int STARTFROGX = (FENSTERBREITE / 2)
			- (FROGBREITE / 2);
	private static final int STARTFROGY = FENSTERHOEHE - FROGHOEHE;
	private static final String FROGPFAD = "src/data/smiley.gif";
	private static final String PFLASTERSTEINEPFAD = "src/data/pflasterstein.jpg";
	private static final String PACMANPFAD = "src/data/pacman_links_gruen.gif";
	private static final int SCHRITT = 10;

	public static void main(String[] args) {
		MainView spiel = new MainView();
	}

	Image bildFrog;
	Image bildPflaster;
	Image bildPacman;
	int frogX = STARTFROGX;
	int frogY = STARTFROGY;

	MainView() {

		super(SPIELTITEL);
		this.bildFrog = java.awt.Toolkit.getDefaultToolkit().getImage(FROGPFAD);
		this.bildPflaster = java.awt.Toolkit.getDefaultToolkit().getImage(
				PFLASTERSTEINEPFAD);
		this.bildPacman = java.awt.Toolkit.getDefaultToolkit().getImage(
				PACMANPFAD);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// System.out.println(bild.getHeight(this));
		this.setSize(FENSTERBREITE, FENSTERHOEHE);
		this.setLocationRelativeTo(null);

		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int keyCode = e.getKeyCode();
				if (keyCode == e.VK_LEFT) {
					frogX = frogX - SCHRITT;
					repaint();
					return;
				}
				if (keyCode == e.VK_RIGHT) {
					frogX = frogX + SCHRITT;
					repaint();
					return;
				}
				if (keyCode == e.VK_UP) {
					frogY = frogY - SCHRITT;
					repaint();
					return;
				}
				if (keyCode == e.VK_DOWN) {
					frogX = frogX + SCHRITT;
					repaint();
					return;
				}

			}
		});

		this.setVisible(true);

	}

	public void paint(Graphics g) {
		super.paint(g);
		// g.drawLine(50, 50, 200, 200);
		// for (int i = 0; i < FENSTERBREITE / 10; i++) {
		// for (int j = 0; j < FENSTERHOEHE / 10; j++) {
		// g.drawImage(bildPflaster, i * 10, j * 10, this);
		// }
		// }

		// for (int i=0; i<5; i++){

		g.drawImage(bildFrog, frogX, frogY, this);
		// frogX = frogX + 30;

		// }

	}
}
