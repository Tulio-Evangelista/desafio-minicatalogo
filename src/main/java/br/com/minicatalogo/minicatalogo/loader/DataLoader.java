package br.com.minicatalogo.minicatalogo.loader;

import br.com.minicatalogo.minicatalogo.model.ProductModel;
import br.com.minicatalogo.minicatalogo.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {


    private final ProductRepository productRepository;

    public DataLoader(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public void run(String... args) throws Exception {
     productRepository.save(new ProductModel("Produto 1", 10.0));
     productRepository.save(new ProductModel("Produto 2", 20.0));
     productRepository.save(new ProductModel("Produto 3", 30.0));
    }
}
