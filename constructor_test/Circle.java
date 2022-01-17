class Circle {
  // this is the class constructor. It is called during class init.
  public Circle(int r) {
    this.r = r;
  }

  public void setR(int r) {
    this.r = r;
  }

  public int getR() {
    // the this keyword is a special pointer which has access to all of the members of the class.
    return this.r;
  }
  // if a variable is declared as private, then only memeber functions have access to it. code
  // outside of this class have no access.
  private int r;
}
