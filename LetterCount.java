import java.util.*;
public class LetterCount{
public static void main(String args[]){
String  name="py1234";
int count=0;
for(int i=0;i<name.length();i++){

char ch=name.charAt(i);
if((ch>='A' && ch<='Z') || (ch >='a' && ch <='z')){

count+=1;
}
}
System.out.println("Letter count in the given sentence:"+count);

}
}