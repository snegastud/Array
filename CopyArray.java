import java.util.*;
public class CopyArray{
public static void main(String args[]){
int[] arr={1,2,3,4,5};
System.out.println("Array elements are:");
int[] copy=new int[arr.length];
for(int i=0;i<arr.length;i++){
copy[i]=arr[i];

}
System.out.println("copy the new Array elements:"+Arrays.toString(copy));

}
}