package com.flipperch.product_backend.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.flipperch.product_backend.models.Product;

@RestController
public class ProductController {

    private List<Product> products = Arrays.asList( 
        new Product(1, "Sample Product 1", "This is a sample product", 100.50,  true, true, 1),
        new Product(2, "Sample Product 2", "This is another sample product", 200.50,  false, true, 2),
        new Product(3, "Sample Product 3", "This is yet another sample product", 300.50, true, false, 3)
    );
    
    @GetMapping("products/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id) {
        Product product = products.stream()
                                    .filter(p -> p.getId() == id)
                                    .findFirst()
                                    .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product Not Found"));

        return ResponseEntity.ok(product);
    }
 
    @GetMapping("products")
    public List<Product> getProducts() {
        return products;
    }
}
