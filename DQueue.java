/*Team BATwomen -- Bayan Berri, Alison Lee, Truc Dao
  APCS2 pd4
  LAB02 -- All Hands on Deque!
  2017-04-04*/

import java.util.ArrayList;

public class DQueue implements Deque<T>{

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
}
