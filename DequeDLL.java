public class DequeDLL<T> implements Deque<T>{
    private DLLNode<T> _first;
    private DLLNode<T> _last;
    private int _size;

    //constructor creates an empty deque 
    public DequeDLL(){
	_first= new DLLNode<T>(null,null,null);
	_last=_first;
	_size=0;
    }

    //means of adding an element to collection:
    //Enqueue an element onto the front of this deque.
    public void addFirst( T enQVal ) {
	DLLNode<T> adding=new DLLNode<T>(enQVal,null,null);
	if(isEmpty()){
	    _last= adding;
	    _first=_last;
	}
	else{
	    adding.setNext(_first);
	    _first.setPrev(adding);
	    _first=adding;
	}
	_size++;
    }//ending addFirst()
    //O(1)
    
    //Enqueue an element onto the end of this deque.
    public void addLast( T enQVal ){
	DLLNode<T> adding=new DLLNode<T>(enQVal,null,null);
	if(isEmpty()){
	    _last= adding;
	    _first=_last;
	}
	else{
	    adding.setPrev(_last);
	    _last.setNext(adding);
	    _last=_last.getNext();
	}
	_size++;
    }//ending addLast()
    //O(1)

    //Dequeues and returns the first element of the deque.
    public T removeFirst(){
	if (isEmpty()) { return null; } 
	DLLNode<T> ret=_first;
	_first= _first.getNext();
	_first.setPrev(null);
	_size--;
	return ret.getCargo();
    }//ending removeFirst()
    //O(1)

    //Dequeues and returns the last element of the deque.
    public T removeLast() {
	if (isEmpty()) { return null; }
	DLLNode<T> ret=_last;
	_last=_last.getPrev();
	_last.setNext(null);
	_size--;
	return ret.getCargo();
    }//ending removeLast()
    //O(1)

    //means of viewing end elements of the deque
    //views first element
    public T peekFirst(){
	if( isEmpty()) {
		return null ;
	}
	return _first.getCargo();
    }//ending peekFirst()
    //O(1)

    //views last element
    public T peekLast() {
	if( isEmpty()) {
		return null ;
	}
	return _last.getCargo();
    }//ending peekLast()
    //O(1)

    //returns true if the deque is empty, false otherwise. 
    public boolean isEmpty(){
	return _size==0;
    }//ending isEmpty()
    //O(1)

    //prints each node of deque separated by spaces. 
    public String toString(){
	String ans="";
	DLLNode<T> p=_first;
	while(p!=null){
	    ans+= p.getCargo()+" ";
	    p=p.getNext();
	}
	return ans;
    }//ending toString()
    //O(n)

    public static void main(String[] args){
	DequeDLL<String> tester= new DequeDLL<String>();
	tester.addFirst("a");
	tester.addFirst("b");
	tester.addFirst("c");
	tester.addLast("l1");
	tester.addLast("l2");
	tester.addLast("l3");

	System.out.println("testing toString() now");
	System.out.println(tester);
	System.out.println("testing removeLast() now");
	System.out.println(tester.removeLast());
	System.out.println("testing toString() now");
	System.out.println(tester);
	System.out.println("testing removeFirst() now");
	System.out.println(tester.removeFirst());

	System.out.println("testing peekFirst() now");

	System.out.println(tester.peekFirst());
	System.out.println("testing peekLast() now");
	System.out.println(tester.peekLast());
/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
    }//ending main
}
