package classesandobjects;

/*
  default 
  non parameterized
  parameterized
  
  constructor chaining
 */
public class Box {

	int length;
	int width;
	int heigth;

 private Box() {
	 this(150, 100,50);
          System.out.println("Inside constructor");
	}

	private Box(int length , int width, int heigth) {
		
		this.length = length;
		this.width = width;
		this.heigth = heigth;
	}
	
	public void test() {
		
		System.out.println("Inside Test Method");
	}

	public static void main(String[] args) {

		Box b1 = new Box(100,150, 50);
		
//		b1.length=150;
//		b1.width=100;
//		b1.heigth=50;

		System.out.println(b1.length);
		System.out.println(b1.width);
		System.out.println(b1.heigth);
	}

}
