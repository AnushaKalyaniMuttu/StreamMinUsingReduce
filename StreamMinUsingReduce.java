package com.order;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinUsingReduce {

	public static Optional<Integer> findMaxValue(List<Integer> integerList) {
    //remove inital value in reduce returns a return type of optional using .get() method to get the minimum of the list
	return	integerList.stream().reduce((x,y)->x<y? x: y);
	}
	public static void main (String [] args) {
		List<Integer> integerList=Arrays.asList(6,7,8,9,10,6);
		System.out.println(findMaxValue(integerList).get());
	}
}
//output: 6
