import java.util.*;
public class ArrayIndexPosition{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.println("Array values are:");
int[] arr={10,50,30,40,20};
int target=scan.nextInt();

int index=-1;
for(int i=0;i<arr.length;i++){
if(target== arr[i]){
index=i;
break;
}
}
if(index==-1){
System.out.println("The array not found in the given list");
}
else{
System.out.println("The array element position:"+index);
}
}
}