/*3.To find the sum of any number of integers
interactively, enter every number from the
keyboard, whereas the total number of integers is
given as a command line argument .*/
import java.util.Scanner;
class prog7{
public static void main(String args[])
{
int num,sum=0,c;
Scanner scan =new Scanner(System.in);
do{
System.out.println("enter the number: ");
num=scan.nextInt();
sum+=num;
System.out.println("the sum of numbers is: "+sum);
System.out.println("do you want to continue this program: type 1");
c=scan.nextInt();
}while(c==1);}}