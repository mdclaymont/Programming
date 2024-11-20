package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.github.javafaker.Faker;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>li=new ArrayList<String>();
		Faker fc=new Faker();
		for(int i=1;i<=10;i++) {
			li.add(fc.name().firstName());
		}
		System.out.println(li);
		
		li.stream().map(name->name.toUpperCase()).collect(Collectors.toList()).forEach(s->System.out.print(s+", "));

	}

}
