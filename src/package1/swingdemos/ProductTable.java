package package1.swingdemos;

import javax.swing.*;

public class ProductTable extends JFrame {

    JFrame f;

    ProductTable()
    {
        String data[][]={ {"101","Amit","670000"},
                {"102","Jai","780000"},
                {"101","Sachin","700000"}};
        String column[]={"ID","NAME","SALARY"};
        JTable dataTable = new JTable(data,column);
        JScrollPane sp=new JScrollPane(dataTable);
        add(sp);
        setTitle("Product List");
        setBounds(300,300,500,500);
        setVisible(true);
    }
}
