import java.util.*;
public class InsertArray{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int[] arr=new int[100];
System.out.println("enter the number of elements");
int n=scan.nextInt();
for(int i=0;i<n;i++){
arr[i]=scan.nextInt();
}

System.out.println("Enter the insert array element is:");
int insert=scan.nextInt();
System.out.println("Enter the position array element is:");
int pos=scan.nextInt();

for(int i=n;i>pos;i--){
arr[i]=arr[i-1];
}
arr[pos]=insert;
n++;
for(int i=0;i<n;i++){
 System.out.print(arr[i] + " ");
}
}
}