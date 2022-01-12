package com.ecom.shop.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.ecom.shop.Cart;
import com.ecom.shop.DriverClass;

public class Healths {
	private int id;
	private String name;
	private String category;
	private String subCategory;
	private float price;
	
	String[] array; 
	int i=1;
	Set<String> cate=new HashSet<>();
	Set<String> subCate=new HashSet<>();
	
	
	
	public Healths() {
		super();
	}
	public Healths(int id, String name, String category, String subCategory, float price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.subCategory = subCategory;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public ArrayList<Healths> inislize() {
		
		ArrayList<Healths> list = new ArrayList<Healths>();
		
				
			
					list.add(new Healths(1,"Puma","t-shirt","mens",900 ));
					list.add(new Healths(2,"U.S.polo","t-shirt","mens",850 ));
					list.add(new Healths(3,"PeterEnglend","t-shirt","mens",840 ));
					list.add(new Healths(4,"Adidas","t-shirt","mens",860 ));
					list.add(new Healths(5,"Lacoste","t-shirt","mens",950 ));
					list.add(new Healths(6,"Gucci","t-shirt","mens",908 ));
					list.add(new Healths(1,"Louis Philippe","shirt","mens",1000));
					list.add(new Healths(2,"John Players","shirt","mens",1500));
					list.add(new Healths(3,"Levi's","shirt","mens",1320));
					list.add(new Healths(4,"Tommy Hilfiger","shirt","mens",1540));
					list.add(new Healths(5,"Versace","shirt","mens",2000));
					list.add(new Healths(6,"Hugo Boss","shirt","mens",2540));
				
//womes             
					list.add(new Healths(1,"Puma","t-shirt","womens",900 ));
					list.add(new Healths(2,"U.S.polo","t-shirt","womens",850 ));
					list.add(new Healths(3,"PeterEnglend","t-shirt","womens",840 ));
					list.add(new Healths(4,"Adidas","t-shirt","womens",860 ));
					list.add(new Healths(5,"Lacoste","t-shirt","womens",950 ));
					list.add(new Healths(6,"Gucci","t-shirt","womens",908 ));
					list.add(new Healths(1,"Louis Philippe","shirt","womens",1000));
					list.add(new Healths(2,"John Players","shirt","womens",1500));
					list.add(new Healths(3,"Levi's","shirt","womens",1320));
					list.add(new Healths(4,"Tommy Hilfiger","shirt","womens",1540));
					list.add(new Healths(5,"Versace","shirt","womens",2000));
					list.add(new Healths(6,"Hugo Boss","shirt","womens",2540));
	                
//kids              
				
					list.add(new Healths(1,"Puma","t-shirt","kids",900 ));
					list.add(new Healths(2,"U.S.polo","t-shirt","kids",850 ));
					list.add(new Healths(3,"PeterEnglend","t-shirt","kids",840 ));
					list.add(new Healths(4,"Adidas","t-shirt","kids",860 ));
					list.add(new Healths(5,"Lacoste","t-shirt","kids",950 ));
					list.add(new Healths(6,"Gucci","t-shirt","kids",908 ));
					list.add(new Healths(1,"Louis Philippe","shirt","kids",1000));
					list.add(new Healths(2,"John Players","shirt","kids",1500));
					list.add(new Healths(3,"Levi's","shirt","kids",1320));
					list.add(new Healths(4,"Tommy Hilfiger","shirt","kids",1540));
					list.add(new Healths(5,"Versace","shirt","kids",2000));
					list.add(new Healths(6,"Hugo Boss","shirt","kids",2540));
	
					
			
			
			
			return	list;	
	}
	public void lists(ArrayList<Healths> healths) {
		healths.forEach(health->{
			cate.add(health.category);
			array= cate.toArray(new String[cate.size()]);
		});
		
		
	}
	
	public int category(ArrayList<Healths> healths,ArrayList<Cart> cartlist) {
						
			for (int i = 0; i < array.length; i++) {
				System.out.println((i+1)+". "+array[i]);
			}
			System.out.println(array.length+1+". Previous Page\n"
								+(array.length+2)+". Home Page\n"
								+"select choice:");
			Scanner scan = new Scanner(System.in);		
				  int ctChoice = scan.nextInt();
				  

			 if(ctChoice<=array.length)
				 this.subCategory(healths,array[ctChoice-1],cartlist);
			 else if(ctChoice==array.length+1||ctChoice==array.length+2) {
					 DriverClass.main(new String[] {"a","b"});
			 }
			 else {
				 System.out.println("wrong entry try again");
				 this.category(healths,cartlist);
			 }
			
			
			
			return 1;
	}
	
	public int subCategory(ArrayList<Healths> healths,String ctChoice,ArrayList<Cart> cartlist) {
			
			healths.forEach(health->{
				if(health.category.equals(ctChoice)) {
				subCate.add(health.subCategory);
				}
			});
			
			String[] array1 = subCate.toArray(new String[subCate.size()]);
			
			for (int i = 0; i < array1.length; i++) {
				System.out.println((i+1)+". "+array1[i]);
			}
			System.out.println(array1.length+1+". Previous Page\n"
								+(array1.length+2)+". Home Page\n"
								+"select choice:");
			
			Scanner scan = new Scanner(System.in);		
			  int sbctChoice = scan.nextInt();
			  
			 if(sbctChoice<=array1.length)
				 this.items(healths, ctChoice, array1[sbctChoice-1],cartlist);
			 else if(sbctChoice==array1.length+1||sbctChoice==array1.length+2) {
				 if(sbctChoice==array1.length+1)
					 this.category(healths,cartlist);
				 else
					 DriverClass.main(new String[] {"a","b"});
			 }
			 else {
				 System.out.println("wrong entry try again");
				 this.subCategory(healths,ctChoice,cartlist);
			 }
			return 1;
	}
	
	public void items(ArrayList<Healths> healths,String ctChoice,String sbctChoice,ArrayList<Cart> cartlist) {
			ArrayList<Healths> list = new ArrayList<Healths>();
			
		healths.forEach(item->{
			if(item.category.equals(ctChoice)&&item.subCategory.equals(sbctChoice)) {
			System.out.println(i +" "+item.name+" "+item.price);
				list.add(item);
				i++;
			}
		});
		System.out.println(list.size()+1+". Previous Page\n"
				+(list.size()+2)+". Home Page\n"
				+"select choice:");
		Scanner scan = new Scanner(System.in);		
			int item=scan.nextInt();
			
//			
			 if(item<=list.size()) {
				 System.out.println("enter the quantity");
				 int qty=scan.nextInt();
				 System.out.println("are you sure want to add 1 items to cartlist\r\n"
				 		+ "Do you want to continue? Y/N\r\n"
				 		+ "");
				 char op=scan.next().charAt(0);
				 if(op=='y') {
				 cartlist.add(new Cart(list.get(item-1).name, sbctChoice , qty , list.get(item-1).price));
				 System.out.println("\n\n1 Item Added to cartlist");
				 DriverClass.main(new String[] {"a","b"});
				 }
				 else {
					 DriverClass.main(new String[] {"a","b"});
				 }
			 }
			 else if(item==list.size()+1||item==list.size()+2) {
				 if(item==list.size()+1)
					 this.subCategory(healths,ctChoice,cartlist);
				 else
					 DriverClass.main(new String[] {"a","b"});
			 }
			 else {
				 System.out.println("wrong entry try again");
				 this.items(healths, ctChoice, sbctChoice, cartlist);
			 }
//			
			
			
			
			
			
	
		
	}
	
}
