package studio1;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		int n1;
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub


		System.out.println("Input first integer");
		n1 = scan.nextInt();

		int n2;


		System.out.println("Input second integer");
		n2 = scan.nextInt();
		
double average = (n1+n2)/2 ;
System.out.println("The average is " + average);

	}

}
