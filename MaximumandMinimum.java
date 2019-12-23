import java.io.*;
import java.util.Scanner;
class Argument1
{
public static void main(String args[])
{
System.out.println("Enter array size");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a[] = new int[n];
int sum=0;
System.out.println("Enter Array Elements");
for(int i=0;i<n;i++)
{
int x = sc.nextInt();
a[i]=x;
}
int max = a[0];
int min = a[0];
for(int i = 1; i < n; i++)
{
    if(max < a[i])
      {
	max = a[i];
	}
	else if(min > a[i])
	{
                min = a[i];
	   }                      
}
System.out.println("Maximum number = "+ max + " Minimum number = " + min); 
}
}
