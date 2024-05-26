package com.brunobandeira.AcademiaDigital.entity.form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class MatriculaForm {

    @NotNull(message = "Preencha o campo corretamente")
    @Positive(message = "O id do aluno precisa ser positivo")
    private Long alunoId;

    public Long getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Long alunoId) {
        this.alunoId = alunoId;
    }
}
