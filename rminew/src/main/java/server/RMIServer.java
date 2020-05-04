package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import client.RMIClientIF;
import server.RMIServerIF;

public class RMIServer extends UnicastRemoteObject implements RMIServerIF {
	
	
	private List<RMIClientIF> clientList;
	private List<Sensor> sensorList;
	
	public RMIServer() throws RemoteException {
		
		this.clientList = new ArrayList<RMIClientIF>();
		this.sensorList= new ArrayList<Sensor>();
		
		sensorList.add(new Sensor("Eshan", "12", "123", "12", "100"));
		
	}
	

	public void registerClientR(RMIClientIF client) {
		
	  this.clientList.add(client);
		
	}

	public List<Sensor> getSensorList() {
		// TODO Auto-generated method stub
		return null;
	}

	public void broadcastChange() {
		// TODO Auto-generated method stub
		
	}

	
	
}
