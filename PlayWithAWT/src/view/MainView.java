package view;

import java.awt.Graphics;
import java.util.LinkedList;

import javax.swing.JFrame;

import model.Person;

import controler.MainController;

public class MainView extends JFrame {
	private static final String SPIELTITEL = "Lp3";
	private static final int FENSTERHOEHE = 400;
	private static final int FENSTERBREITE = 600;
	private MainController c;

	LinkedList<Person> person;

	public MainView(MainController c) {
		super(SPIELTITEL);

		person = new LinkedList<Person>();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(FENSTERBREITE, FENSTERHOEHE);
		this.setLocationRelativeTo(null);

		this.setVisible(true);
	}

	public void addPerson(Person p) {
		person.add(p);
	}

	public void paint(Graphics g) {
		super.paint(g);

		for (Person p : person) {
			g.drawImage(p.getPic(), p.getX(), p.getY(), this);
		}

	}

}
