package com.revature.pixott.handler;

import com.revature.pixott.app.App;

public class AdminMenu {


		public static void display() {
			System.out.println("Admin Menu");
			System.out.println("==========");
			System.out.println("1] Change Top-5 Movies");
			System.out.println("2] Mark movie unavailable");
			System.out.println("3] Modify movie details");
			System.out.println("4] Logout");
			System.out.println("Select an option: ");
			int option = App.scanner.nextInt();
			if(option==1) {
				Changetop5movies.display();
			}else if(option==2) {
				Markmovieunavailable.dissplay();
			}else if(option==3) {
				Modifymoviedetail.display();
			}else if(option==4) {
				//Logout.display();
				System.out.println("Thankyou");
			}
			
		}

	

}
