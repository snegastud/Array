import java.util.*;
public class EvenMultiple{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int[] arr=new int[a];
for(int i=0;i<arr.length;i++){
arr[i]=scan.nextInt();
}

System.out.println("enter the even numbers x and y:");

System.out.println("enter the even numbers x :");
int x=scan.nextInt();
System.out.println("enter the even numbers x :");
int y=scan.nextInt();

int num1=arr[x-1];
int num2=arr[y-1];

int product=num1*num2;
int result=product-1;
System.out.println("even number1:"+num1);
System.out.println("even number1:"+num2);
System.out.println("product of even number is:"+product);
System.out.println("product of even number is:"+result);

}
}