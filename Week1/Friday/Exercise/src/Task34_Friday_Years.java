import java.util.Calendar;

public class Task34_Friday_Years {
	
	static int friday_years(String start, String end){
		int countFridayYears = 0;
		int startYear = Integer.parseInt(start);
		int endYear = Integer.parseInt(end);
		
		for(int i = startYear ; i <= endYear ; i++){
			String day= getFirstDayOfYear(i);
			boolean leap = isLeap(i);
			
			if((leap == true && (day.equals("FRIDAY") || day.equals("THURSDAY"))) || (leap == false && day.equals("FRIDAY"))){
				countFridayYears++;
			}
		}
		
		return countFridayYears;
	}
	
	static boolean isLeap(int year){
		if((year%400 == 0) || ((year%4 == 0) && (year%100 != 0))){
			return true;
		}
		
		return false;
	}
	
	static String getFirstDayOfYear(int year){
		Calendar cal = Calendar.getInstance();
		cal.set(year, Calendar.JANUARY, 1);
		
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		
		String day = "";
		
		switch (firstDay) {
		case 1:
			day = "SUNDAY";
			break;
		case 2:
			day = "MONDAY";
			break;
		case 3:
			day = "TUESEDAY";
			break;
		case 4:
			day = "WEDNESDAY";
			break;
		case 5:
			day = "THURSDAY";
			break;
		case 6:
			day = "FRIDAY";
			break;
		case 7:
			day = "SATURDAY";
			break;
		}
		
		return day;
	}
}
