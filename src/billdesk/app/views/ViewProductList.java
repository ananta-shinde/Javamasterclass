package billdesk.app.views;

import billdesk.app.product.ProductManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewProductList extends JPanel implements ActionListener {
    JPanel p;
    JTextField productNameTextField;
    JTextField productPriceTextField;
    ProductManager pm;
    public ViewProductList(ProductManager pm){

        this.setLayout(null);
        this.pm = pm;

        productNameTextField = new JTextField();
        productNameTextField.setBounds(100,150,500,500);
        this.add(productNameTextField);
        this.setVisible(true);
        this.setBounds(100,100,500,500);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
