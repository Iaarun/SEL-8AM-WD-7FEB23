package inheritancDemo;

public class MountainBike extends Bike{
	
	int seatheight;

	public MountainBike(int gear, int speed, int seatheight) {
		super(gear, speed);
		this.seatheight = seatheight;
	}

	@Override
	public String toString() {
		return "MountainBike [seatheight=" + seatheight + ", gear=" + gear + ", speed=" + speed + "]";
	}

	
	
	
	

}
