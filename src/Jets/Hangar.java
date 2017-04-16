package Jets;

public class Hangar {

	private Jet[] jets;

	public Jet[] getJets() {
		return jets;
	}

	public void setJets(Jet[] jets) {
		this.jets = jets;
	}

	public void addJet(Jet j) {
		Jet[] tempList = new Jet[jets.length + 1];
		for (int i = 0; i < jets.length; i++) {
			tempList[i] = jets[i];
		}
		tempList[tempList.length -1] = j;
		jets = tempList;

	}
	public Jet getFastest() {
		Jet fastest = jets[0];
		for (int i = 0; i < jets.length; i++) {
			//System.out.println(jets[i].getMphSpeed());
			if (jets[i].getMachSpeed() > fastest.getMachSpeed()) {
				fastest = jets[i];
			}
		}
		return fastest;
	}
	public Jet getlongestRange() {
		Jet longestRange = jets[0];
		for (int i = 0; i <jets.length; i++) {
			if (jets[i].getRange() > longestRange.getRange()) {
				longestRange = jets[i];
			}
		}
		return longestRange;
	}
	
}// ends jetlist

// ends class
