import java.awt.Graphics;
import java.util.Random;
public class CopAuto  extends Auto {
	private static int xRatio, yRatio;
	private int X , Y;

	public CopAuto()
	{
		super("LAPD", 5000, new Engine("v300", 30, 5000), "cop-auto.jpg");	
		Random rand = new Random ();
		xRatio = rand.nextInt((5+5+1)-5);
		yRatio = rand.nextInt((5+5+1)-5);
		super.fillUp();
		
	}	
	@Override
	public void updateImage(Graphics g) {
	        super.updateImage(g);
	       drive( 20, (double)xRatio, (double)yRatio);
	 }
	
	public void updateState(int dx, int dy) {
		if (Math.abs(this.X) != Math.abs(this.X)) {
			this.X = xRatio;
		}
		if (Math.abs(this.Y) != Math.abs(this.Y)) {
			this.Y = yRatio;
		}
		if (getX() > dx)
		{	
			
			X = (-1)* X;
				
		}
		else if (getX() < 0) {
			
			X = (-1)* X;
			
		}
		else if (getY()  > dy) {
			
			
			Y = (-1)* Y;
		}
		else if (getY()< 0 ) {
			
			
			Y = (-1)* Y;
		}
	super.drive(2, this.X, this.Y);
			
    }
	

}

