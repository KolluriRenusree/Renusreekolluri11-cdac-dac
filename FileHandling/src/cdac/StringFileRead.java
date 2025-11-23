package cdac;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringFileRead {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("dac.txt");
//		BufferedReader br=new BufferedReader(fr);
//		String str=br.readLine();
		int ch;
		while((ch=fr.read())!=-1) {
			System.out.print((char)ch);
			
		}
		
		
		
	}
	

}
