package edu.handong.csee.java.exceptionhandle.example.prob5;//this is a package name
import java.util.Scanner;//import Scanner class of java.util

public class My_main {//this is a public class named My_main
	
	public static void main(String[] args) {//this is a main method of this package.
		// TODO Auto-generated method stub
		
		try {//try below block
			Scanner keyboard = new Scanner(System.in);//instantiate keyboard of Scanner class
			String str = keyboard.next();//set str(String) to String from user
			My_main.myTest(str);//execute myTest method in My_main that have str as argument
		}catch(MyException mae) {//when MyException occurs, execute below block
			System.out.print("Insdie catch block : " + mae);//display "Inside catch block : " + e on the monitor
		}
	}
	
	static void myTest(String str) throws MyException{//this is static void type method named myTest that has String type as parameter
		 if(str.equals("null")) {//if str is same as null, execute below block
			 throw new MyException("String val is null ");//throw MyException that passes "String val is null" as argument 
		 }
		 else//if str is not null, execute below block
			 System.out.println("String val is " + str);//display "String val is " + str on the monitor
	}

}
