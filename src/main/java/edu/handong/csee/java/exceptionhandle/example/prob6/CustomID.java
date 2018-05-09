package edu.handong.csee.java.exceptionhandle.example.prob6;//this is a package name

public class CustomID extends Exception {//this is a public class named CustomID that extends Exception
	private String[] races = new String[]{"Vulcans", "Romulan", "Klingons"};//create private String type array that named races (the array have races of characters)
	private String name = "";//this is a private String type named name
	private int age = 0;//this is a private integer type variable named age
	private String race = "";//this is a private String type named race
	private int state = 0;//this is a private integer type variable named state
	
	public void set_name(String name) throws Exception{//this is a public method named set_name that has a String as parameters, and throws Exception
		if(name.length() < 5) {//if length of name is smaller than 5, execute below line
			state = 0;//set state to 0
			throw new Exception("Your name is short! Try again!");//throw Exception passing "Your name is short! Try again!" as argument
		}else {//if length of name is larger than 5, and same as 5 execute below block
			this.name = name;//set name to argument
			System.out.println("Name is valid");//display "Name is valid" on the monitor
			System.out.println("Name : " + this.name);//display name of character on the monitor.
			state++;//add 1 in state
		}
	}
	
	public void set_age(int age) throws Exception{//this is a public method named set_age that has a integer as parameter, and throws Exception
		if(age <18) {//if age is smaller than 18
			state = 1;//set state to 1
			throw new Exception("You are too young! Try again!");//throw Exception passing "You are too young! Try again!"
		}else {//if age is largest than 18 or same as 18
			this.age = age;//set age to argument
			System.out.println("Age is valid!");//display "Age is valid!" on the monitor
			System.out.println("Age : " + this.age);//display age of character on the monitor.
			state++;
		}
	}
	public void set_race(String race) throws Exception{//this is a public method named set_races that has a String as parameter, and throws Exception 
		for(int i =0; i<races.length ; i++) {//for i=0~(races.length-1), execute below block
			if(races[i].equals(race)) {//if argument passed is same as races[i], execute below block
				System.out.println("Race is valid");//display "Race is valid" on the monitor
				System.out.println("Race : " + race);//display race of character on the monitor.
				state = 0;//set state to 0
				return;//return(end of this method)
			}
		}//if the argument is not in the races arrays..
		state = 2;//set state to 2
		throw new Exception("Human! try again!");//throw Exception passing "Human! try again!".
	}
	
	public int getState() {
		return state;
	}

}
