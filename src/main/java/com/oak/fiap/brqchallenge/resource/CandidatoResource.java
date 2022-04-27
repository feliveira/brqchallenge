package com.oak.fiap.brqchallenge.resource;

import com.oak.fiap.brqchallenge.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidatos")
public class CandidatoResource {

    @Autowired
    CandidatoRepository repository;
}
