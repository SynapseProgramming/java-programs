public class Curry {


/*
 * The main idea for currying would be that the first function would return another function
 * which would take in an input, and produce another output.
 * The input of the first function would define how the first returned function would behave
 * 
 *
 *
 */


  public Integer Test(Integer h){

    Integer k = 1;
    // the x-> y part would return a type of Transformer<Integer,Integer>
    // the y- > x+y defines the inner part of Transformer<Integer,Integer>
    Transformer<Integer,Transformer<Integer,Integer>> wow = x -> y -> (x+y);
    
    return wow.transform(k).transform(h);

  }






}
