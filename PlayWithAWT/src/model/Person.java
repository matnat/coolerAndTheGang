package model;

import java.awt.Image;


public class Person {
	private int x;
	private int y;
	private Image pic;

	public Person(int x, int y, String pic) {
		this.x = x;
		this.y = y;
		this.pic = java.awt.Toolkit.getDefaultToolkit().getImage(pic);;
	}

	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}

	public Image getPic() {
		return pic;
	}

}
