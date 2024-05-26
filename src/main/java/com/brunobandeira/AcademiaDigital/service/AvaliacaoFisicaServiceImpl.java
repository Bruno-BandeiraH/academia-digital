package com.brunobandeira.AcademiaDigital.service;

import com.brunobandeira.AcademiaDigital.entity.Aluno;
import com.brunobandeira.AcademiaDigital.entity.AvaliacaoFisica;
import com.brunobandeira.AcademiaDigital.entity.form.AvaliacaoFisicaForm;
import com.brunobandeira.AcademiaDigital.entity.form.AvaliacaoFisicaUpdateForm;
import com.brunobandeira.AcademiaDigital.repository.AlunoRepository;
import com.brunobandeira.AcademiaDigital.repository.AvaliacaoFIsicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService{

    @Autowired
    private AvaliacaoFIsicaRepository avaliacaoFisicaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());

        return avaliacaoFisicaRepository.save(avaliacaoFisica);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return avaliacaoFisicaRepository.findAll();
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
