// Copyright 2024 Alex Chandarana
//

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		// TODO Auto-generated method stub
		
		// request Scanner for console
		Scanner console = new Scanner(System.in);
		
		// get name
		String name;
		System.out.print("What is your name? ");
		name = console.nextLine();
		
		// Display name
		System.out.println("Hello, " + name + "!\nWelcome to Programming.");
		
		// treat input as an integer
		int number;
		System.out.print("Enter an integer: ");
		number = console.nextInt();
		System.out.println("Twice " + number + " is " + (number + number));

	}

}
