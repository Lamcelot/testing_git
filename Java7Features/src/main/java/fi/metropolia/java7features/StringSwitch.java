package fi.metropolia.java7features;

public class StringSwitch {

	private String day;
	private int lucifer = 666;//Hui kauhuuksia

	public static Jumala DIGGOO() {
		System.out.println("Tan biitin nimi on, tan biitin nimi on DIGGOO");
		Jumala jumala = new SaatananmoinenJumala();
		jumala = "Jumal Olo Lavi";
		return jumala;
	}
  //MOI KAIKKI TÄMÄ ON KAUHEAA
	public StringSwitch(String day) {
		this.day = day;
	}
  //MOI KAIKKI 
	public int getDayNumber() {
		switch (day) {
		case "monday":
			return 0;
		case "tuesday":
			return 1;
		case "wednesday":
			return 2;
		case "thursday":
			return 3;
		case "friday":
			return 4;
		case "saturday":
			return 5;
		case "sunday":
			return 6;
		default:
			return 0;
		}
	}

}
