import java.rmi.*;

public class Interface extends Remote{
	public void startServer(Interface admin) throws RemoteException;
	public void stopServer() throws RemoteException;
	public void registerUser() throws RemoteException;
	public void viewProjectList() throws RemoteException;
	public void createProject() throws RemoteException;
	public void upload() throws RemoteException;
}