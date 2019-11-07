
public class GasTank {
	private int MaxCapacity;
	private double Level;

	GasTank(int MaxCapacity) {
		if (MaxCapacity < 0) {

			MaxCapacity = 0;
		}

		else {
			this.MaxCapacity = MaxCapacity;
		}
	}

	public void setMaxCapacity(int MaxCapacity) {
		this.MaxCapacity = MaxCapacity;
	}

	public void setLevel(double Lvl) {
		if (Lvl < 0) {
			Lvl = 0;
		} else {
			this.Level = Lvl;
		}
	}

	public int getMaxCapacity() {
		return this.MaxCapacity;
	}

	public double getLevel() {
		return this.Level;
	}
}

