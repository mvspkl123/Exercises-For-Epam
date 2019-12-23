import java.io.*;
import java.util.Scanner;
class Argument2
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
int i;
System.out.println("Enter element to search");
        int num = sc.nextInt();
        for (i = 0; i < n ; i++) {
            if(num == a[i]){
               System.out.println(num+" is present at index "+(i+1));
               break;
            }
        }
   
        if(i == n){
           System.out.println("-1");
    }
}
}
