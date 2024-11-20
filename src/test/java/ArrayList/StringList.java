package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.github.javafaker.Faker;

public class StringList {

	public static void main(String[] args) {
		
		shortString(5);
	}
	
	static void shortString(int n) {
		Faker fc=new Faker();
		ArrayList<String> st=new ArrayList<String>();
		for(int i=0;i<n;i++) {
			
			st.add(fc.name().firstName());
		}
		
		//Shorting
		
		System.out.println(st);
		String temp;
		for(int i=0;i<st.size();i++) {
			for(int j=i+1;j<st.size();j++) {
				
			}
		}
	}

}
