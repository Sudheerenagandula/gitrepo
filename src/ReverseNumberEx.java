import java.util.Scanner;

public class ReverseNumberEx {
public long display(long no)
{
	long rev=0;
	while (no!=0) {
		long n=no%10;
		rev=(rev*10)+n;
		no=no/10;
		
	}
	return rev;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
long num;
Scanner sc=new Scanner (System.in);
System.out.println("Enter the number:");
num =sc.nextLong();
ReverseNumberEx revNum=new ReverseNumberEx();
long num2=revNum.display(num);
System.out.println("The reverse of the number is :"+num2);
	}

}
