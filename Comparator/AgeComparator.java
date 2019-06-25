package com.bob.hms.admin.common.pract;

import java.util.Comparator;

public class AgeComparator implements Comparator<AuthorComparator>{

	@Override
	public int compare(AuthorComparator o1, AuthorComparator o2) {
		if (o1.getAge() == o2.getAge()) {
			return 0;
		} else if(o1.getAge() > o2.getAge()) {
			return 1;
		} else {
			return -1;
		}
	}
}
