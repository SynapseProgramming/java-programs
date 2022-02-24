/*
In the circle class, we would throw an invalid argument exception if
the given inputs is not valid (negative radius) from the constructor.

Once the exception is thrown, then the code below the throw statement would
not be executed


*/

class Circle {
  private double rad;

  // Over here, we define that the constructor throws an illegal argument exception
  public Circle(double r) throws IllegalArgumentException {
    // over here, we instantiate the exception, and pass in a comment
    if (r < 0) {
      throw new IllegalArgumentException("radius should not be negative");
    }
    this.rad = r;
  }

  public void printRadius() {
    System.out.println(this.rad);
  }
}
