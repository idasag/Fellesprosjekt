package Classes;

import java.util.ArrayList;
import java.util.Calendar;

public class TestTony {

//	private static ArrayList<ArrayList<String>> myCalendar = new ArrayList<ArrayList<String>>();
//	public static ArrayList<ArrayList<String>> calendar;
	
	
//	public static ArrayList<ArrayList<String>> setCalendar(){
//		
//		myCalendar.get(0).add(0, "Dag/tid");
//		myCalendar.get(1).add(0, "Man");
//		myCalendar.get(2).add(0, "Tirs");
//		myCalendar.get(3).add(0, "Ons");
//		myCalendar.get(4).add(0, "Tors");
//		myCalendar.get(5).add(0, "Fre");
//		myCalendar.get(6).add(0, "L�r");
//		myCalendar.get(7).add(0, "S�n");
//		
//		return myCalendar;
//	}
	
	public static void main(String[] args) {
		Calendar calendar2 = Calendar.getInstance();
		int i = 1;
//		calendar = setCalendar();
//		System.out.println(calendar);
//		System.out.println(i);
//		System.out.println(i + "      " + (calendar2.getFirstDayOfWeek()));
		System.out.println(calendar2.getFirstDayOfWeek() + 1);
		System.out.println(calendar2.DATE);
		System.out.println(calendar2.DAY_OF_MONTH);
	}

}
