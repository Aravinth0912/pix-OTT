package com.revature.pixott.handler;

import java.util.List;

import com.revature.pixott.dao.Top5Moviedao;
import com.revature.pixott.model.Top5;

public class UserTop5 {
	public static void display() {
		Top5Moviedao user=new Top5Moviedao();
		List<Top5> show=user.Top();
		System.out.println(String.format("%s %-40s", "id","name"));
		show.forEach(System.out::println);
		UserMenu.display();
	}

}
