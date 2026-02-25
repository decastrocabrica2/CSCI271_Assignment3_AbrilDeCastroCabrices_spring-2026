/*************************************************************************
* Project 3 for CSCI 271-001 Spring 2026
*
* Author: Abril De Castro
* OS: Windows
* Compiler: javac 25.0.1
* Date: feb 24 2025
*
* Purpose
* reads a long number and finds how many times a certain number appears in 
* said long number
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
* Parameters: it takes one long variable and one integer variable 
*
* Pre: has to be a long number but it cannot be more than what a variable
* long can hadle which is 64 bits. the digit must be a single digit
*
* Post: when the recursion is done it will output how many of a certain number
* appered in the long number given by the user
*
* Returns: return an integer 
*
* Called by: this is called in main 
* Calls: none
************************************************************************/




import java.util.Scanner;
public class CSCI271_Assignment3_Q4_AbrilDeCastroCabrices
{
    
   public static int recursion(long n, int d) { //passes the long numebr and the single digi
        
        
        if(n == 0)  // base case
        {
            return 0; //when the base case is met it returns 0
        }
        
        long remainder = n % 10; // makes a new variable called remainder to store the last number of N
        
        if (remainder == d)  // compares the stored number to the digit given by the user
        {
            n/=10;   // if the condition is true 
                     // it divides the long number by 10 effictively taaking the last number of N off
            return 1 + recursion(n,d);  // then it adds one to the count while also calling recursion
        }
         n /=10; // when its not met take the last integer off anywas
         return recursion(n,d) ;  // and call recursion again.
   }  
   
	public static void main(String[] args) 
	{ // main start bracket
	
	 Scanner input = new Scanner(System.in); //makes the scanner
		System.out.println("enter your number: ");  //ask for the long number
		long n = input.nextLong(); // stores the number
		System.out.println("enter your single digit: "); //enter the single digit
	    int d = input.nextInt(); //stores the single digit
	   
	    int A = recursion(n, d); //stores the recursion 
	    
		System.out.println(A); //prints the stored recursion
		//System.out.println(letter);
		input.close();
	} // main end bracket
}





