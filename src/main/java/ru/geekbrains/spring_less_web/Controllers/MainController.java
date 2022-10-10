package ru.geekbrains.spring_less_web.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.spring_less_web.Model.Product;
import ru.geekbrains.spring_less_web.Repository.ProductRepository;
import ru.geekbrains.spring_less_web.Service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/product")
public class MainController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductService service;

    @GetMapping("/findAll")
    public List<Product> findAll(){
        return productRepository.getAllProducts();
    }

    @GetMapping("/change_cost")
    public void changeCost(@RequestParam Long productId, @RequestParam Double delta){
        service.changeScore(productId, delta);
    }

    @PostMapping("/add")
    public void addProduct(@RequestBody Product product){
        productRepository.addProduct(product);
    }

    @DeleteMapping("/delete")
    public void deleteProduct(@RequestParam Long productId){
        productRepository.deleteProduct(
                productRepository.findById(productId)
        );
    }



}
