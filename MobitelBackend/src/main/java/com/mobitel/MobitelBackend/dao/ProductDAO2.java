package com.mobitel.MobitelBackend.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.*;
import org.hibernate.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobitel.MobitelBackend.model.*;

@Repository("productDAO2")
public class ProductDAO2 
{
	@Autowired
	SessionFactory sessionFactory;
	
	public ProductDAO2(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public void insertUpdateProduct(Product product)
	{
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(product);
		session.flush();
	}
	
	public Product getProduct(int prodid)
	{
		Session session=sessionFactory.openSession();
		Product product=(Product)session.get(Product.class,prodid);
		session.close();
		return product;
	}
	
	@Transactional
	public void deleteProduct(Product product)
	{
		sessionFactory.getCurrentSession().delete(product);
	}
	
	public List<Product> getProductDetails()
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Product");
		List<Product> list=query.list();
		session.close();
		return list;
	}
	
}
