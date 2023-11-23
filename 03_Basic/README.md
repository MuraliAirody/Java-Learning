# Call By Value

### check the change value code

The array arr will be printed as [99, 3, 2, 45, 6].
This is because arrays in Java are objects.
When you pass an array to a method, the reference to the array is passed. 
So, any changes made inside the method will affect the original array.

The integer b will be printed as 55.
This is because Java is pass-by-value.
When you pass a variable to a method, a new copy of the variable is created in the method stack frame. 
So, any changes made inside the method will not affect the original variable.


String is an immutable object, which means once a String object is created, it cannot be changed. 
When you pass a String to a method, you are actually passing the reference of the object. However, when you try to change the value of the String inside the method, 
a new String object is created in the memory because of its immutability, and the original String object remains unchanged.

In your code, when you pass str to the change method and try to change its value to “Hi”,
a new String object “Hi” is created in the memory.
The reference str inside the change method now points to the new String object “Hi”, but the original String object “hello” remains unchanged. 
That’s why when you print str in the main method, it still prints “hello”.

# Scope
**refer the Shadowing class**

# Variable length Arguments
**refer the VarArgs Class**