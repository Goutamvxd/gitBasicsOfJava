package stream.filter;

import java.util.ArrayList;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        List<Product> productList=new ArrayList<Product>();
        productList.add(new Product(1,"Hp Laptop",25000f));
        productList.add(new Product(2,"Dell Laptop",35000f));
        productList.add(new Product(3,"Asus Laptop",15000f));
        productList.add(new Product(4,"Apple Laptop",55000f));

        List<Float>productPricelist=new ArrayList<Float>();
        for (Product product:productList){
            if (product.price<30000){
                productPricelist.add(product.price);
            }
        }

        System.out.println(productPricelist);
    }
}
