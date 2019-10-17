package com.exercise12oop.app;

import com.exercise12oop.model.Shapeable;

public abstract class Shape implements Shapeable {

	public static void main(String[] args) {
		

	}

	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return "figure is being draw";
	}

	@Override
	public String ChangeColor() {
		// TODO Auto-generated method stub
		return "Figure is being changed its color";
	}

	@Override
	public String Erase() {
		// TODO Auto-generated method stub
		return "Figure is being erased";
	}

	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double CalculatePerimneter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
