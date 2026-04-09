package br.com.minicatalogo.minicatalogo.controller;


import br.com.minicatalogo.minicatalogo.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {


    ProductService productService;

        public ProductController(ProductService productService) {
            this.productService = productService;
        }


    @PostMapping("/create")
    public String createProduct(@RequestBody String product) {
        return "Produto criado com sucesso!";
    }

}
