# First And Last Digit Sum

## Description
This project contains a method named `sumFirstAndLastDigit` which takes an integer parameter `number`. The method calculates the sum of the first and last digits of the given number. If the number is negative, the method returns -1 to indicate an invalid value.

## Method Details

### Method Signature
```java
public static int sumFirstAndLastDigit(int number)
```

### Parameters
- `number`: An integer whose first and last digits are to be summed.

### Return Value
- Returns the sum of the first and last digits of the given number.
- Returns -1 if the number is negative.

### Implementation
The method uses a loop to find the first digit of the number and directly accesses the last digit using the modulus operator.

### Example Input/Output
- `sumFirstAndLastDigit(252)` → should return 4 (2 + 2)
- `sumFirstAndLastDigit(257)` → should return 9 (2 + 7)
- `sumFirstAndLastDigit(0)` → should return 0 (0 + 0)
- `sumFirstAndLastDigit(5)` → should return 10 (5 + 5)
- `sumFirstAndLastDigit(-10)` → should return -1 (invalid value)

## How to Run
1. Copy the method implementation into your Java project.
2. Call the method with different integer values to test its functionality.
3. Verify the output against the expected results.