package ua.com.bookmap.orderbook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	
	////////////////////////
	
	
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws InterruptedException, IOException {
//		
//		StringBuilder sb = new StringBuilder();
//		sb.append("hello").append(" ").append("ben");
//		System.out.println(sb.toString());
		
//		File file = new File("F:/ABC.TXT");
//		FileWriter fileWriter = new FileWriter(file,true);
//		filewriter.write("\r\n");
//		rhyme = line1 + System.lineSeparator() + line2;
		
		
		BufferedReader br = new BufferedReader(new FileReader("src/input.txt"));
		String line;
		 while ((line = br.readLine()) != null) {
//	            resultStringBuilder.append(line).append("\n");
			 analyzeLineFromFile(line);
	     }
		 br.close();
		 
		 writeToTheFile(sb.toString().trim()); 
		 
		 
		 String s = new Main().getNumberInString17(2);
			System.out.println(s);

			String s1 = new Main().getNumberInString11(5);
			System.out.println(s1);
		  
	}//Main
	
	public static void analyzeLineFromFile(String currentLine) throws IOException {
		String[] splitedCurrentLine = currentLine.split(",");
		StringBuilder subSb = new StringBuilder();
		for(int i = 0; i < splitedCurrentLine.length; i++) {
			if(splitedCurrentLine[i].equals("ask")) {
				
				subSb.append(splitedCurrentLine[i]).append(" ");
				
//				System.out.println(splitedCurrentLine[i]);
				System.out.println("hfhfhf");
			}
			
		}
		if(subSb.length() != 0) {
			sb.append(subSb.append(System.lineSeparator()));
		}
	}

	public void addLineSeperator(StringBuilder sb) {
		sb.append(System.lineSeparator());
	}
	
	
	public static void writeToTheFile(String wordToWriting) throws IOException {
		 File file = new File("src/output.txt");
		 FileWriter myWriter = new FileWriter(file);
	      myWriter.append(wordToWriting);
	      myWriter.close();
	}
	
	
	////////////////////////
	
	
	
	

	
	private String getNumberInString17(int number) {
	    return switch (number) {
	        case 1 -> "One";
	        case 2 -> "Two";
	        case 3 -> "Three";
	        case 4 -> "Four";
	        case 5 -> "Five";
	        default -> "Nil";
	    };
	}
	
	
	private String getNumberInString11(int number) {
		String result = "";
		switch(number) {
			case 1 : result = "One";
			break;
			case 2 : result = "Two";
			break;
			case 3 : result = "Three";
			break;
			case 4 : result = "Four";
			break;
			case 5 : result = "Five";
			break;
			default : result = "Five";
		}
		return result;
	}

}
