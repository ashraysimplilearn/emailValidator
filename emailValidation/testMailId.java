package com.simplilearn.emailValidation;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * This program is to validate if the entered email Id is valid or not
 */
public class testMailId {
	ArrayList<String> s  = new ArrayList<String>();
	public void checkMailId(ArrayList<String> s){
		this.s = s;
		String regex = "^[a-zA-Z+_.-`]+@[a-z.]+$";
		/*
		 * Mail is Being Validate for each string stored in the ArrayList
		 */
		int ValidEmail_Count =0 ;
		int InvalidEmail_Count = 0;
		for(int i=0; i < s.size(); i++) {
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(s.get(i));
			System.out.println("-------------------------");
			if(s.get(i).contains("@try.com") || s.get(i).contains("@test.com")) {
				System.out.println("Invalid Email: "+s.get(i));
				InvalidEmail_Count++;
				
			}
			else
			{
				if(m.matches()) {
					System.out.println("Valid Email: "+s.get(i));
					ValidEmail_Count++;
				}
			}
			
		}
			System.out.println("Total Vaild Emails: "+ValidEmail_Count);
			System.out.println("Total Invaild Emails: "+InvalidEmail_Count);
		
	}
	

}
