package polymorphismdemo;

public class Circle extends Shape {

	int radius;

	@Override
	public void area() {
		double area = Math.PI*Math.pow(radius, 2);
	}
	
	public static void parameter() {
		System.out.println("calculate the parameter of shape");
	}
}
