package billdesk.app.views;

import billdesk.app.product.ProductManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddNewProductForm extends JPanel implements ActionListener {
    JPanel p;
    Container c;
    JTextField productNameTextField;
    JTextField productPriceTextField;
    ProductManager pm;
    public AddNewProductForm(ProductManager pm){

        this.setLayout(null);
        this.pm = pm;
        productNameTextField = new JTextField();
        productPriceTextField = new JTextField();
        JButton saveBtn = new JButton("Save Product");

        productNameTextField.setBounds(100,100,200,50);
        productPriceTextField.setBounds(100,150,200,50);
        saveBtn.setBounds(100,200,200,50);

        saveBtn.addActionListener(this);
        this.add(productNameTextField);
        this.add(productPriceTextField);
        this.add(saveBtn);
        this.setVisible(true);
        this.setBounds(100,100,500,500);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        pm.addProduct(productNameTextField.getText(),Float.parseFloat(productPriceTextField.getText()));
        System.out.println(pm.getProductCount());

    }
}
