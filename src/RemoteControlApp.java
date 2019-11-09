import java.util.Scanner;

public class RemoteControlApp {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String on; 
		
		System.out.println("\nTo begin, turn on the remote control.");
		System.out.print(">>: ");
		on = key.next().toLowerCase();
		
		while (!on.equals("on")){
			System.out.println("\nTo begin, turn on the remote control.");
			System.out.println("\t\t(to turn on, type in a \"button press\"!)");
			System.out.print(">>: ");
			on = key.next();
		} 
		System.out.println();
		turningOn();
		turningOn();
		turningOn();
		
		
		
		
	}
	public static void pressButton() {
		System.out.println("BOOP!");
	}
	public static void turningOn() {
		System.out.println("TURNING ON... ");
	}
	
}
	//TODO: Add pressButton() method
	// TODO: Add turningON() method
