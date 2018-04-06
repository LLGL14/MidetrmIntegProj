package server;

import common.*;

import java.rmi.*;
import java.util.*;
import java.rmi.server.*;

public class MessageServerImpl extends UnicastRemoteObject implements MessageServer{
	private Map<String, MessageCallback> cb = new Hashtable<>();

	public MessageServerImpl() throwsRemoteException{
	}

	public void login(NessageCallback mc) throws RemoteException, UserExistsExxception, AlreadyLoggedInException, NotLoggedInException;

		User u = mc.getUser();
		if(cb.containsValue(mc)){
			throw new AlreadyLoggedInException();
		}else if (cb.containsKey(u.getName())){
			throw new UserExistsException();
		}else{
			cb.put(u.getName(),mc);
			System.out.println("login: "+u.getName());
			System.out.println("online: [");

			for(String name:cb.keySet()){
				System.out.print(name+" ");

				cb.get(name).loginCall(u);
			}
			System.out.println("]");
		}
}

public void input(MessageCallback mc) throws RemoteException, NotLoggedInException