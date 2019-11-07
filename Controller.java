
import java.awt.Graphics;
import java.io.IOException;
import java.awt.event.MouseListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;

import javax.swing.SwingUtilities;


class Controller implements MouseListener , KeyListener
{
    Model model;
    View view;

    Controller() throws IOException, Exception {
        model = new Model();
        view = new View(this);
     
    }

    public void update(Graphics g) {
        model.updateImage(g);
    }

    public void mousePressed(MouseEvent e) {
		if (SwingUtilities.isLeftMouseButton(e)) {
			int x = e.getX();
            int y = e.getY();
            model.sprit1(e.getX(),e.getY());
         
         view.repaint();
        
		
		}
		else if (SwingUtilities.isRightMouseButton(e)) 
		{
			model.updateScene(view.getWidth(), view.getHeight());
	         view.repaint();
			
		}
    }

    public void mouseReleased(MouseEvent e) {    }
    public void mouseEntered(MouseEvent e) {    }
    public void mouseExited(MouseEvent e) {    }
    public void mouseClicked(MouseEvent e) {    }

    public static void main(String[] args) throws Exception {
        
   System.out.println("cwd=" + System.getProperty("user.dir"));
        new Controller();
    }

	
	public void keyPressed(KeyEvent e) {
		 
		char ch = e.getKeyChar();
		if (ch == 'h') {
			System.out.println("hellow world");
		}
		
		if (ch == 'n') {
			RobberAuto.countCapture();
			RobberAuto.countEscape();
			
			
		}
		if (ch == 'r') {
			RobberAuto.capture = 0;
			RobberAuto.escape = 0;
			
			 
			
		}
      	if (ch == 's') {
      		Thread t = new Thread(new SpriteMover(model,view));
      		t.start();
      		
      	}
	}

	
	public void keyReleased(KeyEvent e) {
		
		
	}

	
	public void keyTyped(KeyEvent e) {
		
		
	}
}

