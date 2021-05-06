package TestCases;

import utilities.WritingFile;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import utilities.ReadingTextFile;


public class Main {
	private static Logger log = LogManager.getLogger(Main.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			log.info("=================================================================================================");
			log.info("Execution Starts Here" + "\n");
			WritingFile writefile = new WritingFile();
			writefile.writingTextFile("random_numbers.txt");
			
			ReadingTextFile readfile = new ReadingTextFile();
			readfile.ReadFile("random_numbers.txt");
			readfile.VerifyFilePath("random_numbers.txt");
			readfile.VerifyTheLineCount("random_numbers.txt");
			readfile.VerifyTheRandomNumber("random_numbers.txt");
			
		}
	}

}
