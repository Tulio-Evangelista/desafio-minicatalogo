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
        if (product.getPreco() == null || product.getPreco() <= 0) {
            throw new RuntimeException("Preço deve ser maior que zero");
        }
        return productRepository.save(product);
    }

    public ProductModel findAllProducts() {
        return (ProductModel) productRepository.findAll();
    }

    public ProductModel updateProduct(ProductModel product) {
        ProductModel existingId = productRepository.findById(product.getId())
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        existingId.setNome(product.getNome());
        existingId.setPreco(product.getPreco());
        return productRepository.save(existingId);
    }


    public ProductModel deleteProduct(Long id) {
        ProductModel product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        productRepository.deleteById(id);
        return product;
    }

}
