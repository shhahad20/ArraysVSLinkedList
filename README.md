## Arrays vs Linked List in JAVA ☕  

Table of contents:
1. Memory Allocation
2. Insertion and Deletion
3. Random Access

<hr>

### Memory Allocation
#### Array:
In Java, arrays are allocated as a contiguous block of code. It is a data structure where we store similar elements. We can store only a fixed set of elements. This allows for fast access to elements using their indices.
<div width="40%">
<img src="assets\Arrays.png">
</div>

#### Linked List:
Linked List do not require contiguous memory allocation. Each eleemnt called a node, contains the data and a reference (link) to the next node. The node can be scattered or disordered across the memory.
<div width="40%">
<img src="assets\LinkedList.png">
</div>

<hr>

### Insertion and Deletion
#### Array:
We said that the array stored as a fixed set, so it doesn't grow its size at runtime that meand insertion and deletion operations in array can be costly. When an element is inserted or deleted, It's allocates a new bigger array (in case we inserted new element) or new smaller array (in case we deleted an element) in the memory.

``` 
int[] myArray = {1,2,3,4};
// Inserting 5 new element at index 1
// [1,2,3,4] -> [1,2,5,3,4] 
```

#### Linked List:
