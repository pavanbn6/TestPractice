package utilities;

import java.io.*;
public class WritingFile {

	public static void writingTextFile(String filenameHere) {
		int i;	
		int LineNumber;
		int RandomNumber;
		int min = 100;
		int max = 500;
		
			try {
				FileWriter fw = new FileWriter(filenameHere, false);
				PrintWriter pw = new PrintWriter(fw);
				for(i=1; i<=50; i++)
				{
					LineNumber = i;
					RandomNumber = (int)(Math.random()*((max-min)+1))+min; 
					pw.println(LineNumber + "\t" + RandomNumber);
					
				}
				
				pw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		

	}

}
