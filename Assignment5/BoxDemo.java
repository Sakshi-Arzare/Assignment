/* Create a class Box that uses a parameterized method to initialize the dimensions of a box.(dimensions are width, height, 
depth of double type). The class should have a method that can return volume. Obtain an object and print the corresponding 
volume in main() function.*/



class Box{
double width;
double height;
double depth;
double volume;


Box(double width,double height,double depth){
	this.width=width;
	this.height=height;
	this.depth=depth;
}


double volume(){
    System.out.println(volume = width*height*depth);
	return volume;
}


}


class BoxDemo{

public static void main(String args[]){
Box b = new Box(4.5,5.3,2.5);
b.volume();


}

}