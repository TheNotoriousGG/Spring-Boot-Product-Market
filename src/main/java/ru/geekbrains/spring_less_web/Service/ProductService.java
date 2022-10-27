package ru.geekbrains.spring_less_web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrains.spring_less_web.Model.Product;
import ru.geekbrains.spring_less_web.Repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product findById(Long id){
        return productRepository.findById(id).orElseThrow();
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product save(Product product) {

        return productRepository.save(product);
    }

    public void deleteById(long id) {
        productRepository.deleteById(id);
    }
}
