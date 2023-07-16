/*The conditional operator is also known as ternary operator [exp ? true : false] can be used to make an either-or choice. 

Write a program to get a number from the user and find out whether it is odd or even.

Input format:

The input containing integer denotes the given number 

Output format:

If given number is even, print "Even". Otherwise, print "Odd".

Sample Input:
5

Sample Output:

Odd*/
package Jayasrijavapractice;
import java.util.Scanner;
public class ternaryoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 Scanner sc=new Scanner(System.in);
                 int number=sc.nextInt();
                 String output=(number%2==0)?"Even":"Odd";
                 System.out.println(output);
	}

}
