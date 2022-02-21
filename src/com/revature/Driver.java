package com.revature;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Driver {

	public static void main(String[] args) {
			int ans = 0;
			int start = 1;
			
			String temp = "";
			String answer = "0";
			String num = "";
			
			
			while (start <= 999) {
			
				for (int i = 1; i <= 9; i++) {
					ans = start * i;
					temp = temp + String.valueOf(ans);
					
					if (temp.length() > 8) {
						break;
					}
				}
				try {
					if ((temp.length() == 9) &&(Integer.parseInt(temp)) > (Integer.parseInt(answer))) {
						
						char[] chars = temp.toCharArray();
						
						Map<Character, Integer> map = new HashMap<Character, Integer>();
						for(char c : chars) {
								int counter = map.getOrDefault(c, 0);
								map.put(c, ++counter);
							}
						
						for(char c : map.keySet()) {
							if(map.get(c) > 1) {
								break;
							}
						}
						answer = temp;
						num = String.valueOf(start);
						
						
					}
					
				}
				
				catch (NumberFormatException e) {
					System.out.println("an exception occurred");
				}

				

				
				temp = "";
				start ++;
			}
			System.out.println("The number with the largest pandigital product is: " + num);
			System.out.println("The pandigital number is: " + answer);
			
		}

}
