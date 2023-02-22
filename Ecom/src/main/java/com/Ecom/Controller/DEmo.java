package com.Ecom.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DEmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[][] arr ={{1,2,3,4},{1,2,3,4},{1,2,3,4}};
	
	 IntStream.range(0, arr.length)
     .forEach(i -> {
         int sum = Arrays.stream(arr[i]).sum();
         int min = Arrays.stream(arr[i]).min().orElse(Integer.MAX_VALUE);
         System.out.println("Sum of row " + i + " is " + sum);
         System.out.println("Minimum value of row " + i + " is " + min);
     });
	}

}
