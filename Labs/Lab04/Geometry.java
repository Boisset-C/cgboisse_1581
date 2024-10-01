//Cosme Boisset - Lab04 - Problem 1: Geometry

/*
static double getAreaRectangle(double width, double length)
Returns the area of a rectangle, area = length * width

static double getAreaCircle(double radius)
Returns the area of a circle, area = 𝝅(radius2)

static double getAreaTriangle(double base, double height)
Returns the area of a triangle, area = ½(base * height)

static double getPerimeterRectangle(double width, double length)
Returns the perimeter of a Rectangle, perimeter = 2(length + width)

static double getPerimeterCircle(double radius)
Returns the perimeter of a Circle, perimeter = 2𝝅(radius)

static double getPerimeterTriangle(double side1, double side2, double
side3)
Returns the perimeter of a triangle, perimeter = s1 + s2 + s3
*/

public class Geometry {
    public static double getAreaRectangle(double width, double length) {
        return length * width;
    }

    public static double getAreaCircle(double radius) {
        return Math.PI * radius;
    }

    public static double getAreaTriangle(double base, double height) {
        return (base * height) / 2;
    }

    public static double getPerimeterRectangle(double width, double length) {
        return (width + length) * 2;
    }

    public static double getPerimeterCircle(double radius) {
        return 2 * (Math.PI * radius);
    }

    public static double getPerimeterTriangle(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }



}