package dev.eight.feature.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author karth
 *
 */
public class ListIterateByLambda {

	public static void main(String[] args) {

		List<Integer> lt = new ArrayList<Integer>();
		
		lt.add(1);
		lt.add(2);
		lt.add(3);
		lt.add(4);
		lt.add(5);

		lt.forEach((x) -> System.out.println(x));
				
		// getting the even integer uasing the if condition in lambda expr
		lt.forEach( x -> { if (x%2==0) System.out.println(x); } );
		
	}
}
