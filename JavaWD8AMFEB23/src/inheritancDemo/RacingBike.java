package inheritancDemo;

public class RacingBike extends MountainBike{

	public RacingBike(int gear, int speed, int seatheight) {
		super(gear, speed, seatheight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RacingBike [seatheight=" + seatheight + ", gear=" + gear + ", speed=" + speed + "]";
	}
	
	

}
