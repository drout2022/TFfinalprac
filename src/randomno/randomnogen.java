package randomno;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays; 

public class randomnogen {

	public static void main(String[] args) {

		 Random rd = new Random(); // creating Random object
	      int[] arr = new int[500]; // define array of 500 numbers
	      
	      // initialize array with random numbers
	      System.out.println("=============================================");  
	      System.out.println("The random array without sorting");  
	      System.out.println("=============================================");  
	      for (int i = 0; i < arr.length; i++) {
	         arr[i] = rd.nextInt(); // storing random integers in an array
	         System.out.println(arr[i]); // printing each array element
	      }
	      
	      // sort the array  
	      Arrays.sort(arr);   
	      System.out.println("=============================================");  
	      System.out.println("Elements of array sorted in ascending order: ");  
	      System.out.println("=============================================");  
	      //print the array   
	      for (int i = 0; i < arr.length; i++)   
	      {       
	      System.out.println(arr[i]);   
	      }   
	      
	     // ask for user input for nth smallest number
	     Scanner sc= new Scanner(System.in); 
	     System.out.print("Enter the number n for smallest number: ");
	     int n= sc.nextInt();
	 
	     // print the nth number
	     System.out.println(n + "th sorted number = " + arr[n]);    
	     sc.close();
	}

}
