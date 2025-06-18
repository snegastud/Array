import java.util.*;
public class IsEquals{
public static void main(String args[]){
int[][] matrix1={{2,3,4},{5,6,7}};
int[][] matrix2={{2,3,4},{5,6,7}};
boolean isEqual=true;
if(matrix1.length !=matrix2.length && matrix1[0].length !=matrix1[0].length ){
isEqual=false;
}
else{
for(int i=0;i<matrix1.length;i++){
for(int j=0;j<matrix1[0].length;j++){
if(matrix1[i][j]!=matrix2[i][j]){
isEqual =false;
break;
}
}

if(!isEqual){
break;
}
}
}
if(isEqual){
System.out.println("The matrixs are equals:");
}
else{
System.out.println("The matrixs are not equals:");
}
}
}