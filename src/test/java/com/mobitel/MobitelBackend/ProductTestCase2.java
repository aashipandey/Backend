package com.mobitel.MobitelBackend;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;

import com.mobitel.MobitelBackend.dao.ProductDAO2;
import com.mobitel.MobitelBackend.dao.SupplierDAO;
import com.mobitel.MobitelBackend.model.Product;
import com.mobitel.MobitelBackend.model.Supplier;


public class ProductTestCase2 
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.mobitel");
		
		context.refresh();
		
		// Inserting a Product Object.
		ProductDAO2 productDAO2=(ProductDAO2)context.getBean("productDAO2");
		
		//Insertion TestCase
		
		Product product=new Product();
		product.setProdid(1);
		product.setProdname("Mobile");
		

		productDAO2.insertUpdateProduct(product);		
		System.out.println("Product Inserted");
		
		//Retrieval TestCase
		
		/*Product product=productDAO.getProduct(2);
		System.out.println("Product Name:"+product.getProdname());
		*/
		
		//Deletion TestCase
		/*Product product=productDAO.getProduct(2);
		productDAO.deleteProduct(product);
		System.out.println("The Product Deleted");*/
		
		//Retrieving the Data
		
		/*List<Product> list=productDAO.getProductDetails();
		
		for(Product product:list)
		{
			System.out.println(product.getProdid()+":"+product.getProdname()+":");
		}*/
		
		//Update the Product
		//Product product=productDAO.getProduct(3);
		product.setProdname("WifiEnMobile");
		productDAO2.insertUpdateProduct(product);
		System.out.println("The Product Updated");
		
	}
}