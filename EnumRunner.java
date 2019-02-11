package com.bob.hms.common;

public class EnumRunner {
	
	enum WeekDays {
		
		SUNDAY("FUNDAY"),MONDAY("TORTURE"), TUESDAY("WORK PRESSURE"),
		WEDNESDAY("MID WEEK"), THURSDAY("SOME WHAT OKAY"), FRIDAY("RELAXED"),
		SATURDAY("FUN BEGINS");
		
		private String day;
		private WeekDays(String day) {
			this.day = day;
		}
		
		private String getDay() {
			return this.day;
		}
	}
	
	public static void main(String[] args) {
		WeekDays[] weekdays = WeekDays.values();
		for(WeekDays weekday : weekdays)
			System.out.println("Day "+weekday+" Means"+weekday.getDay());
	}

}
