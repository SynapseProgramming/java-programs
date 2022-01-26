/*
The circle class would be a subclass of the Shape class.
In this case, it would provide the definition of the abstract getarea function.


*/

public class Circle extends Shape {
  // initialise the circle first
  Circle(double x, double y, double r) {
    this.x = x;
    this.y = y;
    this.r = r;
  }
  // if the abstract function of getArea is not defined here, then the java compiler would
  // throw an error.
  public double getArea() {
    return 3.14159 * this.r * this.r;
  }

  private double x;
  private double y;
  private double r;
}
