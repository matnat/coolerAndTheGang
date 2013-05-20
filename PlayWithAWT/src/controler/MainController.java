package controler;

import model.Enemy;
import model.Fighter;
import view.MainView;

public class MainController {
	private MainView v;

	public MainController() {
		v = new MainView(this);
		v.addPerson(new Fighter(20, 20));
		v.addPerson(new Enemy(100, 50));
	}


}
