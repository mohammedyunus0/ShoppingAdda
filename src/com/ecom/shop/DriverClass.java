package com.ecom.shop;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.ecom.shop.model.Books;
import com.ecom.shop.model.Clothes;
import com.ecom.shop.model.Electronics;
import com.ecom.shop.model.FootWears;
import com.ecom.shop.model.Healths;
import com.ecom.shop.model.HomeApplication;

public class DriverClass {
	static ArrayList<Cart> cartlist= new ArrayList<Cart>();
	
public static void main(String[] args) {
	
	
	Clothes clothes = new Clothes();
	ArrayList<Clothes> clotheslist = clothes.inislize();
	Books book = new Books();
	ArrayList<Books> booklist = book.inislize();
	Electronics electronic = new Electronics();
	ArrayList<Electronics> electolist = electronic.inislize();
	FootWears footWear = new FootWears();
	ArrayList<FootWears> footlist = footWear.inislize();
	Healths health = new Healths();
	ArrayList<Healths> healthlist = health.inislize();
	HomeApplication happliance = new HomeApplication();
	ArrayList<HomeApplication> happlist = happliance.inislize();
	View view = new View();
	Cart cart = new Cart();
	Bill bill = new Bill();
	int choice=0;	
	Scanner scan = new Scanner(System.in);
	
	System.out.println(args.length);
		if(args.length==0) 
			choice = view.Firstdisplay();
		else
			choice = view.welcomeDisplay();
			
	switch (choice) {
	case 1:
		clothes.lists(clotheslist);
		clothes.category(clotheslist,cartlist);
		break;
	case 2:
		electronic.lists(electolist);
		electronic.category(electolist,cartlist);
		break;
	case 3:
		happliance.lists(happlist);
		happliance.category(happlist,cartlist);
		break;
	case 4:
		 book.lists(booklist);
		 book.category(booklist,cartlist);
		 
		break;
	case 5:
		health.lists(healthlist);
		health.category(healthlist,cartlist);
		break;
	case 6:
		footWear.lists(footlist);
		footWear.category(footlist,cartlist);
		break;
	case 7:
		cart.display(cartlist);
		break;
	
	case 8:
		System.out.println("Do you want to exit?\r\n"
				+ "1. Bill\r\n"
				+ "2. Home page\r\n"
				+ "3. Exit\r\n"
				+ "");
			int c=scan.nextInt();
			switch (c) {
			case 1:
			bill.bill(cartlist);	
				break;
			case 2:
				DriverClass.main(new String[]{"a"});
				break;
				
			default:
				System.exit(0);
				break;
			}
		break;
		
	default:
		System.out.println("wrong entry");
		break;
	}

}
}
