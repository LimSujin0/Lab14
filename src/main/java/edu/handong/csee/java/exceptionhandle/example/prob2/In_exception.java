package edu.handong.csee.java.exceptionhandle.example.prob2;
import java.util.*;//import class in java.util package

public class In_exception {
	private int x=0, y=0;
	//public In_exception() {}
	public void error_dat() {
		try {
			Scanner keyboard = new Scanner(System.in);
			System.out.print("X : ");
			x = keyboard.nextInt();
			System.out.print("y : ");
			y = keyboard.nextInt();
			System.out.println(x/y);
		}catch(ArithmeticException e) {
			System.out.println("java.long.ArithmeticException : " + e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		}catch(Exception e) {
			System.out.println("Some other exception has occured: " + e.getMessage());
		}
	}
	
}
