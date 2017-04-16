package Jets;

import java.util.Scanner;

public class InputManager {
	Hangar h;
	Scanner kb = new Scanner(System.in);

	public void chooseMenuOption(Hangar hangar) {
		h = hangar;

		boolean keepGoing = true;
		while (keepGoing) {
			System.out.print("Choose an option. 1-5:  (6) to quit");
			System.out.println();
			menuDisplay m = new menuDisplay();
			m.menu();
			int menuChoice = kb.nextInt();
			switch (menuChoice) {
			case 1:
				System.out.println("You chose list Fleet:");
				displayFleet();
				break;
			case 2:
				System.out.println("The fastest jet is: ");
				Jet fastest = h.getFastest();
				System.out.println(fastest);
				
				break;
			case 3:
				System.out.println("The plane with the longest range is: ");
				Jet longest = h.getlongestRange();
				System.out.println(longest);
				break;
			case 4: 
				System.out.println("Please enter: ");
				addJet();
				break;
//			case 5:
//				stretch goal
//				break;
			case 6:
				keepGoing = false;
			}// end chooseMenuOption method
		}
		kb.close();
	}

	public void displayFleet() {
		for (int i = 0; i < h.getJets().length; i++) {
				System.out.println(h.getJets()[i]);
		}
	}

	public void addJet() {
		System.out.print("Model: ");
		String model = kb.next();
		System.out.print("Pilot: ");
		String pilot = kb.next();
		System.out.print("Speed in mph: ");
		int mphSpeed = kb.nextInt();
		System.out.print("range: ");
		int range = kb.nextInt();
		System.out.print("Price: ");
		Double price = kb.nextDouble();

		Jet jet = new Jet(model, pilot, mphSpeed, range, price);
		h.addJet(jet);

		// ask user for input
		// create a new Jet passing fields into constructor
		// h.addjet(newJet);
	}

}
