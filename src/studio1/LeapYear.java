package studio1;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {

	int year;
	Scanner scan = new Scanner(System.in);
	System.out.println("Input first integer");

	year = scan.nextInt();


	boolean ly = (year % 4 == 0) && (year % 100 != 0) || (year%400 == 0);

	}
}