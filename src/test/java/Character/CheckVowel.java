package Character;

import java.util.Scanner;

public class CheckVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String exp;
		do {
			System.out.println("\n Please Enter your character or String \n");
			exp=sc.next();
			if(("aeiou").contains(exp.toLowerCase())) {
				System.out.println("expected Character is Vowel");
			}
			else {
				System.out.println("expected Character is not a Vowel");
			}
			
		}while(exp!="11");

	}

}
