import java.util.*;
public class VowelsConsonantsCount{
public static void main(String args[]){
String s1="hello! how are you?";
String s2=s1.toLowerCase();
int vowel=0;
int consonant=0;
for(int i=0;i<s2.length();i++){
char ch=s2.charAt(i);
if(ch=='a' || ch=='e' ||ch=='i' || ch=='o'|| ch=='u'){
vowel++;
}
else{
if(ch>a && ch<z){
consonant++;
}
}
}
}
}