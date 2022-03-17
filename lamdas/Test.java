public class Test {

  // we would define a  Transformer which would add two numbers together

  /*
   *  In this case, we are instantiating a new object add of type Transformer.
   *  Notice that we actually have a lot of boiler plate code. For just overriding
   *  One function.
   *
   *  We could use lamda functions to shorten the whole expression
   *
   **/
  public Transformer<Integer, Integer> add =
      new Transformer<>() {
        @Override
        public Integer transform(Integer x, Integer y) {
          return x + y;
        }
      };

  /*
   * In this case, we are defining the same expression with lambda functions.
   *
   * a few notes about lamdba functions:
   * We do not need to explicitly define the return type as it has been done with generics
   * We do not need to give a name to the lamda function
   * (java takes it that it defines the transform function)
   * Brackets are not needed for the parameters if there is only one parameter.
   * Also, a new instance would also be created
   *
   *
   */
  public Transformer<Integer, Integer> newadd =
      (Integer x, Integer y) -> {
        return x + y;
      };
}
