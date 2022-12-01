
public enum Weekday {
	
	SUN(1), MON(2), TUE(3), WED(4),THU(5), FRI(6), SAT(7);
	
	private int day;
	
	private Weekday(int day){
		this.day = day;
	}
	
	public int getDay() {
		return day;
	}
	
	public static Weekday getWeekday(int day) {
		for(Weekday weekday: Weekday.values()) {
			if(weekday.getDay() == day) {
				return weekday;
			}
		}
		return null;
	}
}
