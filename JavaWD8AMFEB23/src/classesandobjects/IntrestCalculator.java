package classesandobjects;

public class IntrestCalculator {
	public static void main(String[] args) {
		int p=10000;
		int r=10;
		int t = 2;
		
		double totalamount= p+ simpleintrest(p, r, t);
		System.out.println(totalamount);
		
		IntrestCalculator ic = new IntrestCalculator();
		
	}
	
	
	public  static double simpleintrest(int p, int r, int t) {
		double intrest = (p*r*t)/100;
		System.out.println(intrest);
		
		return intrest;
	}

	
	public void test() {
		int a=10;
		int b =10;
	//	a+b
	}
}
