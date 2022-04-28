package com.oak.fiap.brqchallenge.resource;

import com.oak.fiap.brqchallenge.entity.Certificacao;
import com.oak.fiap.brqchallenge.repository.CertificacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("certificacoes")
public class CertificacaoResource {

    @Autowired
    CertificacaoRepository repository;

    @GetMapping
    public ResponseEntity<List<Certificacao>> findAll(){
        return ResponseEntity.ok().body(repository.findAll());
    }

    @GetMapping("/findBy/{nome}")
    public ResponseEntity<List<Certificacao>> findByNome(@PathVariable("nome") String nome){
        return ResponseEntity.ok().body(repository.findAllByNomeContainingIgnoreCase(nome));
    }
}
