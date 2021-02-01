package com.psl.assignments.collection.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.psl.assignments.collection.Movies;
import com.psl.assignments.service.MovieService;

public class Tester {
	public static void main(String args[]) {
		MovieService service = new MovieService();
		
		List<Movies> mvlist = service.getMoviesList();
		Collections.sort(mvlist);
		for(Movies m : mvlist) {
			System.out.println(m);
		}
		
		Comparator<Movies> compareByDirector = new Comparator<Movies>() {
			public int compare(Movies o1, Movies o2) {
				return o1.getDirector().compareTo(o2.getDirector());
			}
			
		};
		mvlist.sort(compareByDirector);
		for(Movies m : mvlist) {
			System.out.println(m);
		}
		Comparator<Movies> compareByDuration = new Comparator<Movies>() {

			@Override
			public int compare(Movies o1, Movies o2) {
				if(o1.getDuration() < o2.getDuration())
					return -1;
				else if(o1.getDuration() > o2.getDuration())
					return 1;
				else 
					return 0;
				
			}
			
		};
		mvlist.sort(compareByDuration);
		for(Movies m : mvlist) {
			System.out.println(m);
		}
		
		Comparator<Movies> compareByDurationAndlanguage = new Comparator<Movies>(){
			@Override
			public int compare(Movies o1, Movies o2) {
				// TODO Auto-generated method stub
				int i = o1.getLanguage().compareTo(o2.getLanguage());
				if(i==0) {
					i = (o1.getDuration()<o2.getDuration())?-1:((o1.getDuration()>o2.getDuration()?1:0));
				}
				return i;
			}
			
		};
		mvlist.sort(compareByDurationAndlanguage);
		for (Movies m : mvlist) {
			System.out.println(m);
			
		}
	}
	
	
}
