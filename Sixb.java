public class Sixb
{
	public static void main(String[] args) {
		double number = 31; // You can set the number here
        
        double cube = calculateCube(number);
        
        System.out.println("The cube of " + number + " is: " + cube);
    }
    
    public static double calculateCube(double number) {
        return Math.pow(number, 3);
    }
}
