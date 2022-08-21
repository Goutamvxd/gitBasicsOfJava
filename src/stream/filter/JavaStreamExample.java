package stream.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> productList=new ArrayList<>();
        productList.add(new Product(1,"Hp laptop",25000f));
        productList.add(new Product(2,"Dell laptop",35000f));
        productList.add(new Product(3,"Apple laptop",75000f));
        productList.add(new Product(4,"Mi laptop",45000f));

        List<Float>productPriceList2=productList.stream().filter(p->p.price>30000).
                map(p->p.price).
                collect(Collectors.toList());
        System.out.println(productPriceList2);
    }
}
