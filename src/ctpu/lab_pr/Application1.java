package ctpu.lab_pr;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		/*
		 * Дано два дійсні числа. Знайти їх середнє арифметичне і середнє геометричне
		 * значення.
		 */
//		double x=10.4;
//		double y=34;
//		Scanner in= new Scanner(System.in);
//		System.out.println("Введіть x=");
//		x=in.nextDouble();
//		System.out.println("Введіть y=");
//		y=in.nextDouble();
//		System.out.println((x+y)/2);
//		System.out.println(Math.sqrt(x*y));
//		double sered_arifm=(x+y)/2;
//		double sered_geom=Math.sqrt(x*y);
//		System.out.println("Seredny: "+sered_arifm);
//		System.out.printf("Seredny: %.2f",sered_geom);

		/*
		 * Знайти max та min серед трьох чисел Данні вводяться з клавіатури
		 */
		Scanner in = new Scanner(System.in);
		int a, b, c;
		System.out.println("Введіть ціле число a=");
		a = in.nextInt();
		System.out.println("Введіть ціле число b=");
		b = in.nextInt();
		System.out.println("Введіть ціле число c=");
		c = in.nextInt();
		int max, min;
		max = (a > b) ? a : b; // пошук максимального серед 2-х чисел
		//find max
		if ((a > b) && (a > c)) 
		{
			max = a;
		}
		else 
			if ((b > a) && (b > c)) 
			{
				max = b;
		    } 
			else {
				max = c;
		    }
		System.out.println("max="+max);
		//find min
		if ((a < b) && (a < c)) 
		{
			min = a;
		}
		else 
			if ((b <a) && (b < c)) 
			{
				min = b;
		    } 
			else {
				min = c;
		    }
		
		System.out.println("min="+min);
	}

}
