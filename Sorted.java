import java.util.Scanner;
public class Sorted 
{
    public static void main(String[] args) 
    {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array  elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Sorted Array : ");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
    }
}