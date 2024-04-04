package package2;

import javax.swing.text.html.parser.Parser;

class MyFirstClass{

    public  int getCount() {
        return count;
    }

    public  void setCount(int count) {
        MyFirstClass.count = count;
    }

    private static  int count;
    private  int id;
    private  String name;
    private String email;
    private String password;

    public int getId() {
        return id;
    }

    protected void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
};

class MyChildClass extends MyFirstClass{

}

interface AnotherClass{

    public void getmessage();
}

class MySecondChildClass extends MyChildClass implements AnotherClass{

    @Override
    public void getmessage() {

    }
}

class MyGrandChild extends MySecondChildClass{

}


public class JavaApp {
    public static void main(String[] args) {
        MyFirstClass c1 = new MyFirstClass();
        MyChildClass child1 = new MyChildClass();
        MyChildClass child2 = new MyChildClass();
        MySecondChildClass child3 = new MySecondChildClass();

        child1.setId(100);
        child2.setId(20);
        child2.setName("Ananta");
//        MyFirstClass.count = 250;
        System.out.println(child3.getCount());

    }
}
