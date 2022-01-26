// This is the triangle class

public class Triangle extends Shape {
  // initialise the Triangle first
  Triangle(double b, double h) {
    this.b = b;
    this.h = h;
  }
  // if the abstract function of getArea is not defined here, then the java compiler would
  // throw an error.
  public double getArea() {
    return 0.5 * b * h;
  }

  private double b;
  private double h;
}
