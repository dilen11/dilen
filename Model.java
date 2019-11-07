import java.awt.Graphics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
class Model {
	private ArrayList<Sprite> list;
	public Sprite sprite;
	int counter = 99;
	Model() {
		list = new ArrayList<Sprite>();
		sprite = new Bank();
		list.add(sprite);
	}
	public void update(Graphics g) {
			synchronized (list) {
				Iterator<Sprite> it = list.iterator();
				while (it.hasNext()) {
				sprite = it.next();
				sprite.updateImage(g);
			}

		}

	}

	public void sprit1(int x, int y) {
		Sprite aAuto;

		if ((counter % 2) == 0) {
			aAuto = new RobberAuto();
			aAuto.setX(300);
			aAuto.setY(300);
			list.add(aAuto);
			counter++;

		} else {
			aAuto = new CopAuto();
			aAuto.setX(x);
			aAuto.setY(y);
			list.add(aAuto);
			counter++;
		}
	}

	public void updateImage(Graphics g) {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).updateImage(g);	
		}
	}
	public void updateScene(int dx, int dy) {
		synchronized (list) {
			for (int i = 0; i < list.size(); i++) {
				((CopAuto) list.get(i)).updateState(dx, dy);
					if (list.get(i) instanceof CopAuto) {
					for (int j = 0 ; j < list.size();j++) {
						if (list.get(i).overlaps(list.get(j))) {	
						}
					}
					
					
				}
				
				
				
			}

		}
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
		
			Sprite s = (Sprite) iter.next();
			if (s instanceof RobberAuto) {
				if(((RobberAuto)s).isEscaped() == true) {
					iter.remove();
			}
			
		}

	}

	}
	public void initialize() {
		sprite = null;
		list = new ArrayList<Sprite>();
		list.add(new Bank());
		
		
	}
	}
