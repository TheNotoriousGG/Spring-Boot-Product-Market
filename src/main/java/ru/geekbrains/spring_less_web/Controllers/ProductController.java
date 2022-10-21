package ru.geekbrains.spring_less_web.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.spring_less_web.Model.Product;
import ru.geekbrains.spring_less_web.Service.ProductService;

import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductRepository(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("{id}")
    public Product findById(@PathVariable("id") long id){
       return productService.findById(id);
    }

    @GetMapping
    public List<Product> findAll(){
        return productService.findAll();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.save(product);
    }

    @GetMapping("delete/{id}")
    public void deleteById(@PathVariable("id") long id){
        productService.deleteById(id);
    }

}
