package Jets;

public class PilotDorm {
	
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
