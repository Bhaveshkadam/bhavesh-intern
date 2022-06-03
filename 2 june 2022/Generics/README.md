## Similar to the generics class, we can also create a method that can be used with any type of data.


### CODE
```
class Main {
  public static void main(String[] args) {

    GenDemo gen = new GenDemo();
    // with String
    gen.<String>genericsMethod("Java Programming");   
    // with integer
    gen.<Integer>genericsMethod(25);
  }
}
 class GenDemo {

  public <T> void genericsMethod(T data) {
    System.out.println("Generics Method:");
    System.out.println(data);
  }
}
```

### OUTPUT
```
Generics Method:
Java Programming
Generics Method:
25
```
