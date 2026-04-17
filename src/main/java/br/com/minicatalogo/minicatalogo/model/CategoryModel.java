package br.com.minicatalogo.minicatalogo.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_category")
public class CategoryModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;

    @OneToMany(mappedBy = "category")
    private List<ProductModel> productModels;



    public CategoryModel() {
    }

    public CategoryModel(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public List<ProductModel> getProductModels() {
        return productModels;
    }

    public void setProductModels(List<ProductModel> productModels) {
        this.productModels = productModels;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
