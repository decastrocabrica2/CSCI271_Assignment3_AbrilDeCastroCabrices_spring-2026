/*************************************************************************
* Project 3 for CSCI 271-001 Spring 2026
*
* Author: Abril De Castro
* OS: Windows
* Compiler: javac 25.0.1
* Date: feb 24 2025
*
* Purpose
* takes a word and a char, this program will count how many times the char 
* appears in the string
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
* Parameters: it takes one string and char from the user
*
* Pre: has to be one string and one char, cannot attempt to add or mutiply it does not
* solve math problems
*
* Post: when the recusion is done, the output will be how many times the char 
* is in the word given
*
* Returns: return an integer 
*
* Called by: this is called in main 
* Calls: none
************************************************************************/

import java.util.Scanner;
public class CSCI271_Assignment3_Q2_AbrilDeCastroCabrices
{
    
   public static int recursion(String word, char c) { //passes a string and a char
        //base case:
        if(word == "") { //check if the string is empty
            return 0; //returns 0 if its empty
        }
         
        char newC = word.charAt(0); // makes a new char variable and sets it to the string
        
       if (Character.compare(c,newC) == 0) 
       {                                                  //compares the given character from input to the one stored in newC
            return  1 + recursion(word.substring(1), c); //if the character is the same then it will take it away and count 1
                                                        //and call recursion again but with a new string because substring(1)
                                                       //takes away what is in index 0, as sub(1) starts the string from index 1;
       }
        
           return recursion(word.substring(1), c); // when its not the same then still call recursion and take the letter off 
                                                  // though it does not add one to the count
    }
    
	public static void main(String[] args) 
	{ // main start bracket
	 Scanner input = new Scanner(System.in);  //makes scanner
		System.out.println("enter your word: "); //asks for the word
		String w = input.nextLine(); // stores the word as a string
		System.out.println("enter your letter: "); //ask for a char
	    char c = input.next().charAt(0); //stores the char
	    String word = w.toUpperCase(); // making the word uppercase
        char letter = Character.toUpperCase(c); // making the char upper case
        
       //made a int variable to store the recursion
       //passes the word, and the letter
	    int A = recursion(word, letter);
	    
	    //prints the stored recursion
		System.out.println(c + " is repeated " + A + " times.");
		//System.out.println(letter);
		input.close();
	} // main end bracket
}
