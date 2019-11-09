import java.util.Scanner;

public class RemoteControlApp {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String on;
		String button;

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
		System.out.println("\nPress any button for sound. \"OFF\" will turn remote off again. ");
		System.out.print("Button press >>: ");
		button = key.next().toLowerCase();

		do {
			switch (button) {

				case "0":
				case "1":
				case "2":
				case "3":
				case "4":
				case "5":
				case "6":
				case "7":
				case "8":
				case "9":
					System.out.println();
					pressButton();
					System.out.print(">>: ");
					button = key.next().toLowerCase();
					break;
				case "off":
					break;
				default:
					System.out.println();
					notRecognized();
					System.out.print(">>: ");
					button = key.next().toLowerCase();

			}
		} while (!button.equals("off"));
		
		System.out.println();
		turningOff();
		turningOff();
		turningOff();
	}

	public static void pressButton() {
		System.out.println("BOOP!");
	}

	public static void turningOn() {
		System.out.println("TURNING ON... ");
	}

	public static void turningOff() {
		System.out.println("TURNING OFF...");
	}

	public static void notRecognized() {
		System.out.println("COMMAND NOT RECOGNIZED.");
	}

	public static void asciiRemote() {
		System.out.println("" + "\t _______________\n" + "\t/  ___________  \\\n" + "\t| | on || off | |\n"
				+ "\t| |____||_____| |\n" + "\t|  ___ ___ ___  |\n" + "\t| | 7 | 8 | 9 | |\n" + "\t| |___|___|___| |\n"
				+ "\t| | 4 | 5 | 6 | |\n" + "\t| |___|___|___| |\n" + "\t| | 1 | 2 | 3 | |\n" + "\t| |___|___|___| |\n"
				+ "\t|     | 0 |     |\n" + "\t|     |___|     |\n" + "\t\\_______________/\n");
	}

}
