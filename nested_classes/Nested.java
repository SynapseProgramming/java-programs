public class Nested {

  private int x = 69;
  private int y;
  private static String w = "wow";

  public class Within {
    public void print() {
      // normal nested class have access to all member functions within the containing class
      System.out.println(Nested.this.x);
    }
  }

  public static class WithinS {

    public void print() {
      // static classes can only access static fields in the containing class
      System.out.println("wow");
    }
  }
}
