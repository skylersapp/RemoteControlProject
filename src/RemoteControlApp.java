import java.util.Scanner;

public class RemoteControlApp {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String on; 
		
		System.out.println("To begin, turn on the remote control.\n");
		asciiRemote();
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
	public static void asciiRemote() {
		System.out.println(""
				+ "\t _______________\n" + 
				"\t/  ___________  \\\n" + 
				"\t| | on || off | |\n" + 
				"\t| |____||_____| |\n" + 
				"\t|  ___ ___ ___  |\n" + 
				"\t| | 7 | 8 | 9 | |\n" + 
				"\t| |___|___|___| |\n" + 
				"\t| | 4 | 5 | 6 | |\n" + 
				"\t| |___|___|___| |\n" + 
				"\t| | 1 | 2 | 3 | |\n" + 
				"\t| |___|___|___| |\n" + 
				"\t|     | 0 |     |\n" + 
				"\t|     |___|     |\n" + 
				"\t\\_______________/\n");
	}
	
}
	//TODO: Add pressButton() method
	// TODO: Add turningON() method
