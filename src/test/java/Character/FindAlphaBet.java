package Character;

import java.util.Scanner;

public class FindAlphaBet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
		String expStr=null;
		do {
			System.out.println("\nPlease Enter Your Character For Exit Enter aa \n");
			expStr=sc.next();
			if(expStr!="aa") {
				if(expStr.length()>1) {
					System.out.println("Please Enter only one Character ");
				}
				else {
					char ch=expStr.charAt(0);
					if((ch>='a' && ch<='z')|| ch>='A' && ch<='Z') {
						System.out.println("Given is a alphabet Character => " + ch );
					}
					else {
						System.out.println("Given is  not an alphabet Character => " + ch );
					}
				}
			}
			
			
		}while(expStr!="aa");

	}

}
