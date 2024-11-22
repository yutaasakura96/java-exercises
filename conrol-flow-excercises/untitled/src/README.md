# Number Palindrome

## Description
This project contains a method called `isPalindrome` that checks if a given integer is a palindrome. A palindrome number is a number that remains the same when its digits are reversed.

## Method Signature
```java
public static boolean isPalindrome(int number)
```

## Parameters
- `number`: An integer to be checked if it is a palindrome.

## Returns
- `boolean`: Returns `true` if the number is a palindrome, otherwise returns `false`.

## Example Input/Output
```java
isPalindrome(-1221); // should return true
isPalindrome(707);   // should return true
isPalindrome(11212); // should return false
```

## Tips

### What is a Palindrome Number?
A palindrome number is a number that, when reversed, is equal to the original number. Examples include 121, 12321, and 1001.

### Logic to Check a Palindrome Number
1. Find the reverse of the given number and store it in a variable, say `reverse`.
2. Compare the original number with `reverse`.
3. If both are the same, the number is a palindrome; otherwise, it is not.

### Logic to Reverse a Number
1. Declare and initialize a variable to store the reverse of the number, e.g., `reverse = 0`.
2. Extract the last digit of the given number using modulo division (`%`).
3. Store the last digit in a variable, e.g., `lastDigit = num % 10`.
4. Increase the place value of `reverse` by multiplying it by 10.
5. Add `lastDigit` to `reverse`.
6. Remove the last digit of the number by dividing it by 10.
7. Repeat the steps until the number is not equal to (or greater than) zero.

A `while` loop is suitable for this coding exercise.