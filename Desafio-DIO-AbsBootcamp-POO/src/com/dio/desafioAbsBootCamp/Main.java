package com.dio.desafioAbsBootCamp;

import com.dio.desafioAbsBootCamp.domain.BootCamp;
import com.dio.desafioAbsBootCamp.domain.Curso;
import com.dio.desafioAbsBootCamp.domain.Dev;
import com.dio.desafioAbsBootCamp.domain.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        var curso1 = new Curso();
        curso1.setTitulo("POO com JAVA");
        curso1.setDescricao("Intermediário");
        curso1.setCargaHoraria(8);

        var curso2 = new Curso();           // Declaração implícita de ' Curso curso2 '
        curso2.setTitulo("POO com JavaScript");
        curso2.setDescricao("Intermediário");
        curso2.setCargaHoraria(6);

        var mentoria = new Mentoria();       //Conteudo mentoria = new Mentoria(); // Polimorfismo

        mentoria.setTitulo("Dismistificando POO");
        mentoria.setDescricao("Importância da POO no mercado T.I");
        mentoria.setData(LocalDate.now());

       /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp - Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("----- Scott -----");
        Dev devScott = new Dev();
        devScott.setNome("Scott");
        devScott.inscreverBootCamp(bootcamp);
        devScott.progredir();
        devScott.progredir();
        devScott.progredir();
        System.out.println("Conteúdos inscritos por Scott "+ devScott.getConteudosInscritos());

        System.out.println(" ---» ");

        System.out.println("Conteúdos concluídos por Scott "+ devScott.getConteudosConcluidos());
        System.out.println("XP =» " + devScott.calcularTotalXp());

        System.out.println("----- Duanne -----");
        Dev devDuanne = new Dev();
        devDuanne.setNome("Duanne");
        devDuanne.inscreverBootCamp(bootcamp);
        devDuanne.progredir();
        devDuanne.progredir();
        System.out.println("Conteúdos inscritos por Duanne "+ devDuanne.getConteudosInscritos());

        System.out.println(" ---» ");

        System.out.println("Conteúdos concluídos por Duanne "+ devDuanne.getConteudosConcluidos());
        System.out.println("XP =» " + devDuanne.calcularTotalXp());



    }
}
