package common;

import java.rmi.*;

public interface MessageServer extends Remote{

	public void login(MessageCallback mc) throws RemoteException, UserExistsException, AlreadyLoggedInException;

	public void broadcast (MessageCallback mc, String msg) throws RemoteException, NotLoggedInException;

	public void logout (MessageCallback mc) throws RemoteException, NotLoggedInException;
}