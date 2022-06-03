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