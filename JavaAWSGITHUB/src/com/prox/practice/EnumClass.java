package com.prox.practice;

public class EnumClass {

	EnumTest day;

	public EnumClass(EnumTest day) {
		this.day = day;
	}

	public void whichDay() {

		switch (day) {

		case MONDAY:
			System.out.println("Mondays are bad");
			break;

		case TUESDAY:
			System.out.println("Tuesdays are bad too");
			break;

		case WEDNESDAY:
		case THURSDAY:
			System.out.println("Wed,Thur are okay");
			break;

		case FRIDAY:
			System.out.println("Friday is little exciting");
			break;

		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are fun");
			break;

		default:
			System.out.println("Mid-days are boring");
			break;
		}
	}

	public static void main(String[] args) {

		EnumClass a = new EnumClass(EnumTest.MONDAY);
		a.whichDay();
		EnumClass b = new EnumClass(EnumTest.TUESDAY);
		b.whichDay();
		EnumClass c = new EnumClass(EnumTest.WEDNESDAY.THURSDAY);
		c.whichDay();
		EnumClass e = new EnumClass(EnumTest.FRIDAY);
		e.whichDay();
		EnumClass f = new EnumClass(EnumTest.SATURDAY.SUNDAY);
		f.whichDay();

	}
}
