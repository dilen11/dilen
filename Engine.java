
public class Engine {

	private String engine = null;
	private int Mpg = 0;
	private int maxSpeed = 0;

	public Engine(String engine, int Mpg, int maxSpeed) {
		if (engine.length() >0) {
			this.engine = engine;

		} else {
			this.engine = "Generic Engine";

		}
		if (Mpg < 0) {
			Mpg = 0;

		} else {
			this.Mpg = Mpg;

		}
		if (maxSpeed < 0) {

		}
		{
			this.maxSpeed = maxSpeed;

		}

	}

	public void setEngine(String engine)

	{
		this.engine = engine;

	}

	public void setMpg(int Mpg) {
		this.Mpg = Mpg;
	}

	public void setmaxSpeed(int maxSpeed) {

		this.maxSpeed = maxSpeed;

	}

	public String getEngine() {
		return this.engine;
	}

	public int getMpg() {

		return this.Mpg;
	}

	public int getMAXSpeed() {

		return this.maxSpeed;
	}

	public String getDescription() {
		String figure;

		figure = engine + " (" + "MPG " + Mpg + ", " + "Max speed" + ": " + maxSpeed + ")";

		return figure;
	}

}
