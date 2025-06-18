import java.util.*;
public class Subraction{
public static void main(String args[]){
int[][] matrix1={{2,3,4},
{5,6,7},
{8,9,0}};
int[][] matrix2={{2,3,4},
{5,6,7},
{8,9,0}};
int[][] result =new int[3][3]; 
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
result[i][j]=matrix1[i][j]-matrix2[i][j];
}
}
System.out.println("Matrix Subraction:");
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
System.out.print(result[i][j]+" ");
}
System.out.println();
}
}
}