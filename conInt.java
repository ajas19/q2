import java.rmi.*;

interface Int extends Remote {
	public String dToO(int num) throws RemoteException;
	public String oToD(int num) throws RemoteException;
	public String dToB(int num) throws RemoteException;
	public int bToD(int num) throws RemoteException;
}