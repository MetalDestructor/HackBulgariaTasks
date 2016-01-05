package time;

public class TimeStartUp {

	public static void main(String[] args) {
		Time tnd = new Time("22:50:42","02.10.15");
		String information = tnd.toString();
		System.out.println(information);
	}

}
