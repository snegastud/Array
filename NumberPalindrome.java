import java.util.*;
public class NumberPalindrome{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int num=scan.nextInt(); //121
int orginal=num;
int reverse =0;
while(num!=0){
int digit=num%10 ; //1  //2
 reverse =reverse*10+digit;// 0*10+1=1 // 1*10+2=10=2=12 
 num=num/10; 121/10 =12
}
if(orginal== reverse){
System.out.println("The number is palindrome");
}
else{
System.out.println("The number is not palindrome");
}
}
}