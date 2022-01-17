class Gen {

  public static void main(String[] args) {
    Count obj1 = new Count();
    Count obj2 = new Count();
    // obj1 set count to 39
    obj1.setCnt(39);
    // obj2 print value of cnt
    System.out.println(obj2.getCnt());

    // This example shows that static variables belong to the class, and not to instances.
    // They are basically values shared across instances.

  }
}
