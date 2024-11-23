# Number To Words

This project includes three methods: `numberToWords`, `reverse`, and `getDigitCount`. These methods work together to convert a number into its word representation.

## Methods

### numberToWords

This method takes an integer parameter `number` and prints the number using words for the digits. If the number is negative, it prints "Invalid Value".

#### Steps:
1. Extract the last digit of the given number using the remainder operator.
2. Convert the digit to its corresponding word.
3. Remove the last digit from the number.
4. Repeat steps 1-3 until the number is 0.

To ensure the words are printed in the correct order, the method uses the `reverse` method to reverse the number before converting it to words.

### reverse

This method takes an integer parameter and returns the reversed number. It handles both positive and negative numbers.

### getDigitCount

This method takes an integer parameter `number` and returns the count of digits in the number. If the number is negative, it returns -1 to indicate an invalid value.

## Example Input/Output

### getDigitCount method

```java
getDigitCount(0); // returns 1
getDigitCount(123); // returns 3
getDigitCount(-12); // returns -1
getDigitCount(5200); // returns 4
```

### reverse method

```java
reverse(-121); // returns -121
reverse(1212); // returns 2121
reverse(1234); // returns 4321
reverse(100); // returns 1
```

### numberToWords method

```java
numberToWords(123); // prints "One Two Three"
numberToWords(1010); // prints "One Zero One Zero"
numberToWords(1000); // prints "One Zero Zero Zero"
numberToWords(-12); // prints "Invalid Value"
```

## Hints

- Use a for loop to print zeroes after reversing the number. For example, 100 reversed becomes 1, but `numberToWords` should print "One Zero Zero". To get the number of zeroes, check the difference between the digit count from the original number and the reversed number.

## Note

When printing words, each word can be on its own line. For example, `numberToWords(123);` can be:

```
One
Two
Three
```