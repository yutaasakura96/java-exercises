# Carpet Cost Calculator

This project involves creating an application that calculates the price of carpeting for rectangular rooms. The total cost is determined by multiplying the area of the floor (width × length) by the price per square meter of the carpet.

## Classes Overview

The project consists of three classes: `Floor`, `Carpet`, and `Calculator`. Each class is detailed below.

---

### 1. `Floor` Class

The `Floor` class represents the dimensions of the floor.

#### Fields
- `width`: A `double` representing the width of the floor.
- `length`: A `double` representing the length of the floor.

#### Constructor
- Accepts `width` and `length` as parameters.
- If either parameter is less than 0, it sets the respective field to `0`.

#### Method
- `getArea()`: Returns the area of the floor (`width * length`).

---

### 2. `Carpet` Class

The `Carpet` class represents the cost per square meter of the carpet.

#### Field
- `cost`: A `double` representing the cost of the carpet per square meter.

#### Constructor
- Accepts `cost` as a parameter.
- If the `cost` parameter is less than 0, it sets the field to `0`.

#### Method
- `getCost()`: Returns the value of the `cost` field.

---

### 3. `Calculator` Class

The `Calculator` class calculates the total cost of carpeting the floor.

#### Fields
- `floor`: A `Floor` object.
- `carpet`: A `Carpet` object.

#### Constructor
- Accepts `floor` and `carpet` as parameters to initialize the fields.

#### Method
- `getTotalCost()`: Calculates and returns the total cost to cover the floor with the carpet by multiplying the floor's area by the carpet's cost.

---

## Test Example

Here is an example of how the classes can be used:

#### Test Code
```java
Carpet carpet = new Carpet(3.5);
Floor floor = new Floor(2.75, 4.0);
Calculator calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());

carpet = new Carpet(1.5);
floor = new Floor(5.4, 4.5);
calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());
```

Output

total= 38.5
total= 36.45

Notes

	1.	Each class should be in its own file.
	2.	Do not include a main method in the solution code.
	3.	All methods should be defined as public but not static.

Enjoy building your Carpet Cost Calculator! 🎉

