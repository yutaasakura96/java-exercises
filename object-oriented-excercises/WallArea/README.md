# Wall Class

This task involves creating a `Wall` class in Java that represents a wall with specific dimensions. The class will contain two fields (`width` and `height`), constructors for initialization, and several instance methods for accessing and modifying these fields. The class also includes a method to calculate the area of the wall.

## Class Requirements

### Fields
- **width**: `double` - represents the width of the wall.
- **height**: `double` - represents the height of the wall.

### Constructors
1. **No-argument constructor**: Initializes the `Wall` object with default values.
2. **Parameterized constructor**: Accepts two parameters (`width` and `height`) to initialize the fields. If either value is less than 0, the field is set to 0.

### Methods

1. **getWidth()**: Returns the current value of `width`.
2. **getHeight()**: Returns the current value of `height`.
3. **setWidth(double width)**: Sets the `width` field to the specified value. If the value is less than 0, `width` is set to 0.
4. **setHeight(double height)**: Sets the `height` field to the specified value. If the value is less than 0, `height` is set to 0.
5. **getArea()**: Returns the area of the wall (`width * height`).

## Example Code

Below is an example of how the `Wall` class can be used and tested.

```java
// TEST CODE

Wall wall = new Wall(5, 4);
System.out.println("area= " + wall.getArea()); // Expected output: area= 20.0

wall.setHeight(-1.5);
System.out.println("width= " + wall.getWidth()); // Expected output: width= 5.0
System.out.println("height= " + wall.getHeight()); // Expected output: height= 0.0
System.out.println("area= " + wall.getArea()); // Expected output: area= 0.0
```
## Expected Output
```java
area= 20.0
width= 5.0
height= 0.0
area= 0.0
```

## Notes

	•	All methods should be defined as public, not public static.
	•	In total, you need to implement 5 methods and 2 constructors.
	•	Do not include a main method in your solution code.