import java.rmi.*;
import java.rmi.Naming;

class PrimeServer {
	public static void main(String[] args) {
		try{
			Naming.rebind("prime",new PrimeImp());
			System.out.println("Server is running");
		}catch(Exception e)
		{
			System.out.println("Error: "+e);
		}

	}
	
}