package edu.handong.csee.java.exceptionhandle.example.prob4;
import java.util.Scanner;

public class Bound_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boundary bound = new Boundary();
		Scanner keyboard = new Scanner(System.in);
		int num = 0;
		boolean repeat = true;
		while(repeat) {
			try {
				System.out.println("Enter an integer : " );
				num = keyboard.nextInt();
				bound.receive(num);
			}catch( ArrayIndexOutOfBoundsException e){
				System.out.println("Invalid array index access!");
				repeat = false;
			}	
		}
	}

}
