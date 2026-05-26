package utilities;

import java.util.Random;

public class RandomNumber {
	public long randomNumber() {
		Random r = new Random();
		int firstFive = r.nextInt(100000);
		int secondFive = r.nextInt(10000);
		String mobile  = String.format("%05d", firstFive) 
                + String.format("%05d", secondFive); 
		
		
		return Long.parseLong(mobile);
	}
	public int age() {
		Random r = new Random();
		int age = r.nextInt(100);
		return age;
	}
	public int randomservice() {
		Random r = new Random();
		int rr = r.nextInt(1193);
		return rr;
	}
	
	public static void main(String args) {
		RandomNumber rn = new RandomNumber();
		System.out.println(rn.randomNumber());
		System.out.println(rn.age());
	}

}
