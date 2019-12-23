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
System.out.println("Enter Elements of Array are: ");
for(int i=0;i<n;i++)
{
int x = sc.nextInt();
a[i]=x;
}
for(int i=0;i<n;i++)
{
 sum = sum + a[i];
}
float avg;
avg = sum/n;
System.out.println("Sum is "+sum);
System.out.println("Average is "+avg);
}
}
