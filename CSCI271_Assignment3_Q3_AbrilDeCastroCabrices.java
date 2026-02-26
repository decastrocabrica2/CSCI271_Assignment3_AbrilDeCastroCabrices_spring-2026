/*************************************************************************
* Project 3 for CSCI 271-001 Spring 2026
*
* Author: Abril De Castro
* OS: Windows
* Compiler: javac 25.0.1
* Date: feb 24 2025
*
* Purpose
* reads a list of numbers and stores them into an array and from that array
* it finds the max number
*
*************************************************************************/

/*******************************************************************
* I declare and confirm the following:
* - I have not discussed this program code with anyone other than my
* instructor or the teaching assistants assigned to this course.
* - I have not used programming code obtained from someone else,
* or any unauthorised sources, including the Internet, either
* modified or unmodified.
* - If any source code or documentation used in my program was
* obtained from other sources, like a text book or course notes,
* I have clearly indicated that with a proper citation in the
* comments of my program.
* - I have not designed this program in such a way as to defeat or
* interfere with the normal operation of the supplied grading code.
*
* <Abril De Castro>
* 
********************************************************************/

/*****************************<recursion>****************************
* Description: calls itself to perform the given operation
*
* Parameters: it takes one integer array and an integer variable
*
* Pre: has to give the size of the array cannot be a negative number
*
* Post: when the recursion is done it will output the max number from that list
*
* Returns: return an integer 
*
* Called by: this is called in main 
* Calls: none
************************************************************************/


import java.util.Scanner;


public class CSCI271_Assignment3_Q3_AbrilDeCastroCabrices
{
    
  public static int recursion(int[] n, int i) {  // we pass the arr, and we pass i as 0 so we can use it as an index
        
        //base case
        if(i == n.length - 1) {//checks if the index is currently at the last index{
            return n[i]; // will return what is in the last index
        }
      
       return Math.max(n[i], recursion(n, i+1)); //calling recursion, while passing the array and adding 1 to i each times
        //will compare the currect number with the next one which is basically the one at the end of the array because its
        //the number that we get as a return in therefore we can use to compare.
      
  }
	public static void main(String[] args) 
	{ // main start bracket
	    Scanner input = new Scanner(System.in); // makes scanner
	  
		System.out.println("Please enter array size: "); //asks for size
		
		int size = input.nextInt(); // ask for the size of the array
		
	    int[] numbers = new int[size]; // make the array the size from the input
	    
	    System.out.println("Enter your numbered list: ");  //this for loop allows you to input a certain amount of 
	    for(int i =0; i < numbers.length; i++){      //numbers based on the input size of the array
	        	numbers[i] = input.nextInt();  //stores
	    } 
	    int b = recursion(numbers, 0); // calls recursion and passes 0
	    System.out.println("The max in your list is: " + b);  //prints the result

              ///test cases, the test array is  is passed and the max of the array should be 12
               System.out.println("**********************************************");
            int[] test = {9,10,11,12,10,9};
             
            System.out.println("Tests the array: {9,10,11,12,10,9}");
            System.out.println("Test: " + recursion(test,0));
		input.close();
	} // main end bracket
}


