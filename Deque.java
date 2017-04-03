public interface Deque<T> {
    
    public void addFirst( T enQVal ) ;
    public void addLast( T enQVal ) ; 
    public T removeFirst() ;
    public T removeLast() ;
    public T peekFirst() ;
    public T peekLast() ;
    public boolean isEmpty();
    
}
