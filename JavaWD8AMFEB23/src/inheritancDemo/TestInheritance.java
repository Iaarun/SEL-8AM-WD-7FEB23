package inheritancDemo;

public class TestInheritance {
	
	public static void main(String[] args) {
		CruiserBike cb = new CruiserBike(6, 80, "650CC");
		
		cb.acclerate(10);
		
		System.out.println(cb);
		
		
		MountainBike mb = new MountainBike(4, 50, 125);
		
		mb.applybrakes(15);
		System.out.println(mb);
		
		
		RacingBike bike = new RacingBike(6, 150, 125);
		System.out.println(bike);
	}

}
