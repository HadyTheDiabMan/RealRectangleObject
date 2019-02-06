/**
 * 
 * @author hdiab22
 *
 */
public class Rectangle 
{
//fields for dimensions only
	//methods:
	//setwidth
	//setheight
	//get width
	//getheight
	//getdiagonal
	private double height=0;
	private double width=0; //all rects have own height+widths
	public void setwidth(double num1)
	{
		width=num1;
		
	}
	public void setheight(double num2)
	{
		height=num2;
		
	}
	public double getwidth() //a "getter"
	{
		return width;
	}
	public double getheight()
	{
		return height;
	}
	public double getArea()
	{
		double area= width*height;
		return area;
		//could also do: return width*height;
	}
	public double getdiagonal()
	{
		double diagonal= Math.sqrt((height*height)+(width*width));
		return diagonal;
	}
	public double getperimiter()
	{
		double perimiter= (height*2)+(width*2);
		return perimiter;
	}
	
	
}
