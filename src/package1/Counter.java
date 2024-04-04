package package1;
import package2.*;
public class Counter extends MyCounterApp {

    public void reset(){
        this.count = 0;
        System.out.println("counter has been reset to 0");
    }
}


