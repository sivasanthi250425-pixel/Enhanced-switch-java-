

public class Main {
	public static void main(String[] args) {
		String day="Saturday";
		switch(day) {
		case "Monday","tuesday","wednesday","thursday","friday"->System.out.println("week day 😣");
			
		case "Sunday","Saturday" ->System.out.println("week end 😇");
		
		default ->System.out.println("Not a day");
		}
	}
}
