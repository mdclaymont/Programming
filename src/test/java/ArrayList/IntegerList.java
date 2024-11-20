package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class IntegerList {

	public static void main(String[] args) {
		
		
	//	shortNumber(5);
	//	snNum();
	//	shortByFunction();
	//	shortByCollection();
		findHighestNUmber();
	}
	
	public static void decArrayList(int n) {
		ArrayList<Integer> in=new ArrayList<Integer>();
		for(int i=0;i<=n;i++) {
			in.add(i*3);	
			}
		System.out.println(in);
	}
	
	
	public static void snNum() {
		int str[]= {3,4,5,1,3,6,1};
		int temp;
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<=str.length;j++) {
				if(str[i]>=str[j]) {
					temp=str[i];
					str[j]=str[i];
					str[i]=temp;
				}
			}
		}
		for(int i=0;i<str.length;i++) {
		System.out.print(str[i]+" ");
		}
	}
	
	static void shortByFunction() {
		int sr[]= {1,34,2,12,1,32};
		Arrays.sort(sr);
		for(int i=0;i<sr.length;i++) {
		System.out.print(sr[i]+" ");
		}
	}
	
	static void shortByCollection() {
		int str[]= {12,1,12,3,1,23,1};
		Arrays.stream(str).boxed().sorted(Collections.reverseOrder());
		
		
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
	}
	
	static void findHighestNUmber(){
		int nu[]= {12,32,21,12,321,6};
		int temp;
		for(int i=0;i<nu.length;i++) {
			for(int j=i+1;j<nu.length;j++) {
			if(nu[i]>=nu[j]) {
				temp=nu[i];
				nu[j]=nu[i];
				nu[i]=temp;
			}
			}
		}
		System.out.println("Highest Number Is "+nu[nu.length-1]);
		System.out.println("Lowest Number Is "+nu[0]);
	}

}
