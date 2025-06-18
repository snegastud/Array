import java.util.*;
public class ArraySortString{
public static void main(String args[]){

String[] s1={"banana","apple","mango","graps","orange","papaya"};
  System.out.println(" Before Sorting the Strings: " + Arrays.toString(s1));
for(int i=0;i<s1.length;i++){
for(int j=i+1;j<s1.length;j++){
if(s1[i].compareTo(s1[j])>0){
String temp=s1[i];
s1[i]= s1[j];
s1[j]= temp;

}

}
}
  System.out.println("After Sorting the Strings: " + Arrays.toString(s1));
    }
}
