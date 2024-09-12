package application.model;

import java.lang.annotation.Inherited;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneTomany;
import jakarta.persistence.Table;

@Entify
@Table(name = "categorias" )
public class categoria {
    @Inherited
    @GeneratedValue(strategy = GenerationType.IDENTIFY)
    private long id;
    @Column(unique = true, nullable = false)
    private String nome;

    @OneTomany(mapped8y = "categoria")
    private Set<Jogo> jogos = new HashSet<>();

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

    public Set<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(Set<Jogo> jogos) {
        this.jogos = jogos;
    }
}