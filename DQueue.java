/*Team BATwomen -- Bayan Berri, Alison Lee, Truc Dao
  APCS2 pd4
  LAB02 -- All Hands on Deque!
  2017-04-04*/

import java.util.ArrayList;

public class DQueue<T> implements Deque<T>{

    private ArrayList<T> _queue;
    
    public DQueue(){
	_queue = new ArrayList();
    }

    public void enqueueFirst( T enQVal ){
	_queue.add( 0, enQVal );
    }

    public void enqueueLast( T enQVal ){
	_queue.add( enQVal );
    }

    public T dequeueFirst(){
	return _queue.remove(0);
    }

    public T dequeueLast(){
	return _queue.remove(_queue.size() - 1);
    }

    public T peekFirst(){
	return _queue.get(0);
    }

    public T peekLast(){
	return _queue.get(_queue.size() - 1);
    }
}
