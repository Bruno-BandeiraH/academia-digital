package com.brunobandeira.AcademiaDigital.service;

import com.brunobandeira.AcademiaDigital.entity.Aluno;
import com.brunobandeira.AcademiaDigital.entity.Matricula;
import com.brunobandeira.AcademiaDigital.entity.form.MatriculaForm;
import com.brunobandeira.AcademiaDigital.repository.AlunoRepository;
import com.brunobandeira.AcademiaDigital.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaForm form) {
        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
        matricula.setAluno(aluno);

        return matriculaRepository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return null;
    }

    @Override
    public List<Matricula> getAll() {
        return matriculaRepository.findAll();
    }

    @Override
    public void delete(Long id) {

    }
}
