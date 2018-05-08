package edu.handong.csee.java.exceptionhandle.example.prob3;
import java.util.Scanner;

public class Power_main {

	public static void main(String[] args) {
		Powercalc PowerCalc = new Powercalc();
		Scanner keyboard  = new Scanner(System.in);
		while(keyboard.hasNextInt()) {
			int n = keyboard.nextInt();
			int p = keyboard.nextInt();
			try{
				System.out.println(PowerCalc.power(n, p));
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
