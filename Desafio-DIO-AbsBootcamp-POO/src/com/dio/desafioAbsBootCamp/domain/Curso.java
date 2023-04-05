package com.dio.desafioAbsBootCamp.domain;

public class Curso extends Conteudo {

    int cargaHoraria;

    @Override
    public double calcularXp() {
        return xp_padrao * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo = '" + getTitulo() + '\'' +
                ", descrição = '" + getDescricao() + '\'' +
                ", cargaHoraria = " + cargaHoraria + " horas" +
                '}';
    }

}
