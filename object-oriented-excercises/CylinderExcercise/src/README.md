# Cylinder Project

This project consists of two classes: `Circle` and `Cylinder`. The `Cylinder` class extends the `Circle` class. Below are the details of each class and their methods.

## Circle Class

The `Circle` class represents a circle with a radius. It includes the following:

### Fields
- `radius` (type: `double`): The radius of the circle.

### Constructor
- `Circle(double radius)`: Initializes the `radius` field. If the `radius` is less than 0, it sets the `radius` to 0.

### Methods
- `double getRadius()`: Returns the value of the `radius` field.
- `double getArea()`: Returns the calculated area of the circle using the formula `radius * radius * Math.PI`.

## Cylinder Class

The `Cylinder` class represents a cylinder and extends the `Circle` class. It includes the following:

### Fields
- `height` (type: `double`): The height of the cylinder.

### Constructor
- `Cylinder(double radius, double height)`: Calls the parent constructor to initialize the `radius` field and initializes the `height` field. If the `height` is less than 0, it sets the `height` to 0.

### Methods
- `double getHeight()`: Returns the value of the `height` field.
- `double getVolume()`: Returns the calculated volume of the cylinder using the formula `getArea() * height`.

## Test Example

Here is an example of how to test the `Circle` and `Cylinder` classes:

```java
Circle circle = new Circle(3.75);
System.out.println("circle.radius= " + circle.getRadius());
System.out.println("circle.area= " + circle.getArea());

Cylinder cylinder = new Cylinder(5.55, 7.25);
System.out.println("cylinder.radius= " + cylinder.getRadius());
System.out.println("cylinder.height= " + cylinder.getHeight());
System.out.println("cylinder.area= " + cylinder.getArea());
System.out.println("cylinder.volume= " + cylinder.getVolume());
```

### Expected Output

```
circle.radius= 3.75
circle.area= 44.178646691106465
cylinder.radius= 5.55
cylinder.height= 7.25
cylinder.area= 96.76890771219959
cylinder.volume= 701.574580913447
```

## Notes

- All methods should be defined as `public` and not `public static`.
- Each class should be in its own file.
- Do not add a `main` method to the solution code.