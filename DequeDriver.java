/*
TheMarkering - Jack Cruse, Sasha Fomina, Daniel Ju
APCS2 pd4 
HW29 -- Stress is the Best 
2017-04-05
*/
import java.util.Iterator;

public class DequeDriver {
    public static void main(String [] args){
	
	//tests add() and poll()
	Deque<String> test = new DequeDLL<String>();
	//System.out.println("Upon initialization: size = " + test.size());

	/* Alternatively, addLast()
	System.out.println("\nTesting add()...");
	//adding elements until capacity of 5
	System.out.println("one: " + test.add("one"));
        System.out.println("two: " + test.add("two"));
	System.out.println("three: " + test.add("three"));
	System.out.println("four: " + test.add("four"));
	System.out.println("five: " + test.add("five"));
	System.out.println("six: " + test.add("six") + "-past capacity");
	*/

	System.out.println("\nTesting addLast()...");
	//adding elements until capacity of 5
	test.addLast("one");
        test.addLast("two");
	test.addLast("three");
	test.addLast("four");
	test.addLast("five");
        test.addLast("six");
	
	System.out.println("\nTesting toString()...");
	System.out.println(test);
	//	System.out.println("size = " + test.size());
	/*
	System.out.println("\nTesting contains()...");
	System.out.println(test.contains("one"));
	System.out.println(test.contains("two"));
	System.out.println(test.contains("three"));
	System.out.println(test.contains("four"));
	System.out.println(test.contains("five"));
	//"six" does not exist
	System.out.println(test.contains("six") + "- 'six' was never inserted");
	*/
	/* Alternatively test pollLast()
	System.out.println("\nTesting poll()...");
	//removes elements one by one
	System.out.println(test.poll());
	System.out.println(test.poll());
	System.out.println(test.poll());
	System.out.println(test.poll());
	System.out.println(test.poll());
	//polling an empty Dequeue
	System.out.println(test.poll() + "-list empty");
	*/

	System.out.println("\nTesting removeLast()...");
	System.out.println( test );
	//removes elements one by one
	test.removeLast();			   
	System.out.println(test);
        test.removeLast();
	System.out.println( test);
	test.removeLast() ;
	System.out.println(test);
	test.removeLast();
	//System.out.println(test.removeLast() + " - " + test);
	//removeLasting an empty Dequeue
	//System.out.println(test.removeLast() + "-list empty");
	
	System.out.println("\nEnd of test 1\n");

	//tests addFirst() and removeLast()
	Deque<String> test2 = new DequeDLL<String>();
	//System.out.println("Upon initialization: size = " + test2.size());

	System.out.println("\nTesting addLast()...");
	//adding elements until capacity of 5
	test.addLast("one");
        test.addLast("two");
	test.addLast("three");
	test.addLast("four");
	test.addLast("five");
        test.addLast("six");
	System.out.print("After addition " + test);
	/*
	System.out.println("\nTesting addFirst()...");
	System.out.println("one: " + test2.addFirst("one"));
        System.out.println("two: " + test2.addFirst("two"));
	System.out.println("three: " + test2.addFirst("three"));
	System.out.println("four: " + test2.addFirst("four"));
	System.out.println("five: " + test2.addFirst("five"));
	//should not work, as the Dequeue is to capacity
	System.out.println("six: " + test2.addFirst("six"));
	*/
	System.out.println("\nTesting toString()...");
	System.out.println(test2);
	//elements are backwards, as they were added to the front (stacky?)
	//	System.out.println("size = " + test2.size());
	/*
	System.out.println("\nTesting contains()...");
	System.out.println(test2.contains("one"));
	System.out.println(test2.contains("two"));
	System.out.println(test2.contains("three"));
	System.out.println(test2.contains("four"));
	System.out.println(test2.contains("five"));
	System.out.println(test2.contains("six") + "-never inserted 'six'");
	*/
	System.out.println("\nTesting removeLast()...");
	//"last" elements were actually the first to be inserted
	test2.removeLast();
	test2.removeLast();
	test2.removeLast();
	test2.removeLast();
	//System.out.println(test2.removeLast());
	//System.out.println(test2.removeLast() + "-past capacity");
	/*
	System.out.println("value added: " + test2.addLast( "to" ) );
	System.out.println("value added: " + test2.addFirst( "like" ) );
	System.out.println("value added: " + test2.addLast( "sleep" ) );
	System.out.println("value added: " + test2.addFirst( "I" ) );
	System.out.println( test2 );
	*/
	System.out.println("\nTesting removeFirst()...");
	System.out.println( test );
	//removes elements one by one
	/*
	System.out.println(test.removeFirst() + " - " + test);
	System.out.println(test.removeFirst() + " - " + test);
	System.out.println(test.removeFirst() + " - " + test);
	System.out.println(test.removeFirst() + " - " + test);
	//System.out.println(test.removeFirst() + " - " + test);
	//removeFirsting an empty Dequeue
	//System.out.println(test.removeFirst() + "-list empty");

	System.out.println("value added: " + test2.addLast( "to" ) );
	System.out.println("value added: " + test2.addFirst( "like" ) );
	System.out.println("value added: " + test2.addLast( "sleep" ) );
	System.out.println("value added: " + test2.addFirst( "I" ) );
	System.out.println( test2 );
	*/
	/*	
	Iterator<String> itr = test2.iterator();

	while ( itr.hasNext() )
	    {
		System.out.println( itr.next() );
	    }
	*/
	
    }//end main
}//end driver
