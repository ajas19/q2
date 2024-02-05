import java.rmi.Naming;

 class CalculatorServer{
 	public static void main(String[] args) {
 		try{
 			CalculatorImp ob = new CalculatorImp();
 			Naming.rebind("abc",ob);
 			System.out.println("server is initiated");

 		} catch (Exception e){
 			System.out.println("Error:"+e);

 		}
 	}
 }