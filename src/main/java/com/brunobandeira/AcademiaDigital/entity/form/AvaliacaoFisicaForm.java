package com.brunobandeira.AcademiaDigital.entity.form;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

    @Positive(message = "O id do aluno precisa ser positivo")
    private Long alunoId;

    @NotNull(message = "Preencha o campo corretamente")
    @Positive(message = "'${validatedValue}' precisa ser positivo")
    private double peso;

    @NotNull(message = "Preencha o campo corretamente")
    @Positive(message = "'${validatedValue}' precisa ser positivo")
    @DecimalMin(value = "80", message = "'${validatedValue}' precisa ser no mínimo {value}")
    private double altura;

    public Long getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Long alunoId) {
        this.alunoId = alunoId;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
