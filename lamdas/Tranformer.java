/**
 * The main idea behind Transformer would be to take in a argument of type T, and return it as
 * another type U
 */
@FunctionalInterface
interface Transformer<T, U> {

  //note: changed from two arguments to 1 argument to test out  Curry class
  U transform(T x);
}
