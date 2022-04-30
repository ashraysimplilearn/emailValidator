package com.simplilearn.emailValidation;

import java.util.ArrayList;
import java.util.Iterator;

public class emailValidationDemo {

	public static void main(String[] args) {
		
//		emailValidationDemo em = new emailValidationDemo();
		generateMailId gm = new generateMailId();
		testMailId tm = new testMailId();
		/*
		 * Fetch all Emaild generated form the generateEmail Method and read 
		 * if using iterator method
		 */
		ArrayList<String> mailId = new ArrayList<String>();
		mailId = gm.generateMail();
		
		Iterator<String> it =mailId.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----------------------------------------");
		tm.checkMailId(mailId);
		
	}
}
