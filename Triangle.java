//Assignment 5.2
//Create an abstract class Figure with following properties and functions:
//Properties:
//double dim1;
//Methods: abstract void
//findArea(); abstract void
//findPerimeter();
//Create three subclasses Circle, Rectangle and Triangle that extends Figure class and define both
//the methods. Write a program that will find the area and perimeter of 3 Figures and print the
//details for all.


package assignment_5_2;


	public class Triangle extends Figure        //Declaring the class which inherited by Figure class.
	{
	     //Here, we are assuming the equilateral triangle, and dim1 defined in super class is side length of this triangle.
		double areaTriangle;      //double variable to store the value of area of Triangle.
		double perimeterTriangle;     //double variable to store the value of perimeter of Triangle.
		double sqrtOfThree=1.7320;     //double variable to store the value of square root of three which is used in Area formula.
		
		public Triangle(double dim1)     //Constructor.
		{
			super.dim1=dim1;          //Initializing the first side of Triangle.
		}
		
		public void findArea()
		{
			areaTriangle= (sqrtOfThree * dim1 * dim1)/4;           //Finding the area of Triangle.
			
			System.out.println("The Area of Triangle is "+areaTriangle);     //Printing the area of Triangle.
		}
		
		public void findPerimeter()
		{
			perimeterTriangle = 3 * dim1 ;       //Finding the perimeter of the Triangle.
			
			System.out.println("The perimeter of the Triangle is "+perimeterTriangle);       //Printing the perimeter value of Triangle.
		}
}
