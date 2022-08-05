package mypackage;

import java.util.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
			}
			else {
				System.out.println("File Not Found");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		sc.close();
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
			}
			else {
				file.createNewFile();
			}
			sc.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void getAllFiles(String path) {
		// TODO Auto-generated method stub
		try {
			File directoryPath = new File("D:/SimpliLearn Projects/Test");
			File filesList[] = directoryPath.listFiles();
			List<File> newfile = Arrays.asList(filesList);
			System.out.println("List of the files :");
			if(filesList.length == 0) {
				System.out.println("No files!");
			}
			else {
				Collections.sort(newfile);
				newfile.stream().forEach(System.out::println);  
			    
			}
      	}
		catch(Exception e){
		    System.out.println(e);
		}
	}

}
