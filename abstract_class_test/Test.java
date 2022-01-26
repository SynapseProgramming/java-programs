/*
This test program shows how an abstract class can be used to easily access the right implementation of functions which are
common across child classes of an abstract class. (getArea in this case)
If we were to use Object instead, then we would run into an issue where getArea is not defined in Object.

*/

public class Test {

  public static void main(String[] args) {

    // we will create an array of two objects
    // the first object in the array would be a circle
    // the next objet in the array would be a Triangle
    Shape[] arr = new Shape[] {new Circle(0, 0, 1), new Triangle(3, 4)};
    // we would print out the area of the shapes
    for (Shape curr : arr) {
      // in each iteration, curr would refer to the current object in the array
      double area = curr.getArea();
      System.out.println(area);
    }
  }
}
