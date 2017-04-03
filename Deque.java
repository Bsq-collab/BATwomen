public interface Deque<T> {
    
    //adds an enQVal to the front of the queue
    public void addFirst( T enQVal ) ;

    //adds an enQVal to the end of the queue
    public void addLast( T enQVal ) ;

    //removes and returns the first value of the queue
    public T removeFirst() ;

    //removes and returns the last value of the queue
    public T removeLast() ;

    //retrieves the first value of the queue but doesn't remove it
    public T peekFirst() ;

    //retrieves the last value of the queue but doesn't remove it
    public T peekLast() ;

    //returns true if there are elements in the queue
    //returns false otherwise
    public boolean isEmpty();
    
}
