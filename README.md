# CSCI271_Assignment3_AbrilDeCastroCabrices_spring-2026

# Finding the complexity for each algorithm

# Question 1

In question 1 the task given was to find the length of a string using recursion.
first the function checks if the string is empty, if its not then it will call itself
and proccess one charcter at a time.
so the time complexity is T(n) = O(n)
because its making one recursive call per character


# Question 2

In question 2 the task given was to find how many times a given letter was repeated
in a given word.
The recursive call makes one call per character which gives O(n) time, but because I used
substring it gives me a new string each call, so the complexity is O(n^2)

# Question 3

In question 3 the task given was to find the max number in a array given by the user
the function visits each element in the array exactly one time
to the time complexity is O(n)

# Question 4

In question 4 the task given was to find how many times a number appeared in extremely large
number. This function uses the modulo operator to store the last number and compare it to 
the given digit. By using division it takes away the last number, reducing the original 
number given, so then recursion will keep calling on a smaller number
time complexity is: O(Log n)

# Question 5

In question 5 the task given was to reverse a string, same as question 2 since substring was
used then the recursion call will have a brand new string every time, therefore the 
time complexity is O(n^2)

# question 6 

In question 6 we were tasked to store values in an array and only add the even values. The
funtion uses the modulo operator to check if the value in a given index is even. If that 
condition is true then there will be an additon and a recursive call, else there wont be
an additon but there will be a recursive call. The recursive call allows the the i visit
every index one time. Furthermore the complexity is O(n). 
