package br.com.minicatalogo.minicatalogo.service;

import br.com.minicatalogo.minicatalogo.model.ProductModel;
import br.com.minicatalogo.minicatalogo.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    ProductRepository productRepository;

        public ProductService(ProductRepository productRepository) {
            this.productRepository = productRepository;
        }

    public ProductModel createProduct(ProductModel product) {

        return productRepository.save(product);
    }

    public ProductModel findAllProducts() {
        return (ProductModel) productRepository.findAll();
    }

    public ProductModel updateProduct(ProductModel product) {
         if (productRepository.existsById(product.getId())) {
            return productRepository.save(product);
    }else {
            throw new RuntimeException("Produto não encontrado");
        }
    }


    public ProductModel deleteProduct(Long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return null;
        }else {
            throw new RuntimeException("Produto não encontrado");
        }
    }

}
