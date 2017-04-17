package Jets;

import java.util.Scanner;

public class InputManager {
	Hangar h;
	PilotDorm p;
	Scanner kb = new Scanner(System.in);

	public void chooseMenuOption(Hangar hangar, PilotDorm pilotDorm) {
		h = hangar;
		p = pilotDorm;

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
			case 5:
				addPilot();
				//listPilots();
				break;
			case 6:
				System.out.println("Goodbye");
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
		System.out.print("Pilot Name: ");
		String pilotName = kb.next();
		System.out.print("Pilot Salary: ");
		float pilotSalary = kb.nextFloat();
		System.out.print("Speed in mph: ");
		int mphSpeed = kb.nextInt();
		System.out.print("range: ");
		int range = kb.nextInt();
		System.out.print("Price: ");
		Double price = kb.nextDouble();

		Pilot p = new Pilot(pilotName, pilotSalary);
		Jet jet = new Jet(model, p, mphSpeed, range, price);
		h.addJet(jet);

		// ask user for input
		// create a new Jet passing fields into constructor
		// h.addjet(newJet);
	}
	public void addPilot() {
		System.out.print("Pilot Name: ");
		String pilotName = kb.next();
		System.out.print("Pilot Salary: ");
		float pilotSalary = kb.nextFloat();
		
		Pilot pilot = new Pilot(pilotName, pilotSalary);
		p.addPilot(pilot);
		
		// ask user for input
		// create a new Jet passing fields into constructor
		// h.addjet(newJet);
	}
	
	public void listPilots(){
		for (int i = 0; i < p.getPilot().length; i++) {
			System.out.println(p.getPilot()[i]);
	}
	}
	
	

}
