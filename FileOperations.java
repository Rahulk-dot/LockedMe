package mypackage;

import java.util.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import static mypackage.Menu.Option1;

public class FileOperations {
	//create a new file
	public static void deleteFile(String path) throws IOException {
		System.out.println("Enter the file name:");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		String filePath = path+"\\"+fileName;
		try {
			boolean result = Files.deleteIfExists(Paths.get(filePath));
			if (result==true) {
				System.out.println("File is deleted! ");
				
				Option1(path);
			}
			else {
				System.out.println("File Not Found");
			
				Option1(path);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void createFile(String path) throws IOException {
		// TODO Auto-generated method stub
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the file name:");
			String fileName = sc.nextLine();
			String filePath = path+"\\"+fileName;
			File file = new File(filePath);
		
			boolean result = file.exists();
			if(result == true) {
				System.out.println("File Already Exists!");
				Option1(path);
			}
			else {
				file.createNewFile();
				System.out.println("File created!");
				Option1(path);
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void getAllFiles(String path) {
		// TODO Auto-generated method stub
		try {
			File directoryPath = new File(path);
			File filesList[] = directoryPath.listFiles();
			List<File> newfile = Arrays.asList(filesList);
			System.out.println("List of the files :");
			if(filesList.length == 0) {
				System.out.println("Empty Directory!");
				Option1(path);
			}
			else {
				Collections.sort(newfile);
				newfile.stream().forEach(System.out::println);
				Option1(path);
			    
			}
      	}
		catch(Exception e){
		    System.out.println(e);
		}
	}
	public static void searchFiles(String path) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the File Name:");
			String fileName = in.nextLine();
			String filePath = path+"//"+fileName;
			File file = new File(filePath);
			boolean result = file.exists();
			if(result == true) {
				System.out.println("File Found :"+fileName);
			}
			else {
				System.out.println("File Not in Directory!");
			}
			Option1(path);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
