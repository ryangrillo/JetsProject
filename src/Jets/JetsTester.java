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
		PilotDorm d = new PilotDorm();		
		Pilot pilots[] = pilotList();
		d.setPilot(pilots);
		Jet[] jets = jetList(pilots);
		hangar.setJets(jets);
		InputManager input = new InputManager();
		input.chooseMenuOption(hangar, d);
	}

	public Jet[] jetList(Pilot[] pilots) {

		Jet[] jet = new Jet[5];
		jet[0] = new Jet("A340", pilots[0], 567, 7800, 87_000_000.0);
		jet[1] = new Jet("747-8", pilots[1], 614, 8000, 357_000_000.0);
		jet[2] = new Jet("777-8", pilots[2], 590, 8500, 320_000_000.0);
		jet[3] = new Jet("A380", pilots[3], 634, 9300, 432_000_000.0);
		jet[4] = new Jet("787", pilots[4], 593, 9400, 146_000_000.0);
		return jet;
	}

	public Pilot[] pilotList(){
		Pilot[] pilot = new Pilot[5];
		pilot[0] = new Pilot("Amelia Earhart", 64000);
		pilot[1] = new Pilot("Bessie Coleman", 35000);
		pilot[2] = new Pilot("Harriet Quimby", 67000);
		pilot[3] = new Pilot("Jacqueline Cochran", 82000);
		pilot[4] = new Pilot("Louise Thaden", 97000);
		
		return pilot;
	}
}
