
import java.util.*;

class ArrayInput{

public static void main(String [] args){

int n;

Scanner sc = new Scanner(System.in);
System.out.println("size of array");
n=sc.nextInt();


int arr[] =new int[10];

System.out.println("enter the element of array");


for(int i=0;i<n;i++){

arr[i]=sc.nextInt();
}
System.out.println("array elements are");

for(int i=0;i<=n;i++){

System.out.println(arr[i]);

}
}



}