package edu.handong.csee.java.exceptionhandle.example.prob4;

public class Boundary {
	public static int []arr = new int[5];
	public static int cnt = 0;
	public void receive(int num) throws ArrayIndexOutOfBoundsException{
		int i = cnt;
		arr[i] = num;
		cnt++;
		System.out.println("arr["+cnt+"]"+ " <- num");
	}
}
