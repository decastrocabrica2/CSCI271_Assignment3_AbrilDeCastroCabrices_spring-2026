# CSCI271_Assignment3_AbrilDeCastroCabrices_spring-2026

# Finding the complexity for each algorithm

# Question 1

In question 1 the task given was to find the length of a string using recursion.
first the function checks if the string is empty, if its not then it will call itself
and proccess one charcter at a time, by using substring, peeling off one letter at a time.
because its making one recursive call per character and giving a new string on each call
  
######**Time complexity: T(n) = O(n^2)**

# Question 2

In question 2 the task given was to find how many times a given letter was repeated
in a given word. To reduce the ambiguity, when the user enters their word and character, they are both set to upper case.
Substring was used to be able to compare a character at a given index, and once done it would be erased.
The recursive call makes one call per character which gives O(n) time, but because substring was used
it ends up with a new string each call.  

######**The complexity: O(n^2)**

# Question 3

In question 3 the task given was to find the max number in a array given by the user.
the function visits each element in the array exactly one time, by comparing them using the arrays' index and using 
the Math.max method.  

######**Time complexity: O(n)**

# Question 4

In question 4 the task given was to find how many times a given number appeared in extremely large
number. This function uses the modulo operator to store the last number and compare it to 
the given digit. By using division it takes away the last number that was compared to the given digit, 
effectively reducing the original number given, so then recursion will keep calling on a smaller number everytime, and stop when theres nothing 
left to check

######**Time complexity is: O(Log n)**

# Question 5

In question 5 the task given was to reverse a string, same as question 2 since substring was
used then the recursion call will have a brand new string every time. Inside the recursive function a new char variable was
created to store the first character of the given string, then substring was used to take away the first character of the given word(index 0), since
it had been stored. One thing to note: when the recursive function was called it was stored in a new String variable successfully making the 
original string shorter and storing it to use it later. Moreover, in the return we add the string and the charcter we stored ealier, succesfully placing 
the first character at the end, and the recursion call will keep going until the length of the original string is zero. (basically using string concatenation)
substring was used to take away the first charcter in the given string.

######**The time complexity: O(n^2)**

# Question 6 

In question 6 the task given was to store values in an array and only add the even values. The
function uses the modulo operator to check if the value in a given index is even. If that 
condition is true then there will be an additon and a recursive call, else there wont be
an additon but there will be a recursive call. The recursive call allows the the i visit
every index one time. The recursive call stops when it goes past the array, and when it does it return zero
so it doesnt add unwanted numbers into the sum. 

######**The complexity: O(n).** 
