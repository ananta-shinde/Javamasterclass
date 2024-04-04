package package1;
import package2.*;
public class MyFirstJavaApp {
    public static void main(String[] args) {

      Counter mycounter = new Counter();
      mycounter.increment();
//      mycounter.decrement();
      mycounter.reset();
      mycounter.increment();

    }
}
