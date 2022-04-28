package com.oak.fiap.brqchallenge.resource;

import com.oak.fiap.brqchallenge.entity.Skill;
import com.oak.fiap.brqchallenge.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillResource {

    @Autowired
    SkillRepository repository;

    @GetMapping
    public ResponseEntity<List<Skill>> findAll() {
        return ResponseEntity.ok().body(repository.findAll());
    }
    @GetMapping("/findByNome/{nome}")
    public ResponseEntity<List<Skill>> findByNome(@PathVariable("nome") String nome) {
        return ResponseEntity.ok().body(repository.findAllByNomeContainingIgnoreCase(nome));
    }

}
