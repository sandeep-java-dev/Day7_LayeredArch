package com.bs.ecom.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bs.ecom.beans.Product;
import com.bs.ecom.execptions.NoSuchProductExcption;

public class ProductDAOImpl implements ProductDAO {

	ArrayList<Product> products;
	
	public ProductDAOImpl() {
		products = DAOUtil.getProductDatabase(); // table 
	}
	
	@Override
	public List<Product> getAllProducts() {
		// SQL code
		// 100 code 
		return products;
	}

	@Override
	public List<Product> getProductsByCost(int cost) {
		// sql to get product by cost
		List<Product> tempList = new ArrayList<>();
		
		Iterator<Product> itr = products.iterator();
		while(itr.hasNext())
		{
			Product p = itr.next();
			if(p.getCost() == cost)
			{
				tempList.add(p);
			}
		}
		
		return tempList;
	}

	@Override
	public Product getProductsById(int searchedId) throws NoSuchProductExcption {
		Iterator<Product> itr = products.iterator();
		boolean found = false;
		Product p = null;
		while(itr.hasNext())
		{
			p = itr.next();
			if(p.getPid() == searchedId)
			{
				found = true;
				break;
			}
		}
		
		if(found == false) throw new NoSuchProductExcption("Wrong Product Id "+searchedId);
		else return p;
	}

}
