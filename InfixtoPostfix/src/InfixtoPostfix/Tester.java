package InfixtoPostfix;

import java.util.Scanner;

public class Tester {
	
	public static int findprecedence(char ch)
	{
		switch(ch)
		{
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		}
		return 0;
	}

	public static void main(String[] args) throws Exception {
		Stack s1=new Stack(100);
		Scanner sc=new Scanner(System.in);
		char [] infix=new char[100];
		
		char [] postfix=new char[100];
		System.out.println("Enter fully paranthesized infix expr");
		infix=(sc.next()).toCharArray();
		int i=0,j=0;
		char ch;
		for(char c:infix)
		{
			if(c=='(')
			{
				s1.push(c);
			}
			else if(c>='a' && c<='z')
			{
				postfix[j++]=c;
			}
			else if(c=='+' || c=='-' || c=='*' || c=='/')
			{
				while(s1.peep()=='+' || s1.peep()=='-' || s1.peep()=='*' || s1.peep()=='/')
				{
					if(findprecedence((char)s1.peep())>=findprecedence(c))
					{
						postfix[j++]=(char)s1.pop();
					}
					else
						break;
				}
				s1.push(c);
			}
			else if(c==')')
			{
				while((ch=(char)s1.pop())!='(')
				{
					postfix[j++]=ch;
				}
			}
			
		}
		//System.out.println("Postfix form of given infix: " + String.valueOf(postfix));
		if(postfix!=null) {
			System.out.println("Postfix form of given infix: " + String.valueOf(postfix));
		}
	}

}