package com;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderDemo {

	public static void main(String[] args) throws IOException {
		
		String file = "F://abc/abc.txt";
		
		File f = new File(file);
		
//		f.mkdir();
//		f.createNewFile();
//		
//		System.out.println("file is created");
//		
//		FileWriter fw = new FileWriter(f);
//		fw.write("The motive of the session is Java teaching");
//		fw.write(60);
//		char[] ch = new char[] {'a', 'b', 'c'};
//		fw.write(ch);
//		fw.flush();
//		fw.close();
//		System.out.println("file is written");
		
		FileReader fr = new FileReader(f);
//		
//		char[] ch1 = new char[(int)f.length()];
//		
//		fr.read(ch1);
//		
//		for(char ch2 : ch1) {
//			System.out.print(ch2);
//		}
		
		int i= fr.read();
		
		while(i!=-1) {
			
			System.out.print((char)i);
			
			i=fr.read();
		}

	}

}
