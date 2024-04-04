package package1.inteface.demo;
import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String message = "2024/02/15";
        File fs = new File("mydata.txt");

        try{
            fs.createNewFile();
            BufferedReader bf = new BufferedReader(new FileReader("mydata.txt"));
            System.out.println(bf.lines());
            while(bf.lines().iterator().hasNext()){
                System.out.println(bf.lines().iterator().next());
            }
//            Scanner sc = new Scanner(fs);

        }
        catch (Exception e){

        }
        System.out.println(fs.getAbsolutePath());
    }
}
