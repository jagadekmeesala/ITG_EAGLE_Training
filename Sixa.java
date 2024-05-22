public class Sixa
{
	public static void main(String[] args) {
		double radius = 5.0; // You can set the radius value here
        
        double pi = 3.14159; // Explicit definition of pi
        
        double area = calculateArea(radius, pi);
        
        System.out.println("Radius =" + radius + " Area = " + area);
    }
    
    public static double calculateArea(double radius, double pi) {
        return pi * radius * radius;
    }
}
