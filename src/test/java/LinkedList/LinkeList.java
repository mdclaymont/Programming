package LinkedList;

import java.util.LinkedList;

import com.github.javafaker.Faker;

public class LinkeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		decList(5);
	}
	
	public static void decList(int n) {
		LinkedList<String> lil=new LinkedList<String>();
		
		Faker fc=new Faker();
		
		for(int i=0;i<n;i++) {
			lil.add(fc.name().firstName());
			
		}
		System.out.println(lil);
	}
	
	
	

}
