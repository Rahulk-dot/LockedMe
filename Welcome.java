package mypackage;

import java.io.IOException;
import java.util.*;

public class Welcome {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("============================");
		System.out.println("\tWELCOME");
		System.out.println("\tLocked Me");
		System.out.println("\tRahul Kaushik");
		System.out.println("============================");
		System.out.println("Enter the path of the folder");
		String inFile = "";
		if(input.hasNextLine())
			inFile = input.nextLine();
		
		System.out.println("The Path is : "+ inFile);
		Menu.Option1(inFile);
		input.close();
		
		
		
		

	}

	
}

