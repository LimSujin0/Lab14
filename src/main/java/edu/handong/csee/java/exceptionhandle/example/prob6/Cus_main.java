package edu.handong.csee.java.exceptionhandle.example.prob6;
import java.util.Scanner;

public class Cus_main {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		CustomID obj = new CustomID();
		String name, race;
		int age;
		boolean repeat = true;
		while(repeat) {
			try {
				if(obj.getState()==0) {
					System.out.print("Enter your name : ");
					name = keyboard.nextLine();
					obj.set_name(name);
				}
				else if(obj.getState()==1) {
					System.out.print("Enter your age : ");
					age = keyboard.nextInt();
					keyboard.nextLine();
					obj.set_age(age);
				}
				else {
					System.out.print("Enter your race : ");
					race = keyboard.nextLine();
					obj.set_race(race);
					repeat = false;
				}
			}catch(Exception ci) {
				System.out.println(ci.getLocalizedMessage());
				continue;
			}
		}
	}
}
