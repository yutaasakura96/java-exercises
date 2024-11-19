# Minutes To Years and Days Calculator

This project contains a method `printYearsAndDays` that calculates the number of years and days from a given number of minutes.

## Method Description

### `printYearsAndDays`

- **Parameters**:
    - `long minutes`: The number of minutes to be converted into years and days.
- **Returns**:
    - This method does not return anything (`void`).
- **Description**:
    - If the `minutes` parameter is less than 0, the method prints "Invalid Value".
    - Otherwise, it calculates the number of years and days from the given minutes and prints the result in the format "XX min = YY y and ZZ d", where:
        - `XX` is the original value of minutes.
        - `YY` is the calculated number of years.
        - `ZZ` is the calculated number of days.

## Examples

```java
printYearsAndDays(525600);  // should print "525600 min = 1 y and 0 d"
printYearsAndDays(1051200); // should print "1051200 min = 2 y and 0 d"
printYearsAndDays(561600);  // should print "561600 min = 1 y and 25 d"