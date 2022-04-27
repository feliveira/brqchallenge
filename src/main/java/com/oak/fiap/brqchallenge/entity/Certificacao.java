package com.oak.fiap.brqchallenge.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_CERTIFICACAO")
public class Certificacao {

    @Id
    @SequenceGenerator(name = "certificacao", sequenceName = "seq_certificacao")
    @GeneratedValue(generator = "certificacao", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;
    private Skill tecnologia;

    public Certificacao() {
    }

    public Certificacao(Long id, String nome, Skill tecnologia) {
        this.id = id;
        this.nome = nome;
        this.tecnologia = tecnologia;
    }

    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Skill getTecnologia() {
        return tecnologia;
    }
    public void setTecnologia(Skill tecnologia) {
        this.tecnologia = tecnologia;
    }
}
