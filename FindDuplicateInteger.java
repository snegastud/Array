import java.util.*;
public class FindDuplicateInteger{
public static void main(String args[]){
int[] arr={3,1,4,3,2,1,5,4};
System.out.println("Original Array Elements:");
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]+" ");
}
System.out.println("Duplicate Array Elements:");
for(int i=0;i<arr.length;i++){
for(int j=i+1;j<arr.length;j++){
if(arr[i]==arr[j]){
System.out.print(arr[i]+" ");
break;
}
}
}
}
}