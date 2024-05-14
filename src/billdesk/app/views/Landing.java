package billdesk.app.views;

import billdesk.app.product.ProductManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerListener;

public class Landing extends JFrame implements ActionListener {
    JFrame f;
    Container c;
    ProductManager pm;
    public Landing(ProductManager pm) {
        c = this.getContentPane();
        c.setLayout(null);
        this.pm = pm;
        setTitle("Billdesk | Home");
        setVisible(true);
        setBounds(200,200,1000,1000);

//        JButton addNewProductBtn = new JButton("Add New Product");
//        addNewProductBtn.setBounds(100,100,200,50);
//        JButton viewProductBtn = new JButton("View Products");
//        viewProductBtn.setBounds(100,150,200,50);
//
//        addNewProductBtn.addActionListener(this);
//        this.add(viewProductBtn);
//        this.add(addNewProductBtn);
         JMenu addProduct = new JMenu("Add New Product");
         JMenu viewProducts = new JMenu("View Products");
         JMenu viewBill = new JMenu("View bill");
         JMenuBar menubar = new JMenuBar();

         addProduct.addActionListener(this);
         menubar.add(addProduct);
         menubar.add(viewProducts);
         menubar.add(viewBill);

         AddNewProductForm addNewProductForm = new AddNewProductForm(pm);
         ViewProductList viewProductList = new ViewProductList(pm);
         this.setJMenuBar(menubar);
         this.add(addNewProductForm);
         this.add(viewProductList);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e);
        AddNewProductForm newProductForm = new AddNewProductForm(pm);
    }
}
