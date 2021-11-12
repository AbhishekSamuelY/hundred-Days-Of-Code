/*
 
       d8888 888888b.   888    888 8888888 .d8888b.  888    888 8888888888 888    d8P   .d8888b.        d8888 888b     d888 888     888 8888888888 888    Y88b   d88P 
      d88888 888  "88b  888    888   888  d88P  Y88b 888    888 888        888   d8P   d88P  Y88b      d88888 8888b   d8888 888     888 888        888     Y88b d88P  
     d88P888 888  .88P  888    888   888  Y88b.      888    888 888        888  d8P    Y88b.          d88P888 88888b.d88888 888     888 888        888      Y88o88P   
    d88P 888 8888888K.  8888888888   888   "Y888b.   8888888888 8888888    888d88K      "Y888b.      d88P 888 888Y88888P888 888     888 8888888    888       Y888P    
   d88P  888 888  "Y88b 888    888   888      "Y88b. 888    888 888        8888888b        "Y88b.   d88P  888 888 Y888P 888 888     888 888        888        888     
  d88P   888 888    888 888    888   888        "888 888    888 888        888  Y88b         "888  d88P   888 888  Y8P  888 888     888 888        888        888     
 d8888888888 888   d88P 888    888   888  Y88b  d88P 888    888 888        888   Y88b  Y88b  d88P d8888888888 888   "   888 Y88b. .d88P 888        888        888     
d88P     888 8888888P"  888    888 8888888 "Y8888P"  888    888 8888888888 888    Y88b  "Y8888P" d88P     888 888       888  "Y88888P"  8888888888 88888888   888     
======================================================================================================================================================================
email: abhisheksamuel.y@gmail.com
github: abhisheksamuely@github
                                                                                                                                                                                                                                                                              
*/
package com.abhisheksamuely.hundredDaysOfCode;

import java.util.ArrayList;

public class Subarray {

	public static void main(String[] args) {

		int[] arr = new int[] { 2, 3, 2, 5, 4, 6, 8, 9 };
		int n = 8;
		int s = 15;

		ArrayList<Integer> output = new ArrayList<>();
		int end = 0;
		int sum = 0;
		boolean isFound = false;

		for (int start = 0; start < n; start++) {

			if (sum < s) {
				sum += arr[start];
			}

			while (sum > s) {
				sum -= arr[end];
				end++;
			}

			if (sum == s) {
				isFound = true;
				output.add(end + 1);
				output.add(start + 1);
				break;
			}

		}

		if (!isFound) {
			output.add(-1);
		}

		System.out.println(output.get(0));
		System.out.println(output.get(1));

	}

}
