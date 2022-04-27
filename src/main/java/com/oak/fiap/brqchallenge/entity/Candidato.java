package com.oak.fiap.brqchallenge.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "T_CANDIDATO")
public class Candidato {

    @Id
    @SequenceGenerator(name = "candidato", sequenceName = "seq_candidato")
    @GeneratedValue(generator = "candidato", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;
    private String email;
    private String telefone;
    private char genero;
    private Date dtNascimento;

    private Set<Skill> skills = new HashSet<>();
    private Set<Certificacao> certificacoes = new HashSet<>();
    public Candidato() {
    }
    public Candidato(Long id, String nome, String email, String telefone, char genero, Date dtNascimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.genero = genero;
        this.dtNascimento = dtNascimento;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public Date getDtNascimento() {
        return dtNascimento;
    }
    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
    public Set<Skill> getSkills() {
        return skills;
    }
    public Set<Certificacao> getCertificacoes() {
        return certificacoes;
    }
}
