## Arrays vs Linked List in JAVA ☕  

Table of contents:
1. Overview 
2. Memory Allocation
3. Insertion and Deletion
4. Random Access
5. Usage
6. Memory Utilization

<hr>

### Overview:
#### Array:
Arrays are defined as the collection of similar types of data items stored at contiguous memory locations. It is one of the simplest data structures where each data element can be randomly accessed by using its index number.

#### Linked List:
Linked list can be defined as collection of objects called nodes that are randomly stored in the memory.
A node contains two fileds i.e data stored and the reference (link) which contains the address of the next node in the memory.

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

``` JAVA
int[] myArray = {1,2,3,4};
// Inserting 5 new element at index 1
// [1,2,3,4] -> [1,5,2,3,4] 
```

#### Linked List:
Elements in a Linked list are dependent on each other, as each node stores the address of its next node, So operations like insertion, deletion, .. etc, take less time than arrays. For example, to insert or delete an element, you simply update the references of the neighboring nodes.

``` JAVA
// Insertion at the beginning
Node newNode = new Node();
newNode.data = newValue;
newNode.next = head; // Update the reference to the current head
head = newNode; // Update the head to the new node
```

<hr>

### Random Access

#### Array:
Arrays provide efficient random access to elements using their indices.
- Access Operation |  Time Complexity = O(1)

``` JAVA
int[] array = {10, 22, 30, 45};
int element = array[1];  // Accessing element at index 1 (value: 22)
```

#### Linked List:
Random access is slower in linked lists compared to arrays because you have to traverse the list from the beginning to reach a specific element and that is time-consuming
- Access Operation |  Time Complexity = O(n)

``` JAVA
//Make head as the current node.
Node current = head;
    while (current != null) { // Run a loop until the current node is NULL because the last element points to NULL
    //Check if the key of the node is equal to item. If it the key matches the item,
    //return true otherwise return false
        if (current.data == key) {
            return true;
        }
        current = current.next;
    }
    return false;
```
<hr>

### Usage
#### Array:
- Arrays are used when we need random access to the elements.
- Arrays are used as the base of all sorting algorithms.
- If you have a Fixed-size collection where the number of the elements does not change.
- When the memory is a concern. Filled arrays take up less memory than linked lists.The array elements just contains the data, on the other hand, Each linked list node has the data as well as the refrence (link) to the other elements in the linked list.
- We also use it to implement various data structure like stacks, queues, and trees.
- We use it with matrices.
- Arrays are commonly used in low-level programming and for implementing data structures.

#### Linked List:
- If you have a Dynamic-size collection where collection needs to dynamically grow or shrink in size.
- If you frequently need to insert or delete elements in the middle or at the beginning of the collection.
- When you do not need random access.
- If we want more flexibility because each node can be allocated separately, allowing for efficient memory utilization and avoiding the need for contiguous memory.
- Linked lists are used for performing arithmetic operations on long integers.
- Can be used for the manipulation of polynomials.
- We also use it to implement various data structure like stacks, queues, and trees.
- Linked lists are often used for specific data management needs like task scheduling and memory allocation.

<hr>

### Memory Utilization
#### Array:

Memory utilization is ineffective in arrays. For example, if the array size is 5 and contains only 2 elements, the rest of the space will be wasted.

#### Linked List:
Memory utilization is effective, as it can be allocated or deallocated at the run time according to our requirements.