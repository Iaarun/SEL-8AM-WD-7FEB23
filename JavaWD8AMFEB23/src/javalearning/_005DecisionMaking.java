package javalearning;

import java.util.Scanner;

/*
 if 
 switch case
 
 
 */
public class _005DecisionMaking {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		_005DecisionMaking dm = new _005DecisionMaking();
		dm.switchCaseDemo();
	}
	
	public void add() {
		
		System.out.println("Enter first number");
		int num1 = in.nextInt();
		System.out.println("Enter second number");
		int num2 = in.nextInt();
		
		int result = num1+num2;
		System.out.println(result);
	}
	
	public void ifdemo() {
		/*
		 if(condition){
		 code
		 }
		 */
		System.out.println("Enter age");
		int age = in.nextInt();
		
		if(age>=18) { 
			System.out.println("user is able to get the license");
		}else {
			System.out.println("Minors cannot get the license");
		}
	
	}

   public void nestedif() {
	   System.out.println("Enter age");
	   int age = in.nextInt();
	   if(age>=18) {
		   System.out.println("Have you cleared the test");
		   boolean test = in.nextBoolean();
		   if(test) {
			   System.out.println("Congratulations!!");
		   }else {
			   System.out.println("You have to clear the test first");
		   }
		   
	   }else {
		   System.out.println("Minors are not allowed to get the license");
	   }
   }

  public void ladderif() {
	  System.out.println("Check traffic signal");
	  String signaldata = in.next();
	  
	  if(signaldata.equalsIgnoreCase("red")) {
		  System.out.println("STOP");
	  }else if(signaldata.equalsIgnoreCase("yellow")) {
		  System.out.println("PREPARE TO STOP/GO");
	  }else if(signaldata.equalsIgnoreCase("green")) {
		  System.out.println("GO");
	  }else {
		  System.out.println("Take proper decision");
	  }
  }
  
  public void switchCaseDemo() {
	  System.out.println("Check traffic signal");
	  String signaldata = in.next();
	  
	  switch(signaldata.toLowerCase()) {
	  case "red":
		  System.out.println("STOP");
		  break;
	  case "yellow":
		  System.out.println("PREPARE TO STOP/GO");
		  break;
	  case "green":
		  System.out.println("GO");
		  break;
	  default: 
		  System.out.println("Take proper decision");
		  break;
			  
	  }
  }
}
