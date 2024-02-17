package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Random Name is: "+randomName());
		System.out.println("Random number is: "+randomNumber());
		System.out.println("Random alphanumeric is: "+randomAlphaNumeric());

	}
	
	public static String randomName() {
		
		String name = RandomStringUtils.randomAlphabetic(5);
		return name;
	}
	
	public static String randomNumber() {
		
		String name = RandomStringUtils.randomNumeric(2);
		return name;
	}
	
	public static String randomAlphaNumeric() {
		
		String name = RandomStringUtils.randomAlphanumeric(5);
		return name;
	}

}
