package br.com.alirismaurera.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularXp() {
        return 0;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria { " +
                "Titulo = " + getTitulo() +
                " || Descricao = " + getDescricao() +
                " || Data = " + data +
                " }";
    }
}
