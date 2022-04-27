package com.oak.fiap.brqchallenge.resource;

import com.oak.fiap.brqchallenge.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skills")
public class SkillResource {

    @Autowired
    SkillRepository repository;
}
