package cdac;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StringFileWriter {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("dac.txt");
		System.out.println("Write the String in Enter the dac file");
	
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Enter Second line content in file");
		String s=sc.nextLine();
		//fw.write(str);
		fw.write(str+"\n");
		fw.write(s);
		fw.close();
		
		
		
		
		
		
	}

}
