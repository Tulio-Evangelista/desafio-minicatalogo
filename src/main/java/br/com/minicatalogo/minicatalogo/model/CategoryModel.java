package br.com.minicatalogo.minicatalogo.model;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_category")
public class CategoryModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;

    @OneToMany(mappedBy = "categoria")
    private CategoryModel categoria;



    public CategoryModel() {
    }

    public CategoryModel(long id, String nome) {
        this.id = id;
        this.nome = nome;
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
