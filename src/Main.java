import java.time.LocalDate;
import java.time.ZoneId;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome! ");

        Evento evento = new Evento();
        evento.setNome("Festa de aniversário");
        evento.setDataHora(LocalDate.now());
        evento.setDiaDaSemana(DiasDaSemana.SÁBADO);

        System.out.println("Evento: " + evento.exibirEvento());

        evento.setDataHora(evento.getDataHora().plusDays(5));

        System.out.println("Evento: " + evento.exibirEvento());

        evento.setDataHora(LocalDate.now(ZoneId.of("America/Sao_Paulo")));

        System.out.println("Evento: " + evento.exibirEvento());
    }
}