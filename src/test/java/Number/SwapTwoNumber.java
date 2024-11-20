package Number;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b = 0;	
		do {
			System.out.println("\nPlease Enter Your Number for exit enter 0 second value \n");
			a=sc.nextInt();
			b=sc.nextInt();
			swapNumber(a,b);
			swapNumberWithoutTemp(a,b);
		}while(b!=0);

	}
	public static void swapNumber(int expfirstNum,int expSecNum) {
		int temp,res;
		System.out.println("Before Swap First Number "+expfirstNum+" Second Number "+expSecNum);
		temp=expfirstNum;
		res=expfirstNum+expSecNum;
		expfirstNum=res-expfirstNum;
		expSecNum=res-expfirstNum;
		System.out.println("After Swap First Number "+expfirstNum+" Second Number "+expSecNum);
		
	}
	
	public static void swapNumberWithoutTemp(int a,int b) {
		System.out.println("Before Swap First Number "+a+" Second Number "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swap First Number "+a+" Second Number "+b);
	}
	
	public static void SNumber(int a,int b) {
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("First Number A= " + a);
		System.out.println("Second Number B= "+b);
		System.out.println("Test");
	}

}
