package Jets;

public class JetsTester {

	public static void main(String[] args) {
		
		
		start();
	}
	public static void start() {
		
		menuDisplay m = new menuDisplay();
		m.menu();
		InputManager input =  new InputManager();
		input.chooseMenuOption();
	}
	

}
