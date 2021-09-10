package com.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
	public static void writeintofile() throws IOException {
	File file=new File("C:\\Users\\Varun Acharya\\Desktop\\Java Assignments\\CRUD\\Assignment.txt");
	FileWriter fw=new FileWriter(file);
	fw.write("This is my first file created using JAVA");
	fw.append("This is the Appended text");
	fw.close();
	}
	public static void main(String[] args) throws IOException {
		writeintofile();
	}

}
