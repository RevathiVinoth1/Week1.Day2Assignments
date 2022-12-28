package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		int num=34343;
		int rev=0;
		int t,temp=0;
		temp=num;
		while(num>0)
		{
			t=num%10;
			rev=(rev%10)+t;
			num=num/10;
		}
		if(rev==temp)
		{		
				System.out.println("The Given Number is a Palindrome");
			}
			else {
				System.out.println("The Given Number is Not a Palindrome");
			}
		}
	}

