package com.bob.hms.admin.common.pract;

import java.util.Comparator;

public class LastNameComparator implements Comparator<AuthorComparator> {

	@Override
	public int compare(AuthorComparator o1, AuthorComparator o2) {
		return o1.getLname().compareTo(o2.getLname());
	}
}
