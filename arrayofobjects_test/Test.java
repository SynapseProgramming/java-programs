public class Test {

  private Counter wow[];

  Test(int x) {
    this.wow = new Counter[5];
    for (int i = 0; i < this.wow.length; i++) {
      this.wow[i] = new Counter(i);
    }
  }

  public void printArr() {
    for (int i = 0; i < this.wow.length; i++) {
      System.out.println(this.wow[i].getValue());
    }
  }
  // this function would obtain the reference of specified element.
  // We would change a value of the reference.
  // the value in the original array should update.
  public void referenceTest(int ref) {
    Counter newref = this.wow[ref];
    newref.setValue(69);
  }
}
