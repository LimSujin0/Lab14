package edu.handong.csee.java.exceptionhandle.example.prob5;//this is a package name

public class MyException extends Exception{//this is a public class named MyException that extends Exception
	private String message = null;//this is a private String type message
	public MyException() {//this is a constructor that has no parameter.
		super();//invoke constructor from base class.
	}
	public MyException(String message) {//this is a constructor that has String as parameter
		super(message);//invoke constructor from base class that passes message as argument.
		this.message = message;//set message to argument
	}
	public MyException(Throwable cause) {//this is a constructor that has Throwable as parameter
		super(cause);//invoke constructor from base class that passe cause as argumnet.
	}
	public String toString() {//this is a public type method named toString
		return message;//return the message
	}

}
