# Equality Printer

This project contains a method `printEqual` that compares three integer parameters and prints a message based on their values.

## Method Description

### `printEqual(int a, int b, int c)`

This method takes three integer parameters and prints a message based on the following conditions:

- If any of the parameters is less than 0, it prints "Invalid Value".
- If all numbers are equal, it prints "All numbers are equal".
- If all numbers are different, it prints "All numbers are different".
- Otherwise, it prints "Neither all are equal or different".

## Examples

Here are some examples of how the method works:

- `printEqual(1, 1, 1);` should print: `All numbers are equal`
- `printEqual(1, 1, 2);` should print: `Neither all are equal or different`
- `printEqual(-1, -1, -1);` should print: `Invalid Value`
- `printEqual(1, 2, 3);` should print: `All numbers are different`

## Usage

To use the `printEqual` method, simply call it with three integer arguments. The method will print the appropriate message based on the values of the arguments.

```java
public class EqualityPrinter {
    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        } else if (a == b && b == c) {
            System.out.println("All numbers are equal");
        } else if (a != b && b != c && a != c) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}