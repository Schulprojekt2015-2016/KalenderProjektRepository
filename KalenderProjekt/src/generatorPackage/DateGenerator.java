package generatorPackage;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class DateGenerator {
	private static ArrayList<Calendar> daysFut;
	private static ArrayList<Calendar> daysPast;

	public DateGenerator() {
		daysFut = new ArrayList<Calendar>();
		daysPast = new ArrayList<Calendar>();
	}

	public ArrayList<Calendar> genDateTo(int yearsFut, int yearsPast) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MMMMMMMMMM yyyy");
		for (int i = 0; i < (yearsFut * 365); i++) {
			Calendar dateNow = Calendar.getInstance();
			daysFut.add(dateNow);
			dateNow.add(Calendar.DATE, i);
			System.out.println("Date: " + sdf.format(daysFut.get(i).getTime()));
		}
		for (int i = 0; i < (yearsPast * 365); i++) {
			Calendar dateNow = Calendar.getInstance();
			daysPast.add(dateNow);
			dateNow.add(Calendar.DATE, (i * -1));
			System.out.println("Date: " + sdf.format(daysPast.get(i).getTime()));
		}
		return daysFut;
		// this works already
	}

	public static ArrayList<Calendar> getDaysFut() {
		return daysFut;
	}

	public static void setDaysFut(ArrayList<Calendar> daysFut) {
		DateGenerator.daysFut = daysFut;
	}

	public static ArrayList<Calendar> getDaysPast() {
		return daysPast;
	}

	public static void setDaysPast(ArrayList<Calendar> daysPast) {
		DateGenerator.daysPast = daysPast;
	}

	public void print() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MMMMMMMMMM yyyy");
		for (int i = 0; i < daysFut.size(); i++) {
			System.out.println("Date: " + sdf.format(daysFut.get(i).getTime()));
		}
	}

}