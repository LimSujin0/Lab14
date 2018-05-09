package edu.handong.csee.java.exceptionhandle.example.prob2;//this is a package name
import java.util.*;//import class in java.util package

public class In_exception {//this is a public class named In_exception
	private int x=0, y=0;//this is a private integer variable named x, y/
	public void error_dat() {//this is a public void type method named error_dat
		try {//try
			Scanner keyboard = new Scanner(System.in);//instantiate keyboard of Scanner type
			System.out.print("X : ");//display "X:" on the monitor
			x = keyboard.nextInt();//set x to integer variable from user
			System.out.print("y : ");//display "y: " on the monitor
			y = keyboard.nextInt();//set y to integer variable from user
			System.out.println(x/y);//display result of x/y on the monitor 
		}catch(ArithmeticException e) {//when ArithmeticException occurs, execute below block
			System.out.println("java.long.ArithmeticException : " + e.getMessage());//display "java.long.ArithmeticException : " + e.getMessage() on the monitor 
		}catch(InputMismatchException e) {//when InputMismatchException occurs, execute below block 
			System.out.println("java.util.InputMismatchException");// display "java.util.InputMismatchException" on the monitor
		}catch(Exception e) {//when other exception occurs, execute below block
			System.out.println("Some other exception has occured: " + e.getMessage());//display error message on the monitor
		}
	}
	
}
