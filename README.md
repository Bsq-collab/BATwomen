# BATwomen

## Bayan Berri, Alison Lee, Truc Dao

### Method Selections
We have the methods: 
- public void addFirst( T enQVal ) 
- public void addLast( T enQVal ) 
- public T removeFirst() 
- public T removeLast() 
- public T peekFirst() 
- public T peekLast() 
- public boolean isEmpty()

Each method allows us to modify and access elements in the deque as needed. We are able to add onto the deque at the front and the back, as well as remove accordingly. This allows us to perform the actions that a deque performs. We also added methods to look at what element is at each end, which will help us in deciding what to remove or add when we check. Lastly, we have the isEmpty() method, which helps us when adding and removing to prevent errors from arising.
    

### Rationale 
Our team decided to use doubly-linked nodes because having it node-based will result in better runtimes. All node-based methods have a O(1) runtime. ArrayList-based methods, however, will vary between O(n) and O(1) runtimes.
 
Furthermore, using ArrayLists will consume more memory. When dequeueing, the _front or _end will simply shift. The dequeued element will be kept in memory. Whereas in a DLLNode-based Deque, the dequeued value will be eliminated through Java's "garbage collector."
