/*
 * exponentiator.java
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 * 
 * 
 * 
 */

import java.util.Scanner;
public class expo {
	
	private int a, b;
	
	public void getAB(int A, int B) {
		a = A;
		b = B;
		}
	
	public int exponentiation() {
		return (int)Math.pow(a, b);
		}
	
	public static void main (String args[]) {
		
		expo numbers = new expo();
		numbers.getAB(2, 4);
		System.out.println(numbers.exponentiation());
		
	}
}

