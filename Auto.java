import java.awt.Graphics;
public class Auto  extends Sprite  {
	private String autoDes;
	private GasTank gasTank;
	private Engine engine;
	public Auto(String autoDes, int maxFuel, Engine engine , String jpgName) {
	super(jpgName);
		if (autoDes.length() != 0)
		{
			this.autoDes = autoDes;
		}
		else 
		{
			this.autoDes = "Generic car";
		}
		if (engine == null) {

			this.engine = new Engine("",30, 100);

		}

		else {
			this.engine = engine;

		}

		this.gasTank = new GasTank(maxFuel);

	}

	public void fillUp() {
		this.gasTank.setLevel(gasTank.getMaxCapacity());

	}

	public void setAutoDes(String autoDes) {
		this.autoDes = autoDes;
	}

	public String getAutoDes() {

		return this.autoDes;
	}

	public String format() {
		String format1 = String.format("%.2f", gasTank.getLevel());
		return format1;

	}

	public String getDescription()

	{

		String des =  getAutoDes() + " (engine : " + engine.getDescription() + " fuel:" + format() 
				+ "/" + gasTank.getMaxCapacity() + ", location:" + "(" + getX() + "," + getY() + ")";

		return des;

	}



	public double getFuelLevel() {
		return this.gasTank.getLevel();
	}

	public int getMPG() {
		return this.engine.getMpg();

	}

	public int getMaxSpeed() {
		return this.engine.getMAXSpeed();
	}


	public double drive(int distance, double xRatio, double yRatio) {
        double gas;
        gas = ((double) distance / engine.getMpg());
        if(gas > gasTank.getLevel())
        {
            
            distance = (int) gasTank.getLevel() * engine.getMpg();
            gasTank.setLevel(0);
            System.out.println("Ran out of gas after driving " + (double) distance + " miles");
            double ratio_constant = (xRatio * xRatio) + (yRatio * yRatio);  
            setX(getX() + (int) ((distance/Math.sqrt(ratio_constant)) * xRatio));  
            setY(getY() + (int) ((distance/Math.sqrt(ratio_constant)) * yRatio));
        }
        
        
        else
        {
       
            gasTank.setLevel(gasTank.getLevel() - gas);
            double ratio_constant = (xRatio * xRatio) + (yRatio * yRatio);
            setX(getX() + (int) ((distance/Math.sqrt(ratio_constant)) * xRatio));             
            setY(getY() + (int) ((distance/Math.sqrt(ratio_constant)) * yRatio));
         }
        return (double) distance;
    }
	
    public void updateImage(Graphics g) {
		  super.updateImage(g);
		 }
    
}







