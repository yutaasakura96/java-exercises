# Largest Prime

## Description

This project includes a method named `getLargestPrime` that calculates the largest prime factor of a given number. If the number is negative or does not have any prime numbers, the method returns -1 to indicate an invalid value.

## Method Details

### Method Signature

```java
public static int getLargestPrime(int number)
```

### Parameters

- `number` (int): The number for which the largest prime factor is to be calculated.

### Return Value

- Returns the largest prime factor of the given number.
- Returns -1 if the number is negative or does not have any prime numbers.

## Example Input/Output

- `getLargestPrime(21)` should return `7` since `7` is the largest prime (3 * 7 = 21).
- `getLargestPrime(217)` should return `31` since `31` is the largest prime (7 * 31 = 217).
- `getLargestPrime(0)` should return `-1` since `0` does not have any prime numbers.
- `getLargestPrime(45)` should return `5` since `5` is the largest prime (3 * 3 * 5 = 45).
- `getLargestPrime(-1)` should return `-1` since the parameter is negative.

## Hints

- Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.