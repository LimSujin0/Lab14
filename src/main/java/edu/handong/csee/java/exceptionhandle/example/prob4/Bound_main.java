package edu.handong.csee.java.exceptionhandle.example.prob4;//this is a package name
import java.util.Scanner;//import Scanner class in java.util

public class Bound_main {//this is a public class named Bound_main

	public static void main(String[] args) {//this is a main method in this package.
		Boundary bound = new Boundary();//instantiate bound of Boundary class
		Scanner keyboard = new Scanner(System.in);//instantiate keyboard of Scanne classs
		int num = 0;//this is a integer type variable named num.
		boolean repeat = true;//this is a boolean type variable named repeat
		while(repeat) {//while repeat is true, execute below block
			try {//try
				System.out.print("Enter an integer : " );//display "Enter an integer : " on the monitor.
				num = keyboard.nextInt();//set num to integer variable from user.
				bound.receive(num);//execute receive method in bound that has num as argument.
			}catch( ArrayIndexOutOfBoundsException e){//if ArrayInexOutOfBoundsException is occurs, execute below block
				System.out.println("Invalid array index access!");//display "Invalid array index access!" on the monitor
				repeat = false;//set repeat to false
			}	
		}
	}
}
