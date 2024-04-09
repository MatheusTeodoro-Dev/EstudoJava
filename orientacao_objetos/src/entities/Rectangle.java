package entities;

public class Rectangle {

	public double widght;
	public double height;
	
	public double area () {
		return widght * height;
	}
	
	public double perimeter () {
		return (height * 2) + (widght *2);
	}
	
	public double diagonal () {
		return Math.sqrt(height * height + widght * widght);
	}
}
