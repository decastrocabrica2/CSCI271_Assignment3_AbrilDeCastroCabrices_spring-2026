/*************************************************************************
* Project 3 for CSCI 271-001 Spring 2026
*
* Author: Abril De Castro
* OS: Windows
* Compiler: javac 25.0.1
* Date: feb 24 2025
*
* Purpose
* this program reads a string from the user and returns the number of letters 
* in the string by using a recursive function.
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
* Parameters: it takes one string from the user
*
* Pre: has to be one string, cannot attempt to add or mutiply it does not
* solve math problems
*
* Post: when the recusion is done, the output will be how many letters the string
* has, so if have the word hello, then it will return 5 becuase that is how many 
* letters the string has
*
* Returns: return an integer 
*
* Called by: this is called in main 
* Calls: none
************************************************************************/




import java.util.Scanner;
public class CSCI271_Assignment3_Q1_AbrilDeCastroCabrices
{
    
    public static int recursion(String n){ // recursive function that passes a string
        //base case:
        if(n == "") 
        {
            return 0; // returns 0 if the base case is met
        }
        return 1 + recursion(n.substring(1));  // when the base case is not met then i
                                               // adds one and calls the function
    }
    
    
	public static void main(String[] args) {// main start bracket
	    
	    Scanner input = new Scanner(System.in); // makes scanner
		System.out.println("enter your word: "); //ask for the word
	    String word = input.nextLine();  // input for the string
	    int A = recursion(word);  // stores the recursion call in a string
	    
		System.out.println("recursive = " + A);  //out puts the stored recursion call
		
		input.close(); //closes the input
	} // main end bracket
}
