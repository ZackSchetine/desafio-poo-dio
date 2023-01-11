package dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\n\nMentoria: " +
                "\ntitulo: " + getTitulo() +
                "\ndescricao: " + getDescricao() +
                "\ndata: " + getData();
    }

    @Override
    public double calcularXp() {
        return XP_Padrao + 20;
    }
}
