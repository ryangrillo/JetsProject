package Jets;

public class PilotDorm {
	private Pilot[] pilot;

	public Pilot[] getPilot() {
		return pilot;
	}

	public void setPilot(Pilot[] pilot) {
		this.pilot = pilot;
	}
	public void addPilot(Pilot p) {
		Pilot[] tempList = new Pilot[pilot.length + 1];
		for (int i = 0; i < pilot.length; i++) {
			tempList[i] = pilot[i];
		}
		tempList[tempList.length -1] = p;
		pilot = tempList;

	}
	
}
