import java.util.*;
public class NegativePositive{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number:");
int a=scan.nextInt();
if(a>0)
{
System.out.println("This is postive number");
}
else if(a<0){
System.out.println("This is negative numbers");
}
else{
System.out.println("the number is zero");
}

}
}