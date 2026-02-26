/*************************************************************************
* Project 3 for CSCI 271-001 Spring 2026
*
* Author: Abril De Castro
* OS: Windows
* Compiler: javac 25.0.1
* Date: feb 24 2025
*
* Purpose
*takes a list of numbers but only adds the even ones
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
* Parameters: takes one interger array and one integer variable
*
* Pre: has to give the size of the array cannot be a negative number
*
* Post: will output the sum of the even numbers
*
* Returns: returns an integer sum
*
* Called by: this is called in main 
* Calls: none
************************************************************************/




import java.util.Scanner;
public class CSCI271_Assignment3_Q6_AbrilDeCastroCabrices
{
    
  public static int recursion(int[] n, int i) {  // we pass the arr, and we pass i as 0 so we can use it as an index
        
        //base case
        if(i == n.length) 
        {
            //checks if the index is currently past the array 
            return 0; // returns zero if it is
        }
        
       if ( n[i] % 2 == 0){ //if this is met then that means the number is a even number
          
        return  n[i] + recursion(n, i+1); // add the number in the said index and call recursion 
        }
    
      //if the if stament is not met then move to the next item in the array
       return  recursion(n, i+1); //calling recursion, while passing the array and adding 1 to i each times
       
        
      
  }
	public static void main(String[] args) 
	{ // main start bracket
	    Scanner input = new Scanner(System.in); //makes scanner
	  
		System.out.println("Please enter array size: "); //ask for the size
		
		int size = input.nextInt(); // ask for the size of the array
		
	    int[] numbers = new int[size]; // make the array the size from the input
	    
	    
	    System.out.println("enter your numbers: ");  //this for loop allows you to input a certain amount of 
	    for(int i =0; i < numbers.length; i++){      //numbers based on the input size of the array
	        	numbers[i] = input.nextInt(); //stores the numbers in the array
	    } 
	    
	    int b = recursion(numbers, 0); // calls recursion and passes 0
	    System.out.println("The sum of the even numbers is: " + b);  //prints the result
		
		input.close();
	} // main end bracket
}
