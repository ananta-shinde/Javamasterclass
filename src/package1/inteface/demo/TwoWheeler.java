package package1.inteface.demo;

abstract public  class TwoWheeler implements Vehicle {

    @Override
    public void start_engine() {
        System.out.println("Staring engine by kick");
    }

    @Override
    public void change_speed() {
        System.out.println("change gear for high speed");
    }

    @Override
    public void open_window() {
        System.out.println("not supported");
    }
}
