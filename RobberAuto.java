 import java.awt.Graphics;
 import java.util.Random;
public class RobberAuto  extends Auto {
	private int xRatio, yRatio;

	public RobberAuto()
	{
		super("hoodrack", 30, new Engine("v20", 20, 5000), "red-auto.jpg");	
		
		Random randX = new Random ();
		xRatio = randX.nextInt((5) + 5+1)-5;
		//System.out.println("I`m working in random number generatot");
		
		Random randY = new Random();
		yRatio = randY.nextInt((5) + 5+1)-5;
		super.fillUp();
		
		
		
	}
	@Override
	 public void updateImage(Graphics g) {
		 	drive( 4, (double)xRatio, (double)yRatio);
	        super.updateImage(g);
	        
	       
	 }
	
	public void updateState (int dx, int dy) {
			if (isCaptured())
			super.drive(2, xRatio, yRatio);
			if (getX() + 60 > xRatio|| getX() < 0) {
				if (isEscaped()) {
					escape++;
				}
			if (getY() + 60 > yRatio || getY()< 0  ) {
				
				if (isEscaped())
				{
					escape++;
				}
			}
			
			
		}
		
	}
	
	public static int capture = 0;
	public void captured() {
		setImage("jail.Jpg");
		capture++;
		
	}
	public static int escape = 0;
	
	 public void escape () {
		 escape++;
	 }
	
	public boolean isCaptured() {
	 
		return true;
	}
	public boolean isEscaped() {
		
		return true;
	}
	public  static void countCapture () {
		System.out.println("is captured" + capture+ "/n");	
	}
	public static void countEscape() {
		System.out.println("is escape" + escape + "n");
	}
	
}
