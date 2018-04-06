package common;

import java.rmi.*;

public interface MessageCallback extends Remote{

	public User getUser()throws RemoteException;

	public void loginCall(User w) throws RemoteException;

	public void broadcastCall(User w, String msg) throws RemoteException;

	public void logoutCall(User w) throws RemoteException;
}