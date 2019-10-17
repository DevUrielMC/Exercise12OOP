package com.exercise12oop.model;
import com.exercise12oop.app.Shape;
import java.lang.Math;

public class Triangle extends Shape
{
	//variables
	private double base;
	private double height;
	
	//constructor 
	public Triangle()
	{
		
	}
	
	//constructor 
		public Triangle(double base, double height)
		{
			this.base=base;
			this.height=height;
			
		}
		
		public double CalculateArea(double base, double height)
		{
			return (base*height)/2;
		}
		
		public double CalculatePerimeter(double base, double height)
		{
			return Math.sqrt(Math.pow(base, 2)+Math.pow(height, 2));
		}
		
		//getters and setters
		public double getBase()
		{
			return base;
		}
		public void setBase(double base)
		{
			this.base=base;
		}
		
		public double getHeigth()
		{
			return height;
		}
		public void setHeigth(double heigth)
		{
			this.height=heigth;
		}

}
