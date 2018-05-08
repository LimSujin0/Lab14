package edu.handong.csee.java.exceptionhandle.example.prob1;
import java.util.Scanner;
import java.util.Random;

public class SpeedLim_main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int limit = 0, speed = 0;
		
		System.out.println("Set the speed limit, officer : ");
		limit = keyboard.nextInt();
		speed = rand.nextInt(101);
		
		SpeedLimitter lim = new SpeedLimitter(limit, speed);
		
		lim.warnSpeedLimit();
		keyboard.close();

	}

}
