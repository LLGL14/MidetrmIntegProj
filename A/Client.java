import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Registry regis = LocateRegistry.getRegistry("localhost",9090);

	}
}