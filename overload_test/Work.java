public class Work {

  /*
  To overload a function, the key things to take note of would be:
  - the number of arguments
  - the type of arguments
  - the return type of the function should be the same throughout
  - the name of the function should be the same

  - the name of variables does NOT overload the function

  */
  public static int square(int x) {
    return x * x;
  }

  public static int square(int x, int y) {
    return x * x + y * y;
  }
}
