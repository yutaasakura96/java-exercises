# All Factors

## Method: `printFactors`

### Description
The `printFactors` method takes one parameter of type `int` named `number`. It prints all factors of the given number. A factor of a number is an integer that divides the number wholly (i.e., without leaving a remainder).

### Method Signature
```java
public static void printFactors(int number)
```

### Behavior
- If `number` is less than 1, the method prints "Invalid Value".
- Otherwise, the method prints all factors of `number`.

### Example Input/Output
- `printFactors(6);` → should print:
  ```
  1
  2
  3
  6
  ```
- `printFactors(32);` → should print:
  ```
  1
  2
  4
  8
  16
  32
  ```
- `printFactors(10);` → should print:
  ```
  1
  2
  5
  10
  ```
- `printFactors(-1);` → should print "Invalid Value" since `number` is less than 1.

### Hint
Use a `while` or `for` loop to iterate through possible factors and check if they divide the number without leaving a remainder.
