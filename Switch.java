import java.util.*;
public class Switch{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the days");
String days=scan.nextLine();
switch(days){
case "monday":
System.out.println("Todays is:"+days);
break;
case "Tuesday":
System.out.println("Todays is:"+days);
break;
case "Wednesday":
System.out.println("Todays is:"+days);
break;
case "Thursday":
System.out.println("Todays is:"+days);
break;
case "Friday":
System.out.println("Todays is:"+days);
break;
case "Saturday":
System.out.println("Todays is:"+days);
break;
default:
System.out.println("invalid input");
}
}
}