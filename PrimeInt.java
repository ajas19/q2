import java.rmi.*;

interface PrimeInt extends Remote {

	public String findNum(int num) throws RemoteException;
	
}