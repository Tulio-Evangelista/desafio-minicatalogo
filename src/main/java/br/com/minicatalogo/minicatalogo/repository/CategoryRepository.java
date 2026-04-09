package br.com.minicatalogo.minicatalogo.repository;

import br.com.minicatalogo.minicatalogo.model.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryModel, Long> {


}
