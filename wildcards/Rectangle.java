import java.lang.Math.*;

class Rectangle extends Shape {

  private double length;
  private double breath;

  Rectangle(double l, double b) {
    this.length = l;
    this.breath = b;
  }

  @Override
  public double getArea() {
    return this.length * this.breath;
  }
}
