import java.util.*;
import java.io.*;
public class Example{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
try{
int a=scan.nextInt();
int b=scan.nextInt();
int c=a/b;

}
catch(ArithmeticException e){
System.out.println(e);
}
catch(InputMismatchException e){
System.out.println(e);
}

}
}