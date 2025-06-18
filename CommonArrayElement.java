import java.util.*;
public class CommonArrayElement{
public static void main(String args[]){
int[] arr1={1,3,4,2,5,6,7,8};
int[] arr2={2,4,5,7,8,9,10,11,12};
System.out.println("Array Element1:"+Arrays.toString(arr1));
System.out.println("Array Element2:"+Arrays.toString(arr2));
System.out.println("Common Array Elements:");
for(int i=0;i<arr1.length;i++){
for(int j=0;j<arr2.length;j++){
if(arr1[i]==arr2[j]){
System.out.print(arr1[i]+ " ");
break; 
}
}
}

}
}