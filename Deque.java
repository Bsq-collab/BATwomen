public interface Deque<T> {
    
    //adds an enQVal to the front of the deque
    public void addFirst( T enQVal ) ;

    //adds an enQVal to the end of the deque
    public void addLast( T enQVal ) ;

    //removes and returns the first value of the deque
    public T removeFirst() ;

    //removes and returns the last value of the deque
    public T removeLast() ;

    //retrieves the first value of the deque but doesn't remove it
    public T peekFirst() ;

    //retrieves the last value of the deque but doesn't remove it
    public T peekLast() ;

    //returns true if there are elements in the deque
    //returns false otherwise
    public boolean isEmpty();
    
}
