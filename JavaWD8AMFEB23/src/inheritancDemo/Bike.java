package inheritancDemo;

public class Bike {

	public int gear;
	protected int speed;

	public Bike(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}

	public void acclerate(int increment) {
		speed += increment;
	}

	public void applybrakes(int decrement) {
		speed -= decrement;
	}

	@Override
	public String toString() {
		return "Bike [gear=" + gear + ", speed=" + speed + "]";
	}

}
