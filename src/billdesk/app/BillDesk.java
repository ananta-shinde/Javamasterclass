package billdesk.app;

import billdesk.app.product.Product;
import billdesk.app.product.ProductManager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class BillDesk {
    public static void main(String[] args) {
        System.out.println("welcome to BillDesk");
        ProductManager pm = new ProductManager();

//        pm.addProduct("Redmi 12",15000);
//        pm.addProduct("Redmi Note 12",20000);
//        pm.addProduct("One Plus Nord",20000);
//        pm.addProduct("Samsung Galexy 12",25000);
//        pm.addProduct("Samsung Galexy Note 5",25000);

        File database = new File("MyDatabase.txt");

        try{
            database.createNewFile();
            String data = "sample data";
            System.out.println(database.canWrite());
            BufferedWriter bfr = new BufferedWriter(new FileWriter(database));
            bfr.write(data);
        }catch (Exception e){
            System.out.println(e);
        }

        try{
            ArrayList<Product> updatedList = pm.searchProducts("Note");
            System.out.println(updatedList.size());
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
