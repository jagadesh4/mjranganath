package assg2;
import java.io.*;
import java.util.Scanner;

public class Count {
	public static void main(String[]args)
	
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("input string:");
		String na=sc.nextLine();
		System.out.println("stringname:"+ na);
		System.out.print("Number of  string: " );
		char[]a=na.toCharArray();
		int ln=na.length();
		int count[]=new int[256];
//		for (int i = a.length-1; i>=0; i--) 
//            System.out.println(a[i]);
        for (int i = 0; i < ln; i++) 
            count[na.charAt(i)]++; 
  
      
        char ch[] = new char[na.length()]; 
        for (int i = 0; i < ln; i++) { 
         ch[i] = na.charAt(i); 
            int find = 0; 
            for (int j = 0; j <= i; j++) { 
  
                if (na.charAt(i)== ch[j])  
                    find++;                 
            } 
  
            if (find == 1)  
                System.out.println("Number of Occurrence of " + 
                 na.charAt(i) + " is:" + count[na.charAt(i)]);             
        } 
    } 
   

		

				
		
	
		
	
}












































package FileOperation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Program {
	public static void main(String[] args) throws IOException {

		ArrayList<String> DStore = new ArrayList<String>();

		// try {
		String file = "D:\\BRD-File Upload\\BRD-File Upload\\Test Cases\\File1.txt";
		if (file.endsWith(".txt")) {
			System.out.println("valid extension");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = reader.readLine()) != null) {
				line += "~";

				String[] parts = line.split("(?<=~)");

				for (int ctr = 0; ctr < parts.length; ctr++) {
					while (parts[ctr].length() >= 1 && parts[ctr].charAt(parts[ctr].length() - 1) == '~') {
						parts[ctr] = parts[ctr].substring(0, parts[ctr].length() - 1);
					}
				}
			
				validateLength(parts[4]);
				validateemail(parts[5]);
				RecordStatus(parts[8]);
				validDataType(parts[1]);
				RecordAInactive(parts[9]);

				

			}
			reader.close();
		}
		System.out.println("**************************************");
		
	}


