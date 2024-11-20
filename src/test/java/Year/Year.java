package Year;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = -1;
		do {
			System.out.println("\n Please Enter Your Year for exit enter 0\n");
			n = sc.nextInt();
			if(checkLipyear(n)==true) {
				System.out.println("expected Year is leap year");
			}
			else {
				System.out.println("Expected year not a lipyear");
			}
		} while (n != 0);

	}

	public static boolean checkLipyear(int expYear) {
		boolean res = true;
		if (expYear % 4 == 0) {
			if (expYear % 100 == 0) {
				if (expYear % 400 == 0) {
					res = true;
				} else {
					res = false;
				}

			} else {
				return res;
			}

		}
		return res;
	}

}
