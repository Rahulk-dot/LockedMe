package mypackage;
import java.io.IOException;
import java.util.*;

public class Menu {
	public static void Option1(String path) throws IOException {
		System.out.println();
		System.out.println("Please choose a option of your choosing :");
		boolean result = true;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println();
			System.out.println("=>> OPTIONS :");
			System.out.println("\t1. Display all files in folder");
			System.out.println("\t2. Display further options");
			System.out.println("\t3. Exit");
			String ch = "";
			if(sc.hasNextLine())
				ch=sc.next();
			switch(ch) {
			case "1":
				FileOperations.getAllFiles(path);
				break;
			case "2":
				Option2(path);
				break;
			case "3":
				result = false;
				sc.close();
				System.exit(0);
			default:
				System.out.println("ERROR : You have entered the wrong option!");
				break;
			}
			
			
		}while(result == true);
		
	}
	static void Option2(String path) throws IOException {
		boolean result = true;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println();
			System.out.println("=>> FURTHER OPTIONS :");
			System.out.println("\t1. Add a file");
			System.out.println("\t2. Delete a file");
			System.out.println("\t3. Search a file");
			System.out.println("\t4. Go back to previous Menu");
			int value = 0;
			if(in.hasNextInt())
				value = in.nextInt();
			switch(value) {
			case 1:
				FileOperations.createFile(path);
				break;
			case 2:
				FileOperations.deleteFile(path);
				break;
			case 3:
				System.out.println("method to search a file");
				break;
			case 4:
				result = false;
				Option1(path);
				System.exit(0);
				in.close();
				break;
			default:
				System.out.println("ERRROR : Wrong Option!");
				break;
			}
			
			
		}while(result == true);
		
	}

}
