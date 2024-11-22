# Greatest Common Divisor

## Description
This project includes a method named `getGreatestCommonDivisor` that calculates the greatest common divisor (GCD) of two integers. The GCD is the largest positive integer that can fully divide each of the integers without leaving a remainder.

## Method Signature
```java
public static int getGreatestCommonDivisor(int first, int second)
```

## Parameters
- `first`: an integer representing the first number.
- `second`: an integer representing the second number.

## Return Value
- Returns the greatest common divisor of the two numbers.
- Returns `-1` if either of the parameters is less than `10` to indicate an invalid value.

## Example
For example, given the numbers `12` and `30`:
- Divisors of `12`: `1, 2, 3, 4, 6, 12`
- Divisors of `30`: `1, 2, 3, 5, 6, 10, 15, 30`
- The greatest common divisor is `6` since both `12` and `30` can be divided by `6` without a remainder.

## Example Input/Output
- `getGreatestCommonDivisor(25, 15);` should return `5` since both can be divided by `5` without a remainder.
- `getGreatestCommonDivisor(12, 30);` should return `6` since both can be divided by `6` without a remainder.
- `getGreatestCommonDivisor(9, 18);` should return `-1` since the first parameter is less than `10`.
- `getGreatestCommonDivisor(81, 153);` should return `9` since both can be divided by `9` without a remainder.

## Hints
- Use a `while` or a `for` loop to check if both numbers can be divided without a remainder.
- Find the minimum of the two numbers to optimize the loop.
