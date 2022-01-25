/*
Static binding and dynamic binding:

static binding -> the type that the object has at compile time 
dynamic binding -> the type that the object has at run time 

In this example, the argument in the say function has a static type of object 
However at runtime, the argument x would have the type of whatever object that was passed to it.

This is the essence of polymorphism. Aka, the same bunch of code can access totally different functions.

The say function would access the toString method of the given object. It would search in the given class first for the function of toString. 
Since we have already overridden the toString in the object class, java would just use that function.

In the case that we did not do that, then java would search in the parent class and upwards, until the toString function is found. 


*/

public class Test {

public static String say(Object x){
  return x.toString(); 
  }


  }
