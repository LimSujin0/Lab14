package edu.handong.csee.java.exceptionhandle.example.prob3;//this is a package name
import java.util.Scanner;//import Scanner class in java.util

public class Power_main {//this is a public class name Power_main

	public static void main(String[] args) {//this is a main method in this package
		Powercalc PowerCalc = new Powercalc();//instantiate PiwerCalc of Powercalc class
		Scanner keyboard  = new Scanner(System.in);//instantiate keyboard of Scanner class
		while(keyboard.hasNextInt()) {//while keyboard has nextInt, execute below block
			int n = keyboard.nextInt();//set n to integer variable from user
			int p = keyboard.nextInt();//set p to integer variable from user
			try{//try
				System.out.println(PowerCalc.power(n, p));//display result of power(n,p)
			}catch(Exception e){//if Exception is occurs, execute below 
				System.out.println(e);//display error message on the monitor
			}
		}
	}
}
