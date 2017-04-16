package Jets;

public class JetsTester {

	public static void main(String[] args) {
		JetsTester jt = new JetsTester();
		jt.start();
	}

	public void start() {

		menuDisplay m = new menuDisplay();
		m.menu();
		Hangar hangar = new Hangar();
		Jet[] jets = jetList();
		hangar.setJets(jets);
		InputManager input = new InputManager();
		input.chooseMenuOption(hangar);
	}

	public Jet[] jetList() {

		PilotDorm d = new PilotDorm();

		Pilot pilot[] = d.pilotList();

		Jet[] jet = new Jet[5];
		jet[0] = new Jet("A340", pilot[0].getName(), 567, 7800, 87_000_000.0);
		jet[1] = new Jet("747-8", pilot[1].getName(), 614, 8000, 357_000_000.0);
		jet[2] = new Jet("777-8", pilot[2].getName(), 590, 8500, 320_000_000.0);
		jet[3] = new Jet("A380", pilot[3].getName(), 634, 9300, 432_000_000.0);
		jet[4] = new Jet("787", pilot[4].getName(), 593, 9400, 146_000_000.0);
		return jet;
	}

}
