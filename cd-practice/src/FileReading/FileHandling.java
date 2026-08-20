package FileReading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		//1. check if a file present if not create a new one
		File file = new File("C:\\Users\\ypurusho\\OneDrive - Capgemini\\Documents\\new text.txt");
		File folder = new File("C:\\\\Users\\\\ypurusho\\\\OneDrive - Capgemini\\\\Documents");
		System.out.println(folder.isDirectory());
		System.out.println(folder.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		if(file.exists() && file.isFile()) {
			System.out.println("file found");
		}else {
			System.out.println("creating new text file");
			try {
				if(file.createNewFile()) {
					System.out.println("file created");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//2. write some text into the file
		FileWriter writter = new FileWriter("C:\\Users\\ypurusho\\OneDrive - Capgemini\\Documents\\new text.txt");
		writter.write("Hello world! welcome to java programming");
		writter.close();
		
		//3.Read from file and print in console
		//FileReader reader = new FileReader("C:\\Users\\ypurusho\\OneDrive - Capgemini\\Documents\\new text.txt");
		//System.out.println(reader.read());
		// reading via scanner class
//		Scanner scanner = new Scanner(reader);
//		while(scanner.hasNextLine()) {
//			System.out.println(scanner.nextLine());
//		}
		//reading via read method
//		int chars ;
//		while( (chars = reader.read()) != -1) {
//			System.out.print((char)chars);
//		}
//		char[] array = new char[reader];
//		reader.read(array);
//		System.out.println(array);
		//scanner.close();
		
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\ypurusho\\OneDrive - Capgemini\\Documents\\new text.txt"))){
			String str;
			while((str = bufferedReader.readLine()) != null) {
				System.out.println(str);
			}
		}
		
		//4. delete the file
		boolean isDeleted = file.delete();
		
		if(isDeleted) {
			System.out.println("file does not exists");
		}else {
			System.out.println("not deleted");
		}
		
		file.deleteOnExit();
		
		
				
	}
}
