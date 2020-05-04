package client;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class RMIClient extends UnicastRemoteObject implements RMIClientIF{
	
	protected RMIClient() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}



	private List<Sensor> sensorsList;

	

	public void setSensorsList(List<Sensor> sensorsList) {
		this.sensorsList = sensorsList;
	}



	public void updateSensorList(List<Sensor> senList) {
		// TODO Auto-generated method stub
		
	}
	
	

}
