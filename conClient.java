import java.rmi.*;
import java.rmi.Naming;
import java.util.Scanner;

class Client{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	try{
		Int obj=(Int) Naming.lookup("num");
		System.out.println("1.decimal to Octal");
		System.out.println("2.Octal to decimal");
		System.out.println("3. Decimal to binary");
		System.out.println("4.Binary to decimal");

		int option;
		int num;
		System.out.println("Select Option:");
		option=scan.nextInt();
		switch(option)
		{
		case 1:
			System.out.println("enter thee number:");
			num=scan.nextInt();
			System.out.println(obj.dToO(num));
			break;
		case 2:
			System.out.println("enter thee number:");
			num=scan.nextInt();
			System.out.println(obj.oToD(num));
			break;
		case 3:
			System.out.println("enter thee number:");
			num=scan.nextInt();
			System.out.println(obj.dToB(num));
			break;
		case 4:
			System.out.println("enter thee number:");
			num=scan.nextInt();
			System.out.println(obj.bToD(num));
			break;
		default:
			System.out.println("invalid entry");
		}
		
		
	}catch(Exception e)
	{
		System.out.println(e);
	}
	}
	
}