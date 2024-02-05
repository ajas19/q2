import java.rmi.*;
import java.rmi.server.*;

class Imp extends UnicastRemoteObject implements Int {
	Imp() throws RemoteException{
		super();
	}
	public String dToO(int num) throws RemoteException{
		String result=Integer.toOctalString(num);

		return result;

	}
	public String oToD(int num) throws RemoteException{
		String result=Integer.toString(num);
		int temp=Integer.parseInt(result,8);
		result=Integer.toString(temp);
		return result;
	}
	public String dToB(int num) throws RemoteException
	{
		String result=Integer.toBinaryString(num);
		return result;
	}
	public int bToD(int num) throws RemoteException
	{
		String temp=Integer.toString(num);
		int result=Integer.parseInt(temp,2);

		return result;
	}
}
	
