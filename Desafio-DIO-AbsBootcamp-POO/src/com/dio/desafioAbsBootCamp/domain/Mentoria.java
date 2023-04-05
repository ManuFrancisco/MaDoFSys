package com.dio.desafioAbsBootCamp.domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

private LocalDate data;

public Mentoria() { }

    @Override
    public double calcularXp() {
        return xp_padrao + 20;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "título = '" + getTitulo() + '\'' +
                ", descrição = '" + getDescricao() + '\'' +
                ", data = " + data +
                '}';
    }


}
