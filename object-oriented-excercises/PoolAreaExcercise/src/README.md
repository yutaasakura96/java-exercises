# Pool Area Application

This application calculates the volume of cuboid-shaped pools. It consists of two main classes: `Rectangle` and `Cuboid`.

## Rectangle Class

The `Rectangle` class represents a rectangle with a width and length.

### Fields

- `width`: A double representing the width of the rectangle.
- `length`: A double representing the length of the rectangle.

### Constructor

```java
public Rectangle(double width, double length)
```

- Initializes the `width` and `length` fields.
- If the `width` is less than 0, it sets the `width` to 0.
- If the `length` is less than 0, it sets the `length` to 0.

### Methods

- `public double getWidth()`: Returns the value of the `width` field.
- `public double getLength()`: Returns the value of the `length` field.
- `public double getArea()`: Returns the calculated area (`width * length`).

## Cuboid Class

The `Cuboid` class extends the `Rectangle` class and represents a cuboid with a width, length, and height.

### Fields

- `height`: A double representing the height of the cuboid.

### Constructor

```java
public Cuboid(double width, double length, double height)
```

- Calls the parent constructor to initialize the `width` and `length` fields.
- Initializes the `height` field.
- If the `height` is less than 0, it sets the `height` to 0.

### Methods

- `public double getHeight()`: Returns the value of the `height` field.
- `public double getVolume()`: Returns the calculated volume (area * height).

## Test Example

```java
Rectangle rectangle = new Rectangle(5, 10);
System.out.println("rectangle.width= " + rectangle.getWidth());
System.out.println("rectangle.length= " + rectangle.getLength());
System.out.println("rectangle.area= " + rectangle.getArea());

Cuboid cuboid = new Cuboid(5, 10, 5);
System.out.println("cuboid.width= " + cuboid.getWidth());
System.out.println("cuboid.length= " + cuboid.getLength());
System.out.println("cuboid.area= " + cuboid.getArea());
System.out.println("cuboid.height= " + cuboid.getHeight());
System.out.println("cuboid.volume= " + cuboid.getVolume());
```

### Expected Output

```
rectangle.width= 5.0
rectangle.length= 10.0
rectangle.area= 50.0
cuboid.width= 5.0
cuboid.length= 10.0
cuboid.area= 50.0
cuboid.height= 5.0
cuboid.volume= 250.0
```

## Notes

- All methods should be defined as public, not public static.
- Each class should be in its own file.
- Do not add a main method to the solution code.