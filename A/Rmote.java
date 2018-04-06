import java.rmi.Remote;

public interface Rmote extends Remote {
	public String createAccount(String name,String email, int contactNumber, String username, String password) throws Exception ;
}