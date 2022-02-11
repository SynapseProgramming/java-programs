/*
In this case, F and S would be replaced with whatever type that we give to the Pair object
for generics, they would only accept refernce types (types which point to an object)
primitive types such as int are not allowed here.

*/

/*
in this case, we ensure that whatever template type which
is passed as F, it must indeed implement Comparable.

Also, the pair class would have to implement the comparable interface as well,
so that two pairs can be compared with one another.

In this implementation, we would use the key to compare two different pairs

Comparable compareto function:

Parameters:
o - the object to be compared.
Returns:
a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.



*/
class Pair<F extends Comparable<F>, S> implements Comparable<Pair<F, S>> {

  /*
  in this case, the generics of F and S would be placed here, in place of our normal types
  */
  private F first;
  private S second;

  Pair(F f, S s) {
    this.first = f;
    this.second = s;
  }

  public F getFirst() {
    return this.first;
  }

  public S getSecond() {
    return this.second;
  }

  @Override
  public String toString() {
    return this.first.toString() + " " + this.second.toString();
  }

  /*
   Assuming that the first ele is a string, the string function has implemented
   a compareto function. Thus, in this case, we are comparing the two strings and
   returning the output as a comparison between two pairs.

  the value 0 if the argument string is equal to this string; a value less than 0 if this string is lexicographically less than the string argument; and a value greater than 0 if this string is lexicographically greater than the string argument.



   */
  @Override
  public int compareTo(Pair<F, S> x) {
    return this.first.compareTo(x.first);
  }
}
