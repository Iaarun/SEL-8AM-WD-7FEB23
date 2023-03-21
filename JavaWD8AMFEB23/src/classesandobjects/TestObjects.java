package classesandobjects;

public class TestObjects {
	
	public static void main(String[] args) {
		Vehicle car= new Vehicle();
		car.name="volvo";
		car.enginecapacity="2500cc";
		car.seatingcapacity="5";
		car.enginetype="hybrid";
		
		car.engineStarts();
		car.engineStops();
		
		System.out.println(car);
		
		Vehicle bike= new Vehicle();
		bike.name="RoyalEnfield";
		bike.enginecapacity="250cc";
		bike.seatingcapacity="0";
		bike.enginetype="petrol";
		
		bike.engineStarts();
		bike.engineStops();
		
       System.out.println(bike);
		
	//	bike.display();
       
       
       Calculator cal = new Calculator();
       cal.add(10, 12);
		
	}

}
