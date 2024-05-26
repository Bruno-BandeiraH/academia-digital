package com.brunobandeira.AcademiaDigital.controller;

import com.brunobandeira.AcademiaDigital.entity.Aluno;
import com.brunobandeira.AcademiaDigital.entity.AvaliacaoFisica;
import com.brunobandeira.AcademiaDigital.entity.form.AlunoForm;
import com.brunobandeira.AcademiaDigital.service.AlunoServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @GetMapping
    public List<Aluno> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoForm form) {
        return service.create(form);
    }

    @GetMapping("avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id){
        return service.getlAllAvaliacaoFisicaId(id);
    }
}
