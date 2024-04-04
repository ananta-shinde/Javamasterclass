package package1.inteface.demo;

public abstract class FourWheeler implements Vehicle {
    @Override
    public void start_engine() {
        System.out.println("started by self");
    }

    @Override
        public void change_speed() {
            System.out.println("change gear for high speed");
        }


    @Override
    public void open_window() {
        System.out.println("windows are opned");
    }
}
