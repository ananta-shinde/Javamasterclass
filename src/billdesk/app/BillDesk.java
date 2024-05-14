package billdesk.app;

import billdesk.app.product.Product;
import billdesk.app.product.ProductManager;
import billdesk.app.views.Landing;
import com.sun.javafx.logging.JFRInputEvent;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class BillDesk {
    public static void main(String[] args) {
       ProductManager pManager = new ProductManager();
          Landing home = new Landing(pManager);
    }
}
