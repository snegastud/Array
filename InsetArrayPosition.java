import java.util.*;
public class InsertArray{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.println("Array elements are:");
int[] arr={1,2,4,5,6,7};
int insert=scan.nextInt();
for(int i=0;i<arr.length;i++){
System.out.println("Before array elements are:"+arr[i]);
}

arr[2]=insert;
for(int i=0;i<arr.length;i++){
System.out.println("After array elements are:"+arr[i]);
}

}
}