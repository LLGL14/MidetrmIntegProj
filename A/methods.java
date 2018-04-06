import java.rmi.server.UnicastRemoteObjec t;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class methods extends UnicastRemoteObject implements Rmote {
	public methods() throws Exception {
		super ();
	}
	public String createAccount(String name, String email, int contactNumber, String username, String password) throws Exception {
		File database = new File("accounts");
		PrintWriter pw = new PrintWriter(new FileWriter("account",true));
		pw.write(name+" ");
	    pw.write(email+" ");
	    pw.write(contactNumber + " ");
	    pw.write(username+ " ");
		pw.write(password+ "\n");
	   	return"you just created an account";
}

