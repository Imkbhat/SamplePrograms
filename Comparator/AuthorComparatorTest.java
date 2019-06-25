package com.bob.hms.admin.common.pract;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AuthorComparatorTest {

	public static void main(String[] args) {
		List<AuthorComparator> authorsList = new ArrayList<AuthorComparator>();
		authorsList.add(new AuthorComparator("Kiran", "Bhat", 35));
		authorsList.add(new AuthorComparator("Karthik", "Bhat", 28));
		authorsList.add(new AuthorComparator("Koushik", "Shastri", 30));
		authorsList.add(new AuthorComparator("Ramesh", "Rao", 40));
		authorsList.add(new AuthorComparator("Dinesh", "Murthy", 12));
		
		//Age Comparator
		Collections.sort(authorsList, new AgeComparator());
		System.out.println("After Age Comparator");
		for(AuthorComparator a : authorsList) {
			System.out.println("Fname: "+a.getFname() + " LaName: "+a.getLname() +" Title: "+a.getAge());
		}
		System.out.println("\n");
		//Name Comparator
		Collections.sort(authorsList, new LastNameComparator());
		System.out.println("After Last Name Comparator");
		for(AuthorComparator a : authorsList) {
			System.out.println("Fname: "+a.getFname() + " LaName: "+a.getLname() +" Title: "+a.getAge());
		}
	}
}

/*
 * Output: 
 * After Age Comparator 
 * Fname: Dinesh LaName: Murthy Title: 12 
 * Fname: Karthik LaName: Bhat Title: 28 
 * Fname: Koushik LaName: Shastri Title: 30
 * Fname: Kiran LaName: Bhat Title: 35 
 * Fname: Ramesh LaName: Rao Title: 40
 * 
 * 
 * After Last Name Comparator 
 * Fname: Karthik LaName: Bhat Title: 28 
 * Fname: Kiran LaName: Bhat Title: 35 
 * Fname: Dinesh LaName: Murthy Title: 12 
 * Fname: Ramesh LaName: Rao Title: 40 
 * Fname: Koushik LaName: Shastri Title: 30
 */
