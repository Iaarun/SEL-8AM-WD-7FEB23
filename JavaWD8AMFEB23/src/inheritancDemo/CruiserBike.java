package inheritancDemo;

public class CruiserBike extends Bike {
	

	String enginecapacity;
	
	
	public CruiserBike(int gear, int speed, String enginecapacity) {
		super(gear, speed);
		this.enginecapacity=enginecapacity;
	}
	
	@Override
	public String toString() {
		return "CruiserBike [enginecapacity=" + enginecapacity + ", gear=" + gear + ", speed=" + speed + "]";
	}
	
	

}
