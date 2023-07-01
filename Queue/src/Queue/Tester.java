package Queue;

public class Tester {
	
	public static void main(String[] args)throws Exception {
		Queue q=new Queue();
		q.addElement(1);
		q.addElement(2);
		q.addElement(3);
		q.addElement(4);
		
		System.out.println(q.removeElement());
		System.out.println(q.removeElement());
		System.out.println(q.removeElement());
		System.out.println(q.removeElement());
		
		
	}
	

}