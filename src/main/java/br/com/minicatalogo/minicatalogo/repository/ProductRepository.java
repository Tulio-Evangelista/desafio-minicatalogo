package br.com.minicatalogo.minicatalogo.repository;

import br.com.minicatalogo.minicatalogo.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {


    public ProductModel save(ProductModel productModel);

    public void deleteById(Long id);

    List<ProductModel> findAll();

}
