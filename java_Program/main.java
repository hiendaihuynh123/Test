package java_Program;

import java.util.Scanner;

class Test
{
     static int arr[] = {12,3,4,15};
      
     // method for sum of elements in an array
     static int sum()
     {
         int sum = 0; // initialize sum
         int i;
       
         // Iterate through all elements and add them to sum
         for (i = 0; i < arr.length; i++)
            sum +=  arr[i];
       
         return sum;
     }
      
     // Driver method
     public static void main(String[] args)
     {
        int []a;
        Scanner sc = new Scanner(System.in);
        a= new int [10];
        for (int i  =0; i <2; i++)
        {
          a[i] = sc.nextInt();
        }
        for (int i  =0; i <2; i++)
        {
            System.out.println(a[i]);
        }
		//    Scanner sc = new Scanner(System.in);
		// String name = sc.next();
      // int a =sc.nextInt();
		// System.out.println("Hello " + name);
      
		// System.out.println("Hello " + a);
     }
 }