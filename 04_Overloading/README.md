# Method overloading

1. **Can we overload main method in java ?**
-  Apart from the fact that main() is just like any other method & can be overloaded in a similar manner, JVM always looks for the method signature to launch the program.

- The normal main method acts as an entry point for the JVM to start the execution of program.
We can overload the main method in Java. 
- But the program does’t execute the overloaded main method when we run your program, we need to call the overloaded main method from the actual main method only.

**Note**
##### Methods of a class said to be overloaded if

- Both declared in the same class, or
- Both inherited by a class, or
- One declared and one inherited**

##### check the below link
### [Method Overloading in different Class](https://www.geeksforgeeks.org/method-overloading-in-different-classes-in-java/?ref=ml_lbp)

When a child class has a method with the same name as a parent
class but with different arguments, it’s a form of method overloading. 
However, it’s important to note that the child class method does not override the parent class method, 
because the method signatures (method name + parameter types) are different.

Here’s an example:

```Java

class Parent {
void display() {
System.out.println("Display in Parent");
}
}

class Child extends Parent {
void display(int num) {
System.out.println("Display in Child: " + num);
}
}
```
In this case, Child class has overloaded the display method.
If you create an object of Child class, you can call both display() and display(int num) methods.

```Java

Child obj = new Child();
obj.display(); // calls Parent's display method
obj.display(5); // calls Child's display method

```


