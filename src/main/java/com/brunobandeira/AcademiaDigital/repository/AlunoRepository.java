package com.brunobandeira.AcademiaDigital.repository;

import com.brunobandeira.AcademiaDigital.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
