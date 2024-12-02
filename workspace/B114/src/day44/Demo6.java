package day44;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo6 {
//notepad--> txt csv html xml json .java .python 
	public static void main(String[] args) throws IOException {
		int data;
		char c;
		
		FileInputStream fis=new FileInputStream("./data/users2.txt");
		
		do 
		{
			data= fis.read();
			c=(char)data;
			System.out.print(c);
		}
		while(data!=-1);
		
		fis.close();
		
		System.out.println(".");
		
	}

}
