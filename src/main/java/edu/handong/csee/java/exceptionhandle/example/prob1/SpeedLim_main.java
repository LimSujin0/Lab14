package edu.handong.csee.java.exceptionhandle.example.prob1;//this is a package name 
import java.util.Scanner;//import scanner class in java.util
import java.util.Random;//import random class in java.util

public class SpeedLim_main {//this is a public class named SpeedLim_main

	public static void main(String[] args) {//this is a main method in this package
		Scanner keyboard = new Scanner(System.in);//instantiating keyboard of Scanner class
		Random rand = new Random();//instantiating radom of Random class
		int limit = 0, speed = 0;//this is a integer type variable named limit and speed.
		
		System.out.print("Set the speed limit, officer : ");//display "Set the speed limit, officer : " on the monitor.
		limit = keyboard.nextInt();//set limit to integer variable from user.
		speed = rand.nextInt(101);//set speed to integer variable from user.
		
		SpeedLimitter lim = new SpeedLimitter(limit, speed);//Instantiating lim of SpeeLimitter class that passes limit and speed as parameter.
		
		lim.warnSpeedLimit();//execute warnSpeedLimit in lim.
		keyboard.close();//close keyboard.

	}

}
