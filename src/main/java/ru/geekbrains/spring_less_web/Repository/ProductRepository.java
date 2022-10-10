package ru.geekbrains.spring_less_web.Repository;

import org.springframework.stereotype.Component;
import ru.geekbrains.spring_less_web.Model.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {

    private List<Product> productList;

    @PostConstruct
    public void init(){
        productList = new ArrayList<>(Arrays.asList(
                new Product(1l, "IPhone", 80.5),
                new Product(2l, "IMac", 80.5),
                new Product(3l,"IPad", 80.5)

        ));
    }

    public List<Product> getAllProducts(){
        return Collections.unmodifiableList(productList);
    }

    public Product findById(Long id){
        return productList.stream().filter(c -> c.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public void add(Long id, String name, Double cost){
     productList.add(new Product(id, name, cost));
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void deleteProduct(Product product) {
        if (product != null)
        productList.remove(product);
    }
}
