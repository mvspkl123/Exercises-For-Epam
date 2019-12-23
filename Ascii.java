import java.io.*;
public class Ascii { 
  
    public static void main(String[] args) 
    { 
  	char c;
	int a[] = {65,66,78,68,90};  
      for(int i=0;i<5;i++) 
      {
         c =(char)a[i]; 
         System.out.println("Character with Ascii Value of "+ a[i]+" is "+c);
      }
    } 
} 
