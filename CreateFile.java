package com.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
public static void File() throws IOException{
	
	File file=new File("C:\\Users\\Varun Acharya\\Desktop\\Java Assignments\\CRUD\\Assignment.txt");
	try {
	if(file.createNewFile()) {
		System.out.println("file created successfully");
		
	}
	else
	{
		System.out.println("File already exists");
	}
}
catch (IOException e) {
	System.out.println("An error occured");
e.printStackTrace();
	
}

}

public static void main(String[] args) throws IOException {
	File();
}
}


