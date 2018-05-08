package edu.handong.csee.java.exceptionhandle.example.prob5;
import java.util.Scanner;

public class My_main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Scanner keyboard = new Scanner(System.in);
			String str = keyboard.nextLine();
			My_main.myTest(str);
		}catch(MyException e) {
			System.out.println("Insdie catch block : " + e);//toString은 어따쓰려고?
		}
	}
	
	static void myTest(String str) throws MyException{
		 if(str==null) {
			 throw new MyException("String val is null");
		 }
		 else
			 System.out.println("String val is " + str);
	}

}
