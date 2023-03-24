package abstractiondemo;

public class Test  extends AbstractClass implements Interface1, Interface2{
	
	
	
	public static void main(String[] args) {
		//Annonymous implementation
		AbstractClass abs = new AbstractClass() {
			
			@Override
			public void test1() {
				// TODO Auto-generated method stub
				
			}
		};
		
//		abs.test1();
//		abs.test2();
		
		Test t1 = new Test();
		t1.test1();
		t1.test2();
	}

	@Override
	public void test1() {
		System.out.println("Test 1 method");
		
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
