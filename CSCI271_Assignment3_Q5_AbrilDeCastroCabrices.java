/*************************************************************************
* Project 3 for CSCI 271-001 Spring 2026
*
* Author: Abril De Castro
* OS: Windows
* Compiler: javac 25.0.1
* Date: feb 24 2025
*
* Purpose
*takes a string and prints the string backwards
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
* Parameters: it takes one string variable 
*
* Pre: has to be a string it cannot perform any sort of math
*
* Post: when the recursion is done then it will out put the string backwards
*
* Returns: returns the string backwards
*
* Called by: this is called in main 
* Calls: none
************************************************************************/




import java.util.Scanner;
public class CSCI271_Assignment3_Q5_AbrilDeCastroCabrices
{
    
  public static String recursion(String n) {
        //base case:
        if(n.length() == 0){  //checks when the lenght of string n reaches 0
            return n; //returns n which is empty
        }
        
        int index = 0; // makes a new variable named index set at 0 and will always be 0
        char c; // new vaeiable char c
        
        if(index < n.length()) {  //if the index is grater then the lenght then
          c = n.charAt(index);  //store the 0 index of the said word in variable c
         String a =   recursion(n.substring(1)); // call recursion but with sub(1) effectively taking off the first letter of the word,
                                                 //by also soting the new string(given by sub(1)) in string a
          return a + c; // combine string a and char c
        }
        
         return n; // at the end return nothing
        
        
        
        
    }
	public static void main(String[] args) 
	{ // main start bracket
	
	 Scanner input = new Scanner(System.in); //makes scanner
		System.out.println("enter your word: ");  //asks the user for the word
	    String word = input.nextLine(); //stores the word
	    String A = recursion(word); // stores the recursion 
	    
		System.out.println("The reversed version of " + word + " is: " + A); //outputs the stored recursion 
		
		input.close();
	} // main end bracket
}
