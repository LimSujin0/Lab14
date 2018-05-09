package edu.handong.csee.java.exceptionhandle.example.prob3;//this is a package name

public class Powercalc {//this is a public class named Powerclac
	public long power(int n, int p) throws Exception{//this is a public method named power that has two integer type variables, and throws exception
		long result = 0;//this is a long type variable named result
		result = (long)Math.pow(n, p);//set result to pow(n,p)
		if(n<0 || p<0) {//if n is smaller than 0 or p is smaller than 0 
			throw new Exception("n or p should not be negative.");//throw Exception passing "n or p should not be negative." as argument
		}
		if(n==0 || p==0) {//if n is same as 0 or p is same as 0
			throw new Exception("n or p should not be zero.");//throw Exception passing "n or p should not be zero." as argument
		}
		return result;//return the result
	}
	
}
