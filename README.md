# BATwomen

## Bayan Berri, Alison Lee, Truc Dao

### Method Selections
 

### Rationale 
Our team decided to use doubly-linked nodes because having it node-based will result in better runtimes. All node-based methods have a O(1) runtime. ArrayList-based methods, however, will vary between O(n) and O(1) runtimes.
 
Furthermore, using ArrayLists will consume more memory. When dequeueing, the _front or _end will simply shift. The dequeued element will be kept in memory. Whereas in a DLLNode-based Deque, the dequeued value will be eliminated through Java's "garbage collector."
