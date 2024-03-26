# ArrayList
### Advantages of Java ArrayList
- Dynamic size: ArrayList can dynamically grow and shrink in size, making it easy to add or remove - elements as needed.
- Easy to use: ArrayList is simple to use, making it a popular choice for many Java developers.
- Fast access: ArrayList provides fast access to elements, as it is implemented as an array under the hood.
- Ordered collection: ArrayList preserves the order of elements, allowing you to access elements in the order they were added.
Supports null values: ArrayList can store null values, making it useful in cases where the absence of a value needs to be represented.
### Disadvantages of Java ArrayList
- Slower than arrays: ArrayList is slower than arrays for certain operations, such as inserting elements in the middle of the list.
Increased memory usage: ArrayList requires more memory than arrays, as it needs to maintain its dynamic size and handle resizing.
- Not thread-safe: ArrayList is not thread-safe, meaning that multiple threads may access and modify the list concurrently, leading to potential race conditions and data corruption.
- Performance degradation: ArrayList’s performance may degrade as the number of elements in the list increases, especially for operations such as searching for elements or inserting elements in the middle of the list.
- In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
- We can not create an array list of the primitive types, such as int, float, char, etc. It is required to use the required wrapper class in such cases. For example:

# LinkedList

### Advantages of using LinkedList in Java:
- Dynamic size: As with Vector, the size of a LinkedList can grow or shrink dynamically, so you don’t have to worry about setting an initial size.
- Efficient Insertions and Deletions: LinkedList is an efficient data structure for inserting or deleting elements in the middle of the list because you only need to change the links between elements, rather than shifting all elements after the insertion or deletion point.
- Flexible Iteration: With a linked list, you can efficiently iterate through the list in either direction, since each element has a reference to both its predecessor and successor elements.
### Disadvantages of using LinkedList in Java:
- Performance: LinkedList has a slower performance than ArrayList when it comes to accessing individual elements. This is because you need to traverse the list to reach the desired element, whereas with ArrayList, you can simply access the desired element using an index.
- Memory overhead: LinkedList requires more memory than ArrayList because each element requires additional memory for the links to its predecessor and successor elements.

# Vector

### Advantages of using Vector in Java:
- Synchronization: As mentioned before, Vector is synchronized, making it safe to use in a multi-threaded environment.
Dynamic Size: The size of a Vector can grow or shrink dynamically as elements are added or removed, so you don’t have to worry about setting an initial size that will accommodate all elements.
- Legacy support: Vector has been part of Java since its inception and is still supported, so it’s a good option if you need to work with older Java code that uses Vector.
### Disadvantages of using Vector in Java:
- Performance: The synchronization in Vector can lead to slower performance compared to other collection classes, such as ArrayList.
Legacy Code: While Vector is still supported, newer Java code is often written using the more modern collection classes, so it may be harder to find examples and support for Vector.
- Unnecessary overhead: If you don’t need the synchronization features of Vector, using it will add unnecessary overhead to your code.

# HashSet

- HashSet stores the elements by using a mechanism called hashing.
- HashSet contains unique elements only.
- HashSet allows null value.
- HashSet class is non synchronized.
- HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
- HashSet is the best approach for search operations.
- The initial default capacity of HashSet is 16, and the load factor is 0.75.