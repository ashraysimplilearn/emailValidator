package com.simplilearn.emailValidation;

import java.util.ArrayList;
import java.util.Random;

public class generateMailId implements emailValidator{
	
	public String genarateRandomString() {
		Random random = new Random();
		int leftLimit = 65;
		int rightLimit = 122;
		int targetStringLimit = random.nextInt(15);
		
		while (targetStringLimit == 0) {
			targetStringLimit = random.nextInt(15);
		}
		
		
		 String generatedString = random.ints(leftLimit, rightLimit + 1)
				      .limit(targetStringLimit)
				      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				      .toString();

		   return generatedString;
	}
	
	/*
	 * Declaring an ArrayList to store all the Email Id's generated randomly
	 */
	
	public ArrayList<String> generateMail(){
		ArrayList<String> id = new ArrayList<String>();
		String mailExtension[] = {"@gmail.com","@yahoo.com","@test.com","@rediff.com","@try.com"};
		for (int i =0; i < 20; i ++) {
			/*
			 * Randomly generating the at mail extension from the declared array
			 */
			String at = mailExtension[(int) Math.floor(Math.random()*mailExtension.length)];
			String email = genarateRandomString().concat(at);
			id.add(email);
		}	
		return id;
				
	}
}
