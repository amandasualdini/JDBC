import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class chatServer {

	public ChatServer() throws RemoteException {
		try {
			LocateRegistry.createRegistry(8282);
			Naming.rebind("rmi://localhost:8282/chat", new ChatAula());
			System.out.println("Indo...");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws RemoteException {
		new ChatServer();
	}
}
