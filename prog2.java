 // 2. To find the factorial of a given number.
import java.util.Scanner;
public class prog2 {

    public static void main(String args[]){
int fact=1,num;

        Scanner scan=new Scanner(System.in);
System.out.println("enter the number that yu want to factorial: ");
num=scan.nextInt();
        for(int i=1;i<=num;i++){
            fact*=i;
        }
System.out.println("factorial of number is: "+fact);
       }}
