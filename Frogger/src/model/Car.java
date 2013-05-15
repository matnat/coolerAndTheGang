package model;

import java.awt.Image;

public class Car {
	Image bildLinks;
	Image bildRechts;
	private static final String PACMANLI = "src/data/pacman_links_gruen.gif";
	private static final String PACMANRE = "src/data/pacman_rechts_gruen.gif";

	int koordX;

	public Car() {
		this.bildLinks = java.awt.Toolkit.getDefaultToolkit()
				.getImage(PACMANLI);
		this.bildRechts = java.awt.Toolkit.getDefaultToolkit().getImage(
				PACMANRE);
		this.koordX = 0;
	}

}
