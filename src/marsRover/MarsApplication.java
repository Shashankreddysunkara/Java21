package marsRover;

public class MarsApplication {
	private static MarsRover spirit;  //spirit belongs to MarsRover
//	How do you declare a field in Java? (line 4 + 12)
///			To make a field variable available only to a particular class, 
//	you add the Java keyword private just before the field declaration. 
//	Change the code in your StudentResults class to this: Now, only code
//	within the StudentResults class can see these field variables. 
//	To check, go back to your main method.
	//read http://tutorials.jenkov.com/java/fields.html
	public static void main(String[] arguments) {
		spirit = new MarsRover();
//		spirit.status = "exploring";
//		spirit.speed = 2;
//		spirit.temperature = -60;
//
		spirit.showAttributes();
//
//		System.out.println("Increasing speed to 3.");
//
//		spirit.speed = 3;
//
//		spirit.showAttributes();
//
//		System.out.println("Changing temperature to -90.");
//
//		spirit.temperature = -90;
//
//		spirit.showAttributes();
//
//		System.out.println("Checking the temperature.");
//
		spirit.checkTemperature();
//
		spirit.showAttributes();
	}
}