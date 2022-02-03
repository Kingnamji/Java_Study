import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OkJavaGoingHome {

	public static void main(String[] args) {
		
		String address = "JAVA APT 702";
		
		// Elevator call
		Elevator myElevator = new Elevator(address);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(address);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(address + " / Hall Lamp");
		Lighting floorLamp = new Lighting(address + " / Floor Lamp");
		hallLamp.on();
		floorLamp.on();

	}

}
