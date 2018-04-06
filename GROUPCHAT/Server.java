package server;

import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class Server{
	public static void main (String[]args){
		try{
			MessageServer server = new MessageServerImpl();
			Registry reg = LocateRegistry.createRegistry(1099);
			reg.rebind("msgserver",server);
			System.out.println("Message Server Running ......");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}