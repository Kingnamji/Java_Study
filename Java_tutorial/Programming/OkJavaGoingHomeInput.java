import javax.swing.JOptionPane;

import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.DimmingLights;

public class OkJavaGoingHomeInput {

	public static void main(String[] args) {
		
		String address = JOptionPane.showInputDialog("Enter a address");
		String bright = JOptionPane.showInputDialog("Enter a bright level");
		
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
		
		DimmingLights moodLamp = new DimmingLights(address + " moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();

	}

}
