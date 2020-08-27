package com.bs.ecom.view;

import java.util.Scanner;

import com.bs.ecom.beans.Product;
import com.bs.ecom.service.ProductService;
import com.bs.ecom.service.ProductServiceImpl;

public class MainClass {

	Scanner sc = new Scanner(System.in);
	ProductService productService;
	
	public MainClass() {
		// TODO Auto-generated constructor stub
	
		productService = new ProductServiceImpl();
	}
	
	public static void main(String[] args) {
		MainClass obj = new MainClass();
		
		// write code to get All products
		
		
		
		
		// to get Product by ID.
		obj.productByID();
		
		// add Product in the database
		
		
		
	}
	
	
	public void productByID()
	{
		System.out.println("Enter the Searched Product ID ");
		int id = sc.nextInt();
		try {
			Product p = productService.getProductsById(id);
			System.out.println(p);
		} catch (Exception e) {
			
			System.out.println(e);
		}
		
	}
}
