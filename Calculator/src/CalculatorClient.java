import java.rmi.Naming; 
import java.rmi.RemoteException; 
import java.net.MalformedURLException; 
import java.rmi.NotBoundException; 
import java.util.Scanner ;
 
public class CalculatorClient { 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        try { 
            Calculator c = (Calculator)
             Naming.lookup( "rmi://localhost/CalculatorService");
             System.out.println("ENter 2 no. : - ") ;
             int a = sc.nextInt();
             int b = sc.nextInt();
            System.out.println( c.sub(a, b) ); 
            System.out.println( c.add(4, 5) ); 
            System.out.println( c.mul(3, 6) ); 
            System.out.println( c.div(9, 3) ); 
        } 
        catch (MalformedURLException murle) { 
            System.out.println(); 
            System.out.println(
              "MalformedURLException"); 
            System.out.println(murle); 
        } 
        catch (RemoteException re) { 
            System.out.println(); 
            System.out.println("RemoteException"); 
            System.out.println(re); 
        } 
        catch (NotBoundException nbe) { 
            System.out.println(); 
            System.out.println( "NotBoundException"); 
            System.out.println(nbe); 
        } 
        catch (
            java.lang.ArithmeticException ae) { 
            System.out.println(); 
            System.out.println( "java.lang.ArithmeticException"); 
            System.out.println(ae); 
        } 
    } 
} 
