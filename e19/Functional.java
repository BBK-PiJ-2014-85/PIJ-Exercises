package e19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Functional {
	
		
	public static void main (String[] args)
	{
	
		final List<String> friends = Arrays.asList("Bob", "Barry", "Harry");
		
		List<String> uc = new ArrayList<>();
		
		// normal method
//		for (String name : friends)
//		{
//			uc.add(name.toUpperCase());
//		}
	
		// single functional
//		friends.forEach(name -> uc.add(name.toUpperCase()));
	
		
//		uc = friends.stream()
//				.map(name -> name.toUpperCase())
//				.collect(Collectors.toList()); //have a terminator at the end

//		Function<String,String> f = x -> x.toUpperCase();
		Function<String,String> f = String::toUpperCase;
		uc = friends.stream()
				.map(f)
				.collect(Collectors.toList()); //have a terminator at the end
		
		System.out.print(uc);
	

		//Take first beginning with b

		List<String> b =  
			friends.stream()
					.filter(x -> x.startsWith("B"))
					.collect(Collectors.toList())
					;
		System.out.println(b);
		
		Optional<String> firstItem =  
				friends.stream()
						.filter(x -> x.startsWith("Z"))
						.findFirst()
						;
		System.out.println(firstItem.orElse("not present"));
		

		
	}

}
