/**
 * 
 */
package marsRover;

/**
 * @author apple
 *
 */
public class MarsRover {
	
	//3 instance variables
	String status;
	int speed;
	float temperature;
	
	//2 instance methods
	void checkTemperature() {
		if (temperature < -80) {
			status = "returning home";
			speed = 5;
		}
	}
	
	void showAttributes() {
		System.out.println("Status: " + status);
		System.out.println("Speed: " + speed);
		System.out.println("Temperature: " + temperature);
	}

}