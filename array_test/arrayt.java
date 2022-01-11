class ArrayTest{

public static void main(String args[]){

//declare an array variable
int[] array;

//allocate memory for 10 integers
array= new int[10];
// insert data into the array
for(int i=0;i<10;i++){
//System.out.println(array[i]);
array[i]=i+1;
}

for(int i=0;i<10;i++){
System.out.println(array[i]);
}

}



}
