package MainPackage;
/*Design a class named Triangle that extends GeometricObject. The class contains:
Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.
A no-arg constructor that creates a default triangle.
A constructor that creates a triangle with the specified side1, side2, and side3.
The accessor methods for all three data fields.
A method named getArea() that returns the area of this triangle.
A method named getPerimeter() that returns the perimeter of this triangle.
A method named toString() that returns a string description for the triangle.
*/

public class Triangle extends GeometricObject {
  private double side1=1.0;
  private double side2=1.0;
  private double side3=1.0;
  
 //no-arg constructor
 
  public Triangle(){
	  
  }
  public Triangle(double side1, double side2, double side3){
	  this.side1=side1;
	  this.side2=side2;
	  this.side3=side3;
	  
  }
  
  
 //return side1
public double getSide1() {
	return side1;
}
public void setSide1(double side1) {
	this.side1 = side1;
}
//return side2
public double getSide2() {
	return side2;
}
public void setSide2(double side2) {
	this.side2 = side2;
}
//return side3
public double getSide3() {
	return side3;
}
public void setSide3(double side3) {
	this.side3 = side3;
}
 
 //return perimeter
 public double getPerimeter(){
	 return (side1+side2+side3);
 }
 ////return area
 public double getArea(){
	 return Math.sqrt(getPerimeter()*0.5*(getPerimeter()*0.5-side1)*(getPerimeter()*0.5-side2)*(getPerimeter()*0.5-side3));
 }
 
 //return string description for the triangle
 public String toString(){
	 return "side1="+side1+"side2="+side2+"side3="+side3+"the area="+getArea()+"the perimeter="+getPerimeter();
 }
 
}
