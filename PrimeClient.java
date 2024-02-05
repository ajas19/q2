import java.rmi.*;
import java.rmi.Naming;
import java.util.Scanner;

class PrimeClient{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try{
			PrimeInt obj=(PrimeInt) Naming.lookup("prime");
			System.out.println("Enter the num");
			int num=scan.nextInt();
			System.out.println(obj.findNum(num));
		}catch(Exception e)
		{
			System.out.println("Error: "+e);
		}
	}
	
}