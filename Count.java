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

