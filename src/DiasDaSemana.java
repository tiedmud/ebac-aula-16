public enum DiasDaSemana {
    SEGUNDA("Segunda-feira"),
    TERÇA("Terça-feira"),
    QUARTA("Quarta-feira"),
    QUINTA("Quinta-feira"),
    SEXTA("Sexta-feira"),
    SÁBADO("Sábado"),
    DOMINGO("Domingo");

    private String descricao;

    DiasDaSemana(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}