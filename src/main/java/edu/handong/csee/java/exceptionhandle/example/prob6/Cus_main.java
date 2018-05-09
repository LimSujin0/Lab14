package edu.handong.csee.java.exceptionhandle.example.prob6;//this is a package name
import java.util.Scanner;//import Scanner class in java.util

public class Cus_main {//this is a public class named Cus_main
	
	public static void main(String[] args) {//this is a main method in this package
		Scanner keyboard = new Scanner(System.in);//instantiate keyboard of Scanner class
		CustomID obj = new CustomID();//instantiate obj of CustomID class
		String name, race;//this is a String type variable name name and race
		int age;//this is a integer type variable named age
		boolean repeat = true;//this is boolean type variable named repeat, and set this variable to true
		while(repeat) {//while repeat it true, execute below block
			try {
				if(obj.getState()==0) {//execute getState in obj, and return value is 0, execute below block
					System.out.print("Enter your name : ");//display "Enter your name : " on the monitor
					name = keyboard.nextLine();//set name to String from user
					obj.set_name(name);//execute set_name in obj passing name as argument
				}
				else if(obj.getState()==1) {//execute setState in obj, and return value is i, execute below block
					System.out.print("Enter your age : ");//display "Enter your age : " on the monitor
					age = keyboard.nextInt();//set age to integer from user
					keyboard.nextLine();//empty the buffer
					obj.set_age(age);//execute set_age in obj passing age as argument
				}
				else {//return value is 2, execute below block 
					System.out.print("Enter your race : ");//display "Enter your race : " on the monitor
					race = keyboard.nextLine();//set race to integer from user
					obj.set_race(race);//execute set_race in obj passing race as argument
					repeat = false;//set repeat to false
				}
			}catch(Exception ci) {//if Exception is occurs, execute below block
				System.out.println(ci.getMessage());//display error message from ci
				continue;//continue while block.
			}
		}
	}
}
