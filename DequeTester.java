public class DequeTester{
    public static void main( String[] args){
	DequeDLL<String> tester= new DequeDLL<String>();
	
	tester.addFirst("a");
	System.out.println(tester);
	tester.addFirst("b");
	System.out.println(tester);
	tester.addFirst("c");
	System.out.println(tester);
	tester.addLast("l1");
	System.out.println(tester);
	tester.addLast("l2");
	System.out.println(tester);
	tester.addLast("l3");
	System.out.println(tester);

	System.out.println("testing toString() now:");
	System.out.println(tester);
	System.out.println("testing removeLast() now:");
	System.out.println(tester.removeLast());
	System.out.println("testing toString() now:");
	System.out.println(tester);
	System.out.println("testing removeFirst() now:");
	System.out.println(tester.removeFirst());

	System.out.println("testing peekFirst() now:");
	System.out.println(tester.peekFirst());
	System.out.println("testing peekLast() now:");
	System.out.println(tester.peekLast());
    }
}
