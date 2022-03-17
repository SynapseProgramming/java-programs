/**
 * The main idea behind Transformer would be to take in a argument of type T, and return it as
 * another type U
 */
@FunctionalInterface
interface Transformer<T, U> {

  U transform(T x, T y);
}
