/*
 * Fn = Fn-1 + Fn-2
 *
 * Init Fn-1 + Fn-2 is a and b
 *
 * return first two elements first
 * then recursively sum up the previous two elements.
 *
 * first = 1
 * second =2
 *
 * current = first+ second
 * first = second;
 * second = current
 * ...
 *
 *
 * public InfiniteList(Producer<T> h, Producer<InfiniteList<T>> t) {
 *
 */

public class Fib {

  private static int first;
  private static int second;

  private static InfiniteList<Integer> comp() {

    int sum = Fib.first + Fib.second;
    InfiniteList<Integer> ans = new InfiniteList<Integer>(() -> sum, () -> comp());
    Fib.first = second;
    Fib.second = sum;
    return ans;
  }

  public static InfiniteList<Integer> fib(int f, int s) {
    Fib.first = f;
    Fib.second = s;

    return new InfiniteList<Integer>(
        () -> f,
        () -> {
          return new InfiniteList<Integer>(() -> s, () -> Fib.comp());
        });
  }
  
}
