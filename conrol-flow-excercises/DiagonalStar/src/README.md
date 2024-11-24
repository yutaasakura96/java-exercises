# Diagonal Star

This project contains a method named `printSquareStar` that prints a rectangular pattern composed of stars (`*`) based on the input number. If the input number is less than 5, the method prints "Invalid Value".

## Method Details

### Method Signature

```java
public static void printSquareStar(int number)
```

### Parameters

- `number` (int): The size of the square star pattern to be printed. If `number` is less than 5, the method prints "Invalid Value".

### Description

The method prints a square star pattern with diagonals using nested loops. The pattern follows these rules:

1. In the first or last row, print stars.
2. In the first or last column, print stars.
3. When the row number equals the column number, print a star.
4. When the column number equals `rowCount - currentRow + 1`, print a star.

### Example Input/Output

#### Example 1

```java
printSquareStar(5);
```

Output:
```
*****
** **
* * *
** **
*****
```

#### Example 2

```java
printSquareStar(8);
```

Output:
```
********
**    **
* *  * *
*  **  *
*  **  *
* *  * *
**    **
********
```