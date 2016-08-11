package iofile;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args)   {
		File file = new File("D:\\YOUNGWORLD\\myfile.txt");
		
		try {
			if(file.createNewFile()){
				System.out.println("Success!");
			}
			else
				System.out.println("Error, file already exists.");
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
	
		}
	}
}
