package com.psl.assignments.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.psl.assignments.collection.Movies;

public class MovieService {
	List<Movies> movlist = new ArrayList<>();
	Scanner sc  = new Scanner(System.in);
	Movies [] mv =new Movies[6];
	public MovieService() {
		for(int i=0; i<3; i++) {
			mv[i] = new Movies();
			System.out.println("Enter Movie Name");
			String name  = sc.nextLine();
			mv[i].setName(name);
			System.out.println("Enter Movie Language");
			String lang  = sc.nextLine();
			mv[i].setLanguage(lang);
			System.out.println("Enter Movie Release Date");
			String dateFormat = "dd/MM/yyyy";
			try {
				mv[i].setReleaseDate(new SimpleDateFormat(dateFormat).parse(sc.nextLine()));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Enter Movie director");
			String direct  = sc.nextLine();
			mv[i].setDirector(direct);;
			System.out.println("Enter Movie duration");
			int tim  = sc.nextInt();
			mv[i].setDuration(tim);
			sc.nextLine();
			
			movlist.add(mv[i]);
		}
	}
	public List<Movies> getMoviesList(){
		return movlist;
	}
}
