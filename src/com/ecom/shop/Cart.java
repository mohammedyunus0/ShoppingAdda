package com.ecom.shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
		String name;
		String item;
		int qty;
		double price;
		
		
		public Cart() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Cart(String name, String item, int qty, double price) {
			super();
			this.name = name;
			this.item = item;
			this.qty = qty;
			this.price = price;
		}
		
		
		
		public void display(ArrayList<Cart> items) {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("-----------------------------------------------------\r\n"
					+ "SI.No   | Item   |Cost Rs  |Qty       |Total   \r\n"
					+ "-----------------------------------------------------\r\n"
					+ "");
			items.forEach(item->{
				System.out.println((items.indexOf(item)+1)+"       |"+ item.name +" |"+item.price+"     |"+item.qty+"         |"+(item.price*item.qty));
			});
			
			System.out.println("Do you want to remove from Cart? Y/N");
			char c=scan.next().charAt(0);
			switch (c) {
			case 'y':
				System.out.println("Enter the SI.No of item to be removed");
				int a=scan.nextInt();
				items.remove(a-1);
				System.out.println("Successfully removed");
				DriverClass.main(new String[] {"a"});
				break;
				

			default:
				
				DriverClass.main(new String[] {"a"});
				break;
			}
		}
		
		
		
		
		
}
