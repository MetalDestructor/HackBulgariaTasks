package time;

public class Time {
	private String time;
	private String date;

	public Time(String inittime, String initdate) {
		setTime(inittime);
		setDate(initdate);
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		String timeAndDate = getTime() + " " + getDate();
		return timeAndDate;
	}

}
