package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.github.javafaker.Faker;

public class NumberProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int [] num= {2,3,4,1};
		List<Integer> li=Arrays.asList(2,3,4,1);
		li.stream().sorted().forEach(n->System.out.print(n+" "));
		li.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
		List<String> sn=new ArrayList<String>();
		Faker fc=new Faker();
		for(int i=1;i<=9;i++) {
			sn.add(fc.name().firstName());
		}
		System.out.println(sn);
		
		sn.stream().filter(st->st.length()>6 && st.length()<8).forEach(s->System.out.println(s));
		
	List<String> res=	sn.stream().filter(st->st.length()>6 && st.length()<8).collect(Collectors.toList());
	
	//sorted
	System.out.println("desending order");
	sn.stream().sorted((a,b)->b.compareTo(a)).forEach(s->System.out.print(s+" "));
	
	}

}
