# Difference between String literal and Object

```java
  String a = new String("new"); //string object
  String b = new String("new"); //string object
  
  String c = "new" //string literal
```

In Java, when a String is created like String a = new String("new");, 
two objects are created (assuming no string pooling already exists for “new”):

One in the Heap Memory: This is a new String object that a points to.

One in the String Constant Pool: This is the pooled String object. 
The String Constant Pool is a part of Heap memory where JVM stores literal Strings.

However, the reference a does not point to the String in the pool. 
It points to the object in the heap. If another string is declared as String c = "new";,
b will point to the String in the pool, not a new object in the heap.

So, in summary, yes, “new” is created in the pool,
but a and b (from String a = new String("new"); 
and String b = new String("new");) are pointing to separate objects in the heap, not the pooled string.

# PlaceHolders
**There are many format specifiers we can use. Here are some common ones:**

- %c - Character
- %d - Decimal number (base 10)
- %e - Exponential floating-point number
- %f - Floating-point number
- %i - Integer (base 10)
- %o - Octal number (base 8)
- %s - String
- %u - Unsigned decimal (integer) number
- %x - Hexadecimal number (base 16)
- %t - Date/time
- %n - Newline
