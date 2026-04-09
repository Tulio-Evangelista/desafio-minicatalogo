package br.com.minicatalogo.minicatalogo.repository;

import br.com.minicatalogo.minicatalogo.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {



}
