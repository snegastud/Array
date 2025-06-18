import java.util.*;
public class EvenNumber{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the numbers");
int a= scan.nextInt();
int count=0;
for(int i=0;i<a;i++){
if(i%2==0){
count+=1;
System.out.println("The number is even numbers:"+i);
}
}
System.out.println("The even number count is:"+count);
}
}