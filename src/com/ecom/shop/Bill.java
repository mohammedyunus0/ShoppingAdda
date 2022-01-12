package com.ecom.shop;

import java.util.ArrayList;

public class Bill {
	private int totalItems;
	private long total;
	private long gst;
	private long gstTotal;
	private long grandTotal;
	public void bill(ArrayList<Cart> items) {
		totalItems=items.size();
		System.out.println("\r\n"
				+ "	***********    ShoppingAdda Bill   ************\r\n"
				+ "- - - - - - - - - - - - - - - - - - - - - - - - - - - \r\n"
				+ "\r\n"
				+ "Mon 13.01.2020                       09:03:14 PM PST\r\n"
				+ "- - - - - - - - - - - - - - - - - - - - - - - - - - - \r\n"
				+ ""+"SI.No    Item              Cost     Qty      	Total   ");
		items.forEach(item->{
			System.out.println((items.indexOf(item)+1)+"       |"+ item.name +" |"+item.price+"     |"+item.qty+"         |"+(item.price*item.qty));
			total+=(item.price*item.qty);
		});
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - \r\n"
				+ "Total Qty:                                          "+totalItems+"\r\n"
				+ "Sub Total:                                     "+total+"\r\n"
				+ "- - - - - - - - - - - - - - - - - - - - - - - - - - - \r\n"
				+ "");
		gst=total*9/100;
		gstTotal=total*18/100;
		grandTotal=total+gst*2+gstTotal;
		System.out.println("\r\n"
				+ "CGST 	  @9%:                               "+gst+"\r\n"
				+ "SGST 	  @9%:                               "+gst+"\r\n"
				+ "Total GST@18%:                                "+gstTotal+"\r\n"
				+ "- - - - - - - - - - - - - - - - - - - - - - - - - - - \r\n"
				+ "\r\n"
				+ " Grand Total:                               	"+grandTotal+" Rs\r\n"
				+ "- - - - - - - - - - - - - - - - - - - - - - - - - - - \r\n"
				+ "       Thank you for visiting *SHOPPINGADDA*\r\n"
				+ "         	 Have a Nice Day !\r\n"
				+ "                Visit again....\r\n"
				+ "- - - - - - - - - - - - - - - - - - - - - - - - - - - \r\n"
				+ "");
		
		
		
	}
	
}
