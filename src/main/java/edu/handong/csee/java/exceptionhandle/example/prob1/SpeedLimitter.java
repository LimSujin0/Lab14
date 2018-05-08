package edu.handong.csee.java.exceptionhandle.example.prob1;

public class SpeedLimitter {
	private int speed = 0;
	private int limit = 0;
	public SpeedLimitter(int limit, int speed) {
		// TODO Auto-generated constructor stub
		this.speed = speed;
		this.limit = limit;
	}

	public void warnSpeedLimit(){
		try{
			if(this.speed>this.limit) {
				throw new Exception("Speed Limit " + this.limit+ "km exceeded!" );
			}
			System.out.println("You are a law abiding citizen!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("You are being fined.");
		}
	}
	
}
