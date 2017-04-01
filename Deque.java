public interface Deque<T> {
    
    public void enqueueFirst( T enQVal ) ;
    public void enqueueLast( T enQVal ) ; 
    public T dequeueFirst() ;
    public T dequeueLast() ;
    public T peekFirst() ;
    public T peekLast() ;
    
}
