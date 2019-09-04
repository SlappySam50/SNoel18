import java.util.Scanner;

//Author Name: Samuel Noel	
//Date: 8/23/2019
//Program Name: Noel_Drone
//Purpose: Simulation using button, drone movement in x, y,z location
public class Noel_Drone {

	public static void main(String[] args) {
		//initialize drone
		Drone drone1 = new Drone("SamDrone",0, 0, 0,"North") ;
		int choice;
		
		
		do {	
			choice = mainMenu();
			switch(choice) {
			case 1 ://Move Left
				drone1.droneXleft(drone1);
				break;
			case 2 ://Move Right
				drone1.droneXright(drone1);
				break;
			case 3 ://Move Drone Forward
				drone1.droneYforward(drone1);
				break;
			case 4 ://Move Drone Backward
				drone1.droneYBack(drone1);
				break;
			case 5 ://Move Drone Up
				drone1.droneZUp(drone1);
				break;
			case 6 ://Move Drone Down
				drone1.droneZDown(drone1);
				break;
			case 7 :// Drone Position
				drone1.getCompass(drone1);
				System.out.println(drone1);
				break;
			case 8 ://Quit
				System.out.println("Goodbye!");
				break;
			default: //Default message
				System.out.println("This Is Not A Valid input");
				break;
			}//End Switch
		} while (choice != 8);
		
	}//End Main

	private static int mainMenu() {//Displays Menu and grabs the choice from the user
		Scanner input = new Scanner(System.in);
		int choice = 0;
		System.out.println("1. Turn Drone Left");
		System.out.println("2. Turn Drone Right");
		System.out.println("3. Move Drone Forward ");
		System.out.println("4. Move Drone Backward");
		System.out.println("5. Move Drone Up");
		System.out.println("6. Move Drone Down");
		System.out.println("7. Drone Stats");
		System.out.println("8. Exit System");
		choice = input.nextInt();
		return choice;
	}

}//End Class
