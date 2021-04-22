// 3. To learn use of single dimensional array by defining the array is dynamically.
import java.util.Scanner;

public class prog3 {
    public static void main(String args[]){
int a[]=new int[10],s;
        Scanner scan =new Scanner(System.in);
System.out.println("enter the size of array: ");
        s=scan.nextInt();
System.out.println("enter the elements of array: ");
        for(int i=0;i<s;i++){
            a[i]=scan.nextInt();

        }
     for(int x=0;x<s;x++){
           a[x]=a[x]+5;
        }
System.out.println("after adding 5 in each element: ");
        for(int j=0;j<s;j++){
System.out.print(a[j]+" ");
        }}}
