import java.util.*;
class oddeven
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int a=sc.nextInt();
if(a%2==0)
System.out.println("The number" +a+ "is even");
else
System.out.println("The number" +a+ " is odd");
}
}

