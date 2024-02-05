import java.rmi.*;
import java.rmi.Naming;

class Server {
	public static void main(String[] args) {
		try{
		Naming.rebind("num",new Imp());
		System.out.println("Server is running...");
	}catch(Exception e)
	{
		System.out.println(e);
	}
	}
	
}