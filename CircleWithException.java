import java.util.Scanner;

public class CircleWithException {

	private static double radius;
	private static double area;
	
	public static  double setRadius(double r) throws IllegalArgumentException {
		if(r < 0) throw new IllegalArgumentException();
		radius = r;
		return radius;
	}
	
	public static double getRadius() {
		return radius;
	}
	
	public static double getArea() throws Exception {
		area = getRadius() * getRadius() * 3.14159;
		if(area > 1000) throw new Exception();
		return area;
	}
	
	public static double getDiameter() {
		double diameter = 2 * getRadius();
		return diameter;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of the circle : ");
		double radius =  input.nextDouble();
		
		try {
			setRadius(radius);
			System.out.println("Radius : " + getRadius());
			System.out.println("Area : " + getArea());
			
		} catch (IllegalArgumentException e) {
			System.out.println("Caught: " + e + "\nRadius is not a positive number.");
		
		} catch(Exception e) {
			System.out.println("Caught: " + e + "\nArea is bigger than 1000.");
		}
		
	}

}
