
/*
in this example, the class circle would implement
the getArea function which is defined in the getareable interface.

*/

public class Circle implements getareable{

private double radius;

Circle(double r){
  this.radius=r;
  }

// commenting out this function would result in an error.
// of course, the return of the function must match as well. 
@Override
public double getArea(){

return 3.14159*this.radius*this.radius;

  }

/*
This shows that interfaces can also store variables. 
Of course, the variable would only be available if it
is public.

*/
public int getwow(){
  return this.wow;

  }





  }
