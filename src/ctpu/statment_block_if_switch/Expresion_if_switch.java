package ctpu.statment_block_if_switch;

public class Expresion_if_switch {

	int k = 8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int t = 7;
//		double d = 56.986;
//		System.out.println(round(d));
//		{
//			int h = 7;
//			System.out.println(t + " " + h);
//		}
//		System.out.println(h);
//		int age = 24;
//		if (age < 21) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}
//
//		int l = 8;
//		int k = 8;
//		if (l>k) {
//			System.out.println("l>k");
//		}else if (l<k) {
//			System.out.println("l<k");
//		}else {
//			System.out.println("l=k");
////		}
//		if (l > k) {
//			System.out.println("l>k");
//		}
//		if (l < k) {
//			System.out.println("l<k");
//		}
//		if (l == k) {
//			System.out.println("l=k");
//		}
//Задача: Чи входить  змінна х в проміжок -1<=x<=3 [-1;3] або (5;infinity)		
//		double x = 2.8575;
//		if ((x >= -1) && (x <= 3)) { // ||
//			System.out.println("Yes!");
//		} else if (x > 5) {
//			System.out.println("Yes!");
//		} else {
//			System.out.println("No");
//		}
//		System.out.printf("Rezult x=%.2f", x);

//		int k1=2;
//		int k2=5;
//		int rez1=2&5;//10*101
//		boolean rez2=((2>4)&&(k1<k2));
//		System.out.println("k1="+k1+" k2="+k2+" rez1="+rez1+" rez2"+rez2);
//		d=(t+t)*t;
//		System.out.println(d);
//		int t1 = 8;
//		String t2 = "Java";
//		System.out.printf("\nEducation %s '\t' version %d\n", t2, t1);
		
		// Statment switch
//		String day = "Monday";
//		switch (day) {
//		case "Monday":
//		case "Tuesday": { // t4==2
//			System.out.println("C++");
//			System.out.println("Java");
//			break;
//		}
//		case "Wednsday": {
//			System.out.println("C");
//			System.out.println("Java");
//			break;
//		}
//		default:
//			System.out.println("Holliday!");
//		}

		Days day1 = Days.WEDNESDAY;
		switch (day1) {
		case MONDAY:
		case TUESDAY: { // t4==2
			System.out.println("C++");
			System.out.println("Java");
			break;
		}
		case WEDNESDAY: {
			System.out.println("C");
			System.out.println("Java");
			break;
		}
		default:
			System.out.println("Holliday!");
		}
		//System.out.println(day1);
	}

}

enum Days {
	MONDAY, TUESDAY, WEDNESDAY, THUESDAY, FRIDAY, SATURDAY, SUNDAY
}
