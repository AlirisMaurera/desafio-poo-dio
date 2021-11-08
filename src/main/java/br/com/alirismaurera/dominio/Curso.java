package br.com.alirismaurera.dominio;

public class Curso extends Conteudo {


   private int cargaHoraria;


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso { " +
                "Titulo = " + getTitulo() +
                " || Descricao = " + getDescricao() +
                " || Carga Horaria = " + cargaHoraria +
                " }";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO*cargaHoraria;
    }
}
