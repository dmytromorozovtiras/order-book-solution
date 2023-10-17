package ua.com.bookmap.orderbook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws InterruptedException, IOException {
		
		long start = System.currentTimeMillis();
		
		Main m = new Main();
		BufferedReader br = new BufferedReader(new FileReader("src/input.txt"));
		String line;
		int counter = 0;
		 while ((line = br.readLine()) != null) {
			 counter++;
			 m.analyzeLineFromFile(line, counter);
	     }
		 br.close();
		 
		 m.writeToTheFile(sb.toString().trim()); 
		 long end = System.currentTimeMillis();
		 System.out.println("\n" + (end - start) + " ms");
	}//Main
	
	public  void analyzeLineFromFile(String currentLine, int numberOfLine) throws IOException {
		String[] splitedCurrentLine = currentLine.split(",");
		StringBuilder subSb = new StringBuilder();
		for(int i = 0; i < splitedCurrentLine.length; i++) {
			if(splitedCurrentLine[i].equals("ask")) {
				subSb.append(splitedCurrentLine[i]).append(" ");
				System.out.println(splitedCurrentLine[i] + " " + subSb.length());
			}	
		}
		
		if(subSb.length() != 0) {
			subSb.append(System.lineSeparator());
			subSb.reverse().append(" " + reverseInt(numberOfLine));
			sb.append(subSb.reverse());
		}
	}
	
	private StringBuilder reverseInt(int toReverse) {
		return new StringBuilder("" + toReverse).reverse();
	}
	
	public void writeToTheFile(String wordToWriting) throws IOException {
		System.out.println(reverseInt(100));
		 File file = new File("src/output.txt");
		 FileWriter myWriter = new FileWriter(file);
	      myWriter.append(wordToWriting);
	      myWriter.close();
	}

}
