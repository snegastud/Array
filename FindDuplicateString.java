import java.util.*;
public class FindDuplicateString{
public static void main(String args[]){
String[] s1={"apple","banana","orange","apple","orange","mango"};
System.out.println("Original String:"+Arrays.toString(s1));
for(int i=0;i<s1.length;i++){
for(int j=i+1;j<s1.length;j++){
if(s1[i].equals(s1[j])){
System.out.println("Duplicate String:"+s1[i]);
break;
}
}
}
}
}