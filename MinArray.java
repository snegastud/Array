import java.util.*;
public class MinArray{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the array element");
int n=scan.nextInt();
int[] arr=new int[n];
int m1=arr[0];
for(int i=0;i<arr.length;i++){
arr[i]=scan.nextInt();
}
for(int i=1;i<arr.length;i++){
if(arr[i]<m1){
m1=arr[i];
}
}
System.out.println("Max array elements is:"+m1);
}
} 