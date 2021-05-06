package utilities;
import java.io.*;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import TestCases.Main;

public class ReadingTextFile 
{
	public static Logger log = LogManager.getLogger(Main.class.getName());
	public static void ReadFile(String filenameHere) {
		try {
			BufferedReader br = new BufferedReader(new FileReader (filenameHere));
			String line = null;
			while((line = br.readLine()) != null) {
				String tmp[] = line.split("\t");
				int LineNumber = Integer.parseInt(tmp[0]);
				int RandomNumber = Integer.parseInt(tmp[1]);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void VerifyFilePath(String filenameHere) {
		File f = new File(filenameHere);
		  try {
		       
		       if (f.getCanonicalPath() == "random_numbers.txt")
		       {
		    	   log.info("\n" + "TestCase1 : Verify the file name:" + "\t" + "Pass" + "\n" + "The Path is:  " + f.getCanonicalPath() + "\n");
		       }
		       else
		       {
		    	   log.error("\n" + "TestCase1 : Verify the file name:" + "\t" + "Fail" + "\n" + "The Actual Path is:  " + f.getCanonicalPath() + "\n");
		       }
		       
		       
		       
		    }
		    catch (IOException e) {
		    	e.printStackTrace();
		    }
	}
	public static void VerifyTheLineCount(String filenameHere) {
		int count = 0;
		  try {
		       
			  File f = new File(filenameHere);
			  Scanner sc = new Scanner(f);
			  while(sc.hasNextLine()) {
			        sc.nextLine();
			        count++;
			      }
			  if (count == 50)
			  {
				  log.info("\n" + "TestCase2 : Verify the number of lines:" + "\t" + "Pass" + "\n" + "The number of lines is:  " + count + "\n");
			  }
			  else
			  {
				  log.error("\n" + "TestCase2 : Verify the number of lines:" + "\t" + "Pass" + "\n" + "The number of lines is:  " + count + "\n");
			  }

		       
		       
		    }
		    catch (IOException e) {
		    	e.printStackTrace();
		    }
	}
	public static void VerifyTheRandomNumber(String filenameHere) {
		try {
			BufferedReader br = new BufferedReader(new FileReader (filenameHere));
			String line = null;
			while((line = br.readLine()) != null) {
				String tmp[] = line.split("\t");
				int LineNumber = Integer.parseInt(tmp[0]);
				int RandomNumber = Integer.parseInt(tmp[1]);
				if(RandomNumber < 500 && RandomNumber > 100)
				{
					log.info("\n" + "TestCase3 : Verify the Random Number is between 100 and 500:" + "\t" + "Pass" + "\n" + LineNumber + "\t" + RandomNumber + "\n");
				}
				else
				{
					log.error("\n" + line,"<", LineNumber,">", ": " , RandomNumber, "<RandomNumber not between 100 and 500>" + "\n");
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
