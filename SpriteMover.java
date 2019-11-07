
public class SpriteMover implements Runnable {
   
	Model model;
	View view;
	SpriteMover(Model m,  View v ){
		this.model = m;
		this.view = v;
	}
	
	public void run() {
		
		
		    while (true) {

		    	this.model.updateScene(this.view.getWidth(), this.view.getHeight());
	            this.view.repaint();
				
		        try {
		            Thread.sleep(2);
		        } catch (InterruptedException e) {}
		    }
		
	}

}
