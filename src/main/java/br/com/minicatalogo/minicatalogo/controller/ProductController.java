package br.com.minicatalogo.minicatalogo.controller;


import br.com.minicatalogo.minicatalogo.model.ProductModel;
import br.com.minicatalogo.minicatalogo.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {


    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @PostMapping("/create")
    public ResponseEntity<String> createProduct(@RequestBody ProductModel productModel) {
        {
            return ResponseEntity.status(HttpStatus.CREATED).body("Produto criado com sucesso: ");

        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable Long id ,@RequestBody ProductModel productModel) {
        {
            return ResponseEntity.status(HttpStatus.OK).body("Produto atualizado com sucesso: ");

        }
    }

    @GetMapping("/buscar")
    public ResponseEntity<String> getAllProducts() {
        {
            return ResponseEntity.status(HttpStatus.OK).body("Lista de produtos: ");

        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
        {
            return ResponseEntity.status(HttpStatus.OK).body("Produto deletado com sucesso: ");

        }
    }




}
