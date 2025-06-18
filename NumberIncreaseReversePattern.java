import java.util.*;
public class NumberIncreaseReversePattern{
public static void PymaridReverse(int n){
for(int i=n;i>1;i--){
for(int j=1;j<i;j++){
System.out.print(j+" ");
}
System.out.println();
}

}
public static void main(String args[]){
int n=6;
PymaridReverse(6);
}
}