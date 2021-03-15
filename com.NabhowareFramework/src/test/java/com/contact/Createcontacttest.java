package com.contact;

import org.testng.annotations.Test;

public class Createcontacttest
{
	@Test
	public void Newcontact(){
		
		System.out.println("contact created");
	}
	
	@Test
	public void Modifycontact(){
		
		System.out.println("Contact modified");
	}
	@Test
	public void Deletecontact(){
		System.out.println("contact deleted");
	}
}
