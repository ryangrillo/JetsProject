package Jets;
import java.util.Scanner;

public class InputManager {
	Scanner kb = new Scanner(System.in);
	public void chooseMenuOption() {

		System.out.print("Choose an option. 1-5: ");
		int menuChoice = kb.nextInt();
		

		switch (menuChoice) {
			case 1:
			System.out.print("You chose list Fleet:");
			Jet jet =  new Jet();
			System.out.println(jet.toString());
			break;
			
		
		}//end chooseMenuOption method
		kb.close();
	}
	
	}
	

