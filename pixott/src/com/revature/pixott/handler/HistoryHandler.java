package com.revature.pixott.handler;

import java.util.List;

import com.revature.pixott.dao.Customerdao;
import com.revature.pixott.dao.ViewHistorydao;
import com.revature.pixott.model.Movie;

public class HistoryHandler {
	public static void display() {
		int id=Customerdao.id;
		System.out.println("Your history");
		System.out.println("**************");
		ViewHistorydao history=new ViewHistorydao();
		List<Movie> list=history.show(id);
		list.forEach(System.out::println);
		UserMenu.display();
		

	}

}
