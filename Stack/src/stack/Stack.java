package stack;

import java.util.Scanner;

public class Stack {
	private int size;
	private int[] arr;
	private int top;
	
	public Stack() {
		size = 5;
		arr = new int[size];
		top=-1;
	}
	
	public Stack(int s) {
		size = s;
		arr = new int[s];
		top=-1;
	}
	
	public boolean isFull() {
		return top==size-1;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public void push(int val) throws Exception {
		if(!isFull())
			arr[++top] = val;
		else 
			throw new Exception("Overflow....!");
	}
	
	public int pop() throws Exception {
		if(!isEmpty())
			return arr[top--];
		else 
			throw new Exception("Underflow....!");
	}
	//5%2
	public static void main(String[] args) {
		Stack s1=new Stack(100);
		try(Scanner sc=new Scanner(System.in)) {
			System.out.println("Enter a Number: ");
			int num=sc.nextInt();
			for(int i = num ; num > 0 ; num/=2 ) {
				s1.push(num%2);
			}
			System.out.println("Enter a Number: ");
			while(!s1.isEmpty()) {
				System.out.print(s1.pop()+ " ");
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}