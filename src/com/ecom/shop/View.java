package com.ecom.shop;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.ecom.shop.model.Clothes;

public class View {

	Scanner scan = new Scanner(System.in);
	Scanner scan1 = new Scanner(System.in);
	
	Date date = new Date();
	String s;
	long n;
	public int Firstdisplay() {
		
		System.out.println("shoppingadda.com\r\n"
			+ "\r\n"
			+ "\r\n"
			+ "                     ****|SHOPPINGADDA|****\r\n"
			+ "\r\n"
			+ " \r\n"
			+ "               ****WELCOME TO SHOPPINGADDA***\r\n"
			+ "\r\n"
			+ "\r\n"
			+ " Date: Mon 13.01.2020          Time: 08:32:01 PM PST\r\n"
			+ "*****************************************************\r\n"
			+ "     HAPPY NEW YEAR dont expect any discount...!!\r\n"
			+ "\r\n"
			+ "\r\n"
			+ "Enter your name:\r\n"
			+ "");
	
		s=scan.nextLine();
		System.out.println("Enter your Phone number(10digit):");
		n=scan1.nextLong();
		
		return this.welcomeDisplay();
		
		}
	
		public int welcomeDisplay() {
			
			System.out.println("	   ***Welcome "+s+" To ShoppingADDA***\r\n"
					+ "*****************************************************\r\n"
					+ "           	 *****WELCOME TO HOME PAGE****\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "CATEGORIES\r\n"
					+ "1. Cloths\r\n"
					+ "2. Electronics\r\n"
					+ "3. HomeApplication\r\n"
					+ "4. Books\r\n"
					+ "5. Healths\r\n"
					+ "6. FootWears\r\n"
					+ "7. View Cart\r\n"
					+ "8. Exit\r\n"
					+ "select choice:\r\n"
					+ "");
				int choice=scan.nextInt();	
			
				return choice;
		}

		
	
}
