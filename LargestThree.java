import java.util.*;
public class LargestThree{
public static void main(String args[]){
int a=90;
int b=100;
int c=89;
if(a>b && a>c)
{
int largest =a;
System.out.println("largest values is:"+largest);
}
else if(b>a && b>c){
int largest =b;
System.out.println("largest values is:"+largest);

}
else{
int largest =c;
System.out.println("largest values is:"+largest);
}
}
}