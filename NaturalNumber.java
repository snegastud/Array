import java.util.*;
public class NaturalNumber{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the natural numbers:");
int num=scan.nextInt();
int sum=0;
System.out.println("Natural numbers are:");
for(int i=1;i<=num;i++){

System.out.println(i+"");
sum=sum+i;

}
System.out.println("sum of natural numbers are:"+sum);
}
}