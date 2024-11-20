package LamdaExpression;

import java.util.function.Predicate;

public class PredicateLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p=i->(i>10);
		System.out.println(p.test(20));
		System.out.println("Second Test");
		Predicate <String> s=i->(i.length()>40);
		System.out.println(s.test("wellcome"));

	}

}
