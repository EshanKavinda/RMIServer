package server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import client.RMIClientIF;

public interface RMIServerIF extends Remote {
	public void registerClientR(RMIClientIF client)  throws RemoteException;
	public List<Sensor> getSensorList()  throws RemoteException;
	public void broadcastChange()  throws RemoteException;

}
