In this example, the main idea would be to show that 
by instantiating an data object in a class, we could pass this reference to other classes such that 
the other classes would also be able to modify stuff within this class. 

In this case, the various classes would share the same object. 

The best thing about this would be that if you change a property of the data object, then this property would be changed for all classes. 

Thus in this example:
Dataobj: class which contains an array of 10 integers.

high: class which instantiates the dataobj
mid: class that will just call the toString function of dataobj once it is created.    
