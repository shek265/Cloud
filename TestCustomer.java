//package tester;
//import com.cdac.core.*;
import java.util.Scanner;

class TestCustomer
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Customer name : ");
String a=sc.next();
System.out.println("Enter Email id :");
String b=sc.next();
System.out.println("Enter age : ");
int c=sc.nextInt();
System.out.println("Enter CreditLimit : ");
double d=sc.nextDouble();

Customer cs=new Customer();
System.out.println(cs.getDetails());
cs.display();
Customer cs1=new Customer(a,b,c);
cs1.display();
//Customer cs2=new Customer(a,b,c,d)f
//cs2.Display();





}


}