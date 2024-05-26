package com.brunobandeira.AcademiaDigital.controller;

import com.brunobandeira.AcademiaDigital.entity.Matricula;
import com.brunobandeira.AcademiaDigital.entity.form.MatriculaForm;
import com.brunobandeira.AcademiaDigital.service.MatriculaServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
    private MatriculaServiceImpl service;

    public MatriculaController(MatriculaServiceImpl service) {
        this.service = service;
    }

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm form) {
        return service.create(form);
    }

    @GetMapping
    public List<Matricula> getAll(){
        return service.getAll();
    }
}
