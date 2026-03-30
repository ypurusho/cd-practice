package FileReading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\ypurusho\\OneDrive - Capgemini\\Documents\\sample text.txt";
		File file = new File(path);
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream(file);
			InputStreamReader inputStream = new InputStreamReader(fileInputStream);
			BufferedReader bufferedReader = new BufferedReader(inputStream);
			
			int charCount = 0, wordCount = 0, lineCount = 0;
			String line;
			while((line = bufferedReader.readLine()) != null) {
				lineCount++;
				if(line != null) {
					charCount += line.length();
					wordCount += line.trim().split("\\s").length;
				}
			}
			System.out.println("Total number of lines : " + lineCount);
			System.out.println("Total number of words : " + wordCount);
			System.out.println("Total number of characters : " + charCount);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
