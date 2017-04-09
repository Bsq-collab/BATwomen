//Ibnul Jahan
//APCS2 pd1
//HW31 -- That We May All Relax Harder
//2017-04-08

public class DequeTester2{

    public static void main( String[] args ) 
    {

	
	DequeDLL<String> que = new DequeDLL<String>();
	
	//System.out.println("\nsize");
	//System.out.println(que.size());

	System.out.println("\nnow addFirst..."); 
	que.addFirst("1");
	que.addFirst("2");
	que.addFirst("3");
	System.out.println( que ); //for testing toString()...
	System.out.println("\npeeking first");
	System.out.println(que.peekFirst()); 
	System.out.println("\npeeking last"); 	
	System.out.println(que.peekLast()); 

	System.out.println("\nnow addLast..."); 
	que.addLast("4");
	que.addLast("5");
	que.addLast("6");
	System.out.println( que ); //for testing toString()...
	System.out.println("\npeeking first");
	System.out.println(que.peekFirst()); 
	System.out.println("\npeeking last"); 	
	System.out.println(que.peekLast()); 
	
	//System.out.println("\nsize");
	//System.out.println(que.size());

	System.out.println("\nnow testing toString()..."); 
	System.out.println( que ); //for testing toString()...


	System.out.println("\nnow removing first..."); 
	System.out.println( que.removeFirst() );
	System.out.println( que.removeFirst() );
	System.out.println( que.removeFirst() );
	
	System.out.println("\nnow testing toString()..."); 
	System.out.println( que ); //for testing toString()...

	System.out.println("\nnow removing last..."); 
	System.out.println( que.removeLast() );
	System.out.println( que.removeLast() );
	System.out.println( que.removeLast() );
	
	//System.out.println("\nsize");
	//System.out.println(que.size());

	System.out.println("\nDequeuing from empty queue should yield error..."); 
	System.out.println( que.removeFirst() );
	/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
	 ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

    }//end main

}
