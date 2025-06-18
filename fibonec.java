import java.util.*;
public class fibonec{
public static  void main(String args[]){
int f1=0,f2=1;
for(int i=0;i<20;i++){
System.out.println("fibonecci series:"+f1);
int f3=f1+f2;
f1=f2;
f2=f3;
}

}
}