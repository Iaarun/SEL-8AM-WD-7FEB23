package classesandobjects;

public class Vehicle {
	
	String enginecapacity;
	String enginetype;
	String seatingcapacity;
	String name;
	
	// accessmodifier static/nonstatic returntype identifier(){ }
	public void engineStarts() {
		System.out.println("EngineStarts");
	}
	
	public void engineStops() {
		System.out.println("EngineStops");
	}
	
	public void display() {
		System.out.println("Engine Capacity: "+enginecapacity+"\nEngine type: "+enginetype 
				);
	}
	
	@Override
	public String toString() {
		return "Vehicle [enginecapacity=" + enginecapacity + ", enginetype=" + enginetype + ", seatingcapacity="
				+ seatingcapacity + ", name=" + name + "]";
	}
	
//	public static void main(String[] args) {
//		Vehicle car = new Vehicle();
//	}

	
	
}
