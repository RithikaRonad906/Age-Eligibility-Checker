// import java.lang.*;
import java.util.*;
public class age
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
System.out.println("Enter age");
a=sc.nextInt();
if(a>=18)
{
System.out.println("age " +a+" is eligible to vote");
}
else
{
System.out.println("age "+a+" is not eligible to vote");
}
sc.close();
}
}