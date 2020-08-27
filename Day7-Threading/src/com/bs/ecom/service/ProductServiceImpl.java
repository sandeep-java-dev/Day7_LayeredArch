package com.bs.ecom.service;

import java.util.List;

import com.bs.ecom.beans.Product;
import com.bs.ecom.dao.ProductDAO;
import com.bs.ecom.dao.ProductDAOImpl;
import com.bs.ecom.execptions.NoSuchProductExcption;

public class ProductServiceImpl implements ProductService {

	ProductDAO productDAO;
	
	
	public ProductServiceImpl() {
		productDAO = new ProductDAOImpl();
		// Animal a = new Dog();
	}

	@Override
	public List<Product> getAllProducts() {
		return productDAO.getAllProducts();
	}

	@Override
	public List<Product> getProductsByCost(int cost) {
		// code of API / WebServices (SOAP , REST)
		return productDAO.getProductsByCost(cost);
	}

	@Override
	public Product getProductsById(int searchId) throws NoSuchProductExcption {
		return productDAO.getProductsById(searchId);
	}

}
