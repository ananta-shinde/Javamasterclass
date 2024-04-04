package package2;
public class MyCounterApp {

   protected int count;

   public MyCounterApp()
    {
        this.count = 0;
    }

    public void increment()
    {
        System.out.println("incremented value :"+ ++this.count);
    }

    public void decrement()
    {
        System.out.println("decremented value :"+ --this.count);
    }

}
