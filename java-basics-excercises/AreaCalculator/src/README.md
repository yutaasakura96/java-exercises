# Area Calculator

This project contains methods to calculate the area of a circle and a rectangle. The methods handle invalid input by returning -1.0.

## Methods

### `area(double radius)`

Calculates the area of a circle.

- **Parameters:**
    - `radius` (double): The radius of the circle.
- **Returns:**
    - The area of the circle as a double.
    - Returns -1.0 if the radius is negative.

**Formula:**
\[ \text{Area} = \pi \times \text{radius}^2 \]

**Examples:**
```java
area(5.0); // returns 78.53981633974483
area(-1);  // returns -1.0
```

### `area(double x, double y)`

Calculates the area of a rectangle.

- **Parameters:**
    - `x` (double): The length of the rectangle.
    - `y` (double): The width of the rectangle.
- **Returns:**
    - The area of the rectangle as a double.
    - Returns -1.0 if either `x` or `y` is negative.

**Formula:**
\[ \text{Area} = x \times y \]

**Examples:**
```java
area(5.0, 4.0); // returns 20.0
area(-1.0, 4.0); // returns -1.0
```

## Tips

- Use `Math.PI` for the value of π.
- Ensure to handle negative inputs by returning -1.0.