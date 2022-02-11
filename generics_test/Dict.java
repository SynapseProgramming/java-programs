/*
This is a simple dictonary class, with key and pair values.

This also shows that we can fix the type in the template.

Classes need not be generic, to implement generic methods.


*/
public class Dict {

  public static void main(String[] args) {

    Object[] wow;
    wow = new Object[3];
    wow[0] = new Pair<String, Integer>("Apple", 45);
    wow[1] = new Pair<String, Integer>("Wow", 79);
    wow[2] = new Pair<String, Integer>("Bob", 35);
    for (int i = 0; i < wow.length; i++) {
      System.out.println(wow[i].toString());
    }
    java.util.Arrays.sort(wow);
    System.out.println("After Sorting");
    for (int i = 0; i < wow.length; i++) {
      System.out.println(wow[i].toString());
    }
  }
}
