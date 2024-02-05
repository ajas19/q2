import java.rmi.*;
import java.rmi.server.*;

class PrimeImp extends UnicastRemoteObject implements PrimeInt{
	PrimeImp() throws RemoteException{
		super();
	}

	public String findNum(int num) throws RemoteException{
		for (int i=2;i<=num ;i++) {
			if (num%i==0 && i!=num) {
				return "is not a prime number";
			}
		}

		if (num==1) {
			return "is not a prime number";
		}
		else{
			return "is a prime number";
		}
	}
}