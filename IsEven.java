package Operators;

import java.util.Scanner;

public class IsEven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your Student Id ?");
		int idNumber = input.nextInt();
		
		int isEven = idNumber % 2;
		int isOdd = idNumber % 2;
		boolean total = isEven > isOdd;
		
		System.out.println(" Your Id is even: "+total);
		
	}

}
