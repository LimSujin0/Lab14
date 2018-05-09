package edu.handong.csee.java.exceptionhandle.example.prob1;//this is a pakcage name

public class SpeedLimitter {//this is a public class named SpeedLimitter
	private int speed = 0;//this is a private integer type variable named speed.
	private int limit = 0;//this is a private integer type variable named limit.
	public SpeedLimitter(int limit, int speed) {//this is a constructor of SpeedLimitter class that have two integer types as parameters.
		// TODO Auto-generated constructor stub
		this.speed = speed;//set speed to argument
		this.limit = limit;//set limit to argument
	}

	public void warnSpeedLimit(){//this is a public void type method named warnSpeedLimit 
		try{//try
			if(this.speed>this.limit) {//if speed(private) is larger than limit(private)
				throw new Exception("Speed Limit " + this.limit+ "km exceeded!" );//throw an exception passing "Speed Limit " + this.limit+ "km exceeded!" as argument.
			}//if speed is smaller than limit or same as limit 
			System.out.println("You are a law abiding citizen!");//display "You are a law abiding citizen!" on the monitor
		}catch(Exception e) {//if Exception is throw execute this block
			System.out.println(e.getMessage());//display an message that is received as argument.
			System.out.println("You are being fined.");//display "You are being fined." on the monitor.
		}
		System.out.println("Your current speed : " + this.speed);//display current speed on the monitor.
	}
	
}
