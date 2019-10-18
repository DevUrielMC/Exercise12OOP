package com.exercise12oop.model;
import java.lang.Math;
public class Circle extends Shape
{
	private double radio;
	
	public Circle ()
	{
		
	}
	public Circle(double radio)
	{
		this.radio=radio;
	}

	public double CalculateArea(double radio)
	{
		return (Math.pow(radio*Math.PI, 2));
	}
	
	public double CalculatePerimeter(double radio)
	{
		return 2*Math.PI*radio;
	}
	
	public double getRadio()
	{
		return radio;
	}
	public void setRadio(double radio)
	{
		this.radio=radio;
	}
}
