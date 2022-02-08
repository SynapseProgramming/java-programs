
/*
In this case, F and S would be replaced with whatever type that we give to the Pair object
for generics, they would only accept refernce types (types which point to an object)
primitive types such as int are not allowed here.

*/

class Pair<F,S>{

/*
in this case, the generics of F and S would be placed here, in place of our normal types
*/
private F first;   
private S second;   


  Pair(F f, S s){
    this.first=f;
    this.second=s;
  }
  
  public F getFirst(){
    return this.first;    
  }

  public S getSecond(){
    return this.second;    
  }




  }
