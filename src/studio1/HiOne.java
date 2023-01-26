package studio1;

import java.util.Scanner;

public class HiOne {

	/**
	 * Says hello to the supplied argument
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter names here: ");
		String names = in.nextLine();
		//
		// Below this line, enter code so that this program's output says
		//      Hi, Pat.  How are you?
		// if the value of name is "Pat"
		//
		System.out.print("Hi, " + names );
		System.out.print(". How are you?");
		
		

	}

}
