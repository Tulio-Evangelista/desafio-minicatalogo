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
            ProductModel produtoCriado = productService.createProduct(productModel);
            return ResponseEntity.status(HttpStatus.CREATED).body("Produto criado com sucesso: " + produtoCriado.getNome());


        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable Long id ,@RequestBody ProductModel productModel) {
        {
                productModel.setId(id);
                ProductModel produtoAtualizado = productService.updateProduct(productModel);
            return ResponseEntity.status(HttpStatus.OK).body("Produto atualizado com sucesso: ");

        }
    }

    @GetMapping("/buscar")
    public ResponseEntity<String> getAllProducts() {
        {
            ProductModel produtosEncontrados = productService.findAllProducts();
            return ResponseEntity.status(HttpStatus.OK).body("Produtos encontrados: " + produtosEncontrados);

        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
        {
            ProductModel produtoDeletado =productService.deleteProduct(id);
            return ResponseEntity.status(HttpStatus.OK).body("Produto deletado com sucesso: ");

        }
    }




}
