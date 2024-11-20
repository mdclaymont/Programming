package Number;

import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
		int n = -1;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n Please Enter Your Number \n");
			n = sc.nextInt();
			countNumber(n);
		} while (n != 0);

	}

	public static void printSquearNumber(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(i * i + " ");
		}
	}

	public static void printtripleNumber(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(i * i * i + " ");
		}
	}

	public static void printoddNumber(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void printEvenNumber(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void printPrimeNumber(int n) {
		for (int i = 2; i <= n; i++) {
			int tag = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					tag = 1;
					break;
				}
			}
			if (tag < 1) {
				System.out.print(i + " ");
			}
		}

	}

	public static int sumNumber(int n) {
		int res = 0;
		for (int i = 1; i <= n; i++) {
			res = res + i;
		}
		System.out.println(res);
		return res;
	}

	public static void reverseNumber(int n) {
		int temp = n;
		String cur = Integer.toString(n);
		StringBuilder sb = new StringBuilder();
		sb.append(cur);
		String res = sb.reverse().toString();
		System.out.println(res);
		int fin = Integer.parseInt(res);
		if (fin == temp) {

		}
	}

	public static void fabinnoSeris(int n) {
		int t1 = 0, t2 = 1;
		for (int i = 1; i <= n; i++) {
			System.out.print(t1 + " ");
			int res = t1 + t2;
			t1 = t2;
			t2 = res;
		}

	}

	public static void countNumber(int n) {
		StringBuilder sb = new StringBuilder();
		sb.append(n);
		int totalsize = sb.toString().length();
		System.out.println(totalsize);
	}

}
