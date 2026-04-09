package br.com.minicatalogo.minicatalogo.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class ProductModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;


    private String nome;
    private Double preco;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private List<CategoryModel> categoryModels;


    public ProductModel() {
    }

    public ProductModel(long id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
