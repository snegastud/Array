import java.util.*;
public class ArraySort{
public static void main(String args[]){
int[] num={5,6,2,4,1};
System.out.println("Sort the numbers array:"+ Arrays.toString(num));
for(int i=0;i<num.length;i++){
for(int j=i+1;j<num.length;j++){
if(num[i]>num[j]){
int temp=num[i];
num[i]=num[j];
num[j]=temp;

}
}
}
System.out.println("Sort the numbers array:"+ Arrays.toString(num));
}
}