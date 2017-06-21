package com.mobitel.MobitelBackend;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;
import com.mobitel.MobitelBackend.dao.UserDetailsDAO;
import com.mobitel.MobitelBackend.model.UserDetails;


public class UserDetailsTestCase 
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.mobitel");
		
		context.refresh();
		
		// Inserting a UserDetails Object.
		UserDetailsDAO userdetailsDAO=(UserDetailsDAO)context.getBean("userdetailsDAO");
		
		//Insertion TestCase
		
		UserDetails userdetails=new UserDetails();
		userdetails.setUsername("Aashi");
		userdetails.setPassword("aashi");
		userdetails.setAddress("Bittan Market");

		userdetailsDAO.insertUpdateUserDetails(userdetails);		
		System.out.println("UserDetails Inserted");
		
		//Retrieval TestCase
		
		/*UserDetails userdetails=userdetailsDAO.getUserDetails(2);
		System.out.println("UserDetails Name:"+userdetails.getUsername());
		System.out.println("UserDetails Description:"+userdetails.getAddress());*/
		
		//Deletion TestCase
		/*UserDetails userdetails=userdetailsDAO.getUserDetails(2);
		userdetailsDAO.deleteUserDetails(userdetails);
		System.out.println("The UserDetails Deleted");*/
		
		//Retrieving the Data
		
		/*List<UserDetails> list=userdetailsDAO.getUserDetailsDetails();
		
		for(UserDetails userdetails:list)
		{
			System.out.println(userdetails.getUsername()+":"+userdetails.getPassword()+":"+userdetails.getAddress());
		}*/
		
		//Update the UserDetails
		//UserDetails userdetails=userdetailsDAO.getUserDetails(3);
		userdetails.setUsername("Aashi");
		userdetailsDAO.insertUpdateUserDetails(userdetails);
		System.out.println("The UserDetails Updated");
		
	}
}