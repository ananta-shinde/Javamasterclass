package billdesk.app.product;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ProductManager {
    private ArrayList<Product> productList;

    public ProductManager()
    {

        this.productList = new ArrayList<Product>();
    }

    public int getProductCount()
    {
        return this.productList.size();
    }
    public void addProduct(String name)
    {
        Product newProduct = new Product(this.getProductCount()+1,name);
        productList.add(newProduct);
    }
    public void addProduct(String name,float price)
    {
        Product newProduct = new Product(this.getProductCount()+1,name);
        newProduct.setPrice(price);
        productList.add(newProduct);
    }

    public Product getProductById(int id) {
        Iterator<Product> itr = productList.iterator();
        Product result = null;
        while (itr.hasNext())
        {
             Product p = itr.next();
            if(itr.next().getId() == id){
                 result = p;
                 return result;
            }
        }
        return result;
    }

    public void updateProduct(int id,float price) {
          Product updatableProduct = this.getProductById(id);
          updatableProduct.setPrice(price);
    }

    public void updateProduct(int id,String name) {
        Product updatableProduct = this.getProductById(id);
        updatableProduct.setName(name);
    }

    public int deleteProductById(int id) {
        Iterator<Product> itr = productList.iterator();
        while (itr.hasNext())
        {
            Product p = itr.next();
            if(p.getId() == id){
                productList.remove(p);
                return 1;
            }
        }
        return -1;
    }

    public ArrayList<Product> searchProducts(String searchtext)
    {
        ArrayList<Product> result = new ArrayList<Product>();
        Iterator<Product> itr = productList.iterator();
        while (itr.hasNext()) {
            Product p = itr.next();
            if(p.getName().contains(searchtext))
            {
                result.add(p);
            }
        }
        return result;
    }
}
