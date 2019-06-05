public class ShapeRunner 
{
	public static void main(String[] args)
    {
		// TODO Auto-generated method stub
		
		//ShapeBasics sb = new ShapeBasics();
		
		 // sample calls
		  Shape s1 = new Shape();
		  Shape s2 = new Circle();
		  Shape s3 = new Rectangle();

		 //  sb.draw(s1);
		   
		  Shape[] list = new Shape[3];	// create an array of Shape reference variables
		   list[0] = new Circle();		// attach a Circle to first array slot
		   list[1] = new Rectangle();		// attach a Rectangle to second slot
		   list[2] = new Triangle();		// attach a Triangle to third slot

		   // ....   continue in a like manner, attaching a variety of different
		   //        shapes to the array.  Note that there could be MANY subcategories
		   //        of shapes and MANY array elements.  Notice that we are using 
		   //        the polymorphism feature

		   for (int i = 0; i < list.length; i++)
			   list[i].findArea();
		      

	}

}

class Shape {
	
	void findArea()
	{
		System.out.println("I am the findArea Method from Shape class");
	}
	

}

class Triangle extends Shape{
	
	void findArea()
	{
		System.out.println("I am the findArea Method from Triangle class");
	}

}



class Rectangle extends Shape{
	
	void findArea()
	{
		System.out.println("I am the findArea Method from Rectangle class");
	}

}

class Circle extends Shape {
	
	void findArea()
	{
		System.out.println("I am the findArea Method from Circle class");
	}

}
