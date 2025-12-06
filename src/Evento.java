import java.time.LocalDate;

public class Evento {
    private String nome;
    private LocalDate dataHora;
    private DiasDaSemana diaDaSemana;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDate dataHora) {
        this.dataHora = dataHora;
    }

    public DiasDaSemana getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(DiasDaSemana diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public String exibirEvento() {
        return "Evento{" + "nome=" + this.nome + ", dataHora=" + this.dataHora.toString() + ", diaDaSemana=" + this.diaDaSemana + "}";
    }
}
