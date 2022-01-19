
/*
In this case, the ColouredPoint class would inherit the public elements from the point class.
The coloured point class does not have access to the private member functions of the parent class.
the super function is used to pass arguments to the constructor of the parent class.


*/
class ColouredPoint extends Point{
private String col;

ColouredPoint(double x,double y, String colour){
  super(x,y);
  this.col=colour;
  }

public String getColour(){
  return this.col;

  }


  }
