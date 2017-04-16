package Jets;

public class Hangar {

	public Jet [] jetList() {

		PilotDorm d = new PilotDorm();
	
		Pilot pilot [] = d.pilotList();
		
		Jet[] jet = new Jet[5];
		jet[0] = new Jet("A340", pilot[0].getName(), 567, 7800, 87000000.0);
		jet[1] = new Jet("747-8", pilot[1].getName(), 614, 8000, 357000000);
		jet[2] = new Jet("777-8",pilot[2].getName(), 590, 8500, 320000000);
		jet[3] = new Jet("A380",pilot[3].getName(), 634, 9400, 432000000);
		jet[4] = new Jet("787", pilot[4].getName(), 593, 9300, 146000000);
		return jet;
	}
	

}
