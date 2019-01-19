/**
 * 
 */
package marsRover;

/**
 * @author apple
 *
 */
public class MarsRover2 {

	/**
	 * @param args
	 */
	String status;
	int speed;
	float temperature;

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

	public static void main(String[] args) {
		MarsRover2 spirit = new MarsRover2();
        spirit.status = "exploring";
        spirit.speed = 2;
        spirit.temperature = -60;
        System.out.println("Spirit:\n");
        spirit.showAttributes();
        System.out.println("Increasing speed to 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Changing temperature to 670.");
        spirit.temperature = 670;
        System.out.println("Checking the temperature.");
        spirit.checkTemperature();
        spirit.showAttributes();

        MarsRover2 opportunity = new MarsRover2();
        System.out.println("\nopportunity:\n");
        opportunity.status = "exploring";
        opportunity.speed = 4;
        opportunity.temperature = -90;
        opportunity.showAttributes();
        opportunity.checkTemperature();
        opportunity.showAttributes();

	}

}
