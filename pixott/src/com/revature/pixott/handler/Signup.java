package com.revature.pixott.handler;

import com.revature.pixott.app.App;
import com.revature.pixott.dao.Customerdao;
import com.revature.pixott.model.Customer;

public class Signup {
	public static void display() {
		System.out.println("signup");
		System.out.println("******");
		System.out.println("name;");
		String name=App.scanner.next();
	    System.out.println("mobilenumber;");
		String Mobilenumber=App.scanner.next();
		System.out.println("password;");
		String password=App.scanner.next();
		System.out.println("signup successful,please login");
		
		//Signup signup = new Signup();
		Customer customer = new Customer();
		customer.setName(name);
		customer.setMobilenumber(Mobilenumber);
		customer.setPassword(password);
		Customerdao customerdao = new Customerdao();
		customerdao.signup(customer);

		
		MainMenuHandler.display();
		
	}

}
