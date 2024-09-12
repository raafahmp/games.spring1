package application.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entify
@Table(name = "jogo" )
public class categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTIFY)
    private long id;
    @Column(nullable = true)
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "id_genero")
    private Categoria categoria;

    @ManyToMany
    @JoinTable(
        name = "jogo_possuem_plataformas",
        joinColumns = @JoinColumn(name = "id_jogo"),
        inverseJoinColumns = @JoinColumn(name = "id_plataofrma"))
    private Set<Plataforma> plataformas = new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Categoria getCategoria(){
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Set<Plataforma> getPlataforma() {
        return plataforma;
    }

    public void setPlataformas(Set<Plataforma> plataforma) {
        this.plataformas = plataformas;
    }
    
}