package com.revature.pixott.handler;

import java.util.List;

import com.revature.pixott.app.App;
import com.revature.pixott.dao.Customerdao;
import com.revature.pixott.dao.Historydao;
import com.revature.pixott.dao.SearchMoviedao;
import com.revature.pixott.dao.WishListdao;
import com.revature.pixott.model.Movie;
import com.revature.pixott.model.MovieSearch;

public class SearchMovieHandler {
	public static void display() {
		System.out.println("enter the movie name to search ");
		String keyword=App.scanner.nextLine();
		keyword+=App.scanner.nextLine();
		SearchMoviedao search=new  SearchMoviedao();
		List<MovieSearch> movie=search.Search(keyword);
		movie.forEach(System.out::println);
		System.out.println("select a movie to watch (enter the id)");
		int id = App.scanner.nextInt();
		int user=Customerdao.id;
		System.out.println("1] Add movie to Wish List");
		System.out.println("2] Play movie");
		System.out.println("3] Go Back to Main Menu");
		System.out.println("Select an option:");
		int option=App.scanner.nextInt();
		if(option==1) {
			WishListdao add=new WishListdao();
			add.addwishllist(id, user);
			
			System.out.println("movie added successfully");
			UserMenu.display();
		}else if(option==2) {
			Historydao history=new Historydao();
			List<Movie> add=history.history(id, user);
			System.out.println("movie palyed.....");
			System.out.println("Thankyou for watching");
			UserMenu.display();
			
		}else if(option==3) {
			MainMenuHandler.display();
		}
		
	
		
		}

}
