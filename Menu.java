package mypackage;
import java.io.IOException;
import java.util.*;

public class Menu {
	public static void Option1(String path) throws IOException {
		System.out.println();
		System.out.println("Please choose a option of your choosing :");
		
		Scanner sc = new Scanner(System.in);
		
		
			
			
			switch(Optionsfor1(sc)) {
			case "1":
				FileOperations.getAllFiles(path);
				break;
			case "2":
				Option2(path);
				break;
			case "3":
				sc.close();
				System.exit(0);
				break;
			default:
				Option1(path);
				System.out.println("ERROR : You have entered the wrong option!");
				break;
			}
			
			
		
		
	}
	private static String Optionsfor1(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("=>> OPTIONS :");
		System.out.println("\t1. Display all files in folder");
		System.out.println("\t2. Display further options");
		System.out.println("\t3. Exit");
		String ch = " ";
		if(sc.hasNext()) {
			ch= sc.next();
		}
		return ch;
	}
	static void Option2(String path) throws IOException {
		Scanner in = new Scanner(System.in);
	
			
			switch(Optionsfor2(in)) {
			case 1:			
				FileOperations.createFile(path);
				break;
			case 2:			
				FileOperations.deleteFile(path);
				break;
			case 3:
				FileOperations.searchFiles(path);
				break;
			case 4:		
				Option1(path);
				break;
			default:
				Option2(path);
				System.out.println("ERRROR : Wrong Option!");
				break;
			}
			
			
		
		
	}
	private static int Optionsfor2(Scanner in) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("=>> FURTHER OPTIONS :");
		System.out.println("\t1. Add a file");
		System.out.println("\t2. Delete a file");
		System.out.println("\t3. Search a file");
		System.out.println("\t4. Go back to previous Menu");
		int value = 0;
		if(in.hasNextInt())
			value = in.nextInt();
		return value;
	}

}
