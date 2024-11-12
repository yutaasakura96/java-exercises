# Point Class in Java

This Java class, `Point`, represents a point in 2D space with integer coordinates `x` and `y`. The class includes constructors, getters, setters, and methods for calculating distances between points.

## Features

The `Point` class has the following features:

1. **Fields**:
    - `x` - an integer representing the x-coordinate of the point.
    - `y` - an integer representing the y-coordinate of the point.

2. **Constructors**:
    - **No-arg constructor**: Initializes `x` and `y` to `0`.
    - **Parameterized constructor**: Accepts two integer arguments to initialize `x` and `y`.

3. **Methods**:
    - `getX()`: Returns the value of `x`.
    - `getY()`: Returns the value of `y`.
    - `setX(int x)`: Sets the value of `x`.
    - `setY(int y)`: Sets the value of `y`.
    - `distance()`: Calculates the distance from this point to the origin `(0, 0)`.
    - `distance(Point other)`: Calculates the distance from this point to another `Point`.
    - `distance(int x, int y)`: Calculates the distance from this point to a point `(x, y)`.

## Distance Calculation

The distance between two points, `A(xA, yA)` and `B(xB, yB)`, is calculated using the formula:

\[
d(A, B) = \sqrt{(xB - xA)^2 + (yB - yA)^2}
\]

## Example Usage

Here’s an example of how to use the `Point` class and its methods:

```java
Point first = new Point(6, 5);
Point second = new Point(3, 1);

System.out.println("distance(0,0)= " + first.distance());
System.out.println("distance(second)= " + first.distance(second));
System.out.println("distance(2,2)= " + first.distance(2, 2));

Point point = new Point();
System.out.println("distance()= " + point.distance());

Expected Output

distance(0,0)= 7.810249675906654
distance(second)= 5.0
distance(2,2)= 5.0
distance()= 0.0

Notes

	•	Use Math.sqrt to calculate the square root.
	•	Avoid duplicating code in the distance methods by reusing the distance formula logic.
	•	All methods are public (not public static).
	•	The class has a total of 7 methods.

Additional Information

	•	Do not add a main method in the solution code, as this class is intended to be used as a utility for representing and manipulating points in 2D space.