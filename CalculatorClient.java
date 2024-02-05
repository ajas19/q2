import java.rmi.Naming;

 class CalculatorClient{
 	public static void main(String[] args) {
 		try{
 			Calculator a =(Calculator) Naming.lookup("abc");

 			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the 1st value");
			int a=sc.nextInt();
			System.out.println("Enter the 2nd value");
			int b=sc.nextInt();

 			System.out.println(a.add(a,b));
 			System.out.println(a.sub(a,b));
			System.out.println(a.mul(a,b));
			System.out.println(a.div(a,b));



 		} catch (Exception e){
 			System.out.println("Error:"+e);

 		}
 	}
 }