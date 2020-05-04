package client;

import java.rmi.Remote;
import java.util.List;

public interface RMIClientIF extends Remote {

	public void updateSensorList(List<Sensor> senList);
	
}
