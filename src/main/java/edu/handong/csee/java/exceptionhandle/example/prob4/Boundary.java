package edu.handong.csee.java.exceptionhandle.example.prob4;//this is a package name

public class Boundary {//this is a public class name Boundary.
	public static int []arr = new int[5];//this is a public static integer type array that has length 5
	public static int cnt = 0;//this is a public static integer type variable named cnt
	public void receive(int num) throws ArrayIndexOutOfBoundsException{//this is public void type method named receive, that throws IndexOutOfBoundaryException
		int i = cnt;//set i to cnt
		arr[i] = num;//set i-th variable of arr to num
		cnt++;//add 1 in cnt
		System.out.println("arr["+cnt+"]"+ " <- num " + num);//display arr[i] and value of this array[i] on the monitor.
	}
}
