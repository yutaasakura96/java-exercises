# Perfect Number

## What is a Perfect Number?

A perfect number is a positive integer which is equal to the sum of its proper positive divisors. Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and exclude the perfect number itself.

For example, take the number 6:
- Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded).
- The sum of its proper divisors is 1 + 2 + 3 = 6.

Therefore, 6 is a perfect number (as well as the first perfect number).

## Method: `isPerfectNumber`

### Description

The `isPerfectNumber` method determines if a given number is a perfect number.

### Parameters

- `number` (int): The number to be checked.

### Returns

- `boolean`: `true` if the number is perfect, `false` otherwise.

### Implementation

If `number` is less than 1, the method returns `false`.

The method calculates if the number is perfect by summing its proper divisors. If the sum equals the number, the method returns `true`; otherwise, it returns `false`.

### Example Input/Output

```java
isPerfectNumber(6); // should return true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6

isPerfectNumber(28); // should return true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28

isPerfectNumber(5); // should return false since its only proper divisor is 1 and the sum is 1 not 5

isPerfectNumber(-1); // should return false since the number is < 1
```

### Hints

- Use a `while` or `for` loop to iterate through potential divisors.
- Use the remainder operator (`%`) to check if a number is a divisor.