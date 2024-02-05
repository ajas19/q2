import java.rmi.*;
import java.rmi.server.*;


class CalculatorImp extends UnicastRemoteObject implements Calculator{
	public CalculatorImp() throws RemoteException{
		super();
	}
	public int add(int a,int b) throws RemoteException{
		return a+b;
	}

	public int sub(int a,int b) throws RemoteException{
		return a-b;
	}

	public int mul(int a,int b) throws RemoteException{
		return a*b;
	}

	public int div(int a,int b) throws RemoteException{
		return a/b;
	}

}