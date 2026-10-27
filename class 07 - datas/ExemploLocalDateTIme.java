import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExemploLocalDateTIme {
    public static void main(String[] args) {
        LocalDate dataLocal = LocalDate.now();
        System.out.println("Data: " + dataLocal);

        LocalTime timeLocal = LocalTime.now();
        System.out.println("Hora: " + timeLocal);

        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println("Data e hora: " + dataHora);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Formatado: " + dataLocal.format(formatoData));
    
        LocalDate hoje = LocalDate.now();
        LocalDate amanha = hoje.plusDays(1);
        LocalDate ontem = hoje.minusDays(1);

        System.out.println("Hoje: " + hoje.format(formatoData));
        System.out.println("Amanhã: " + amanha.format(formatoData));
        System.out.println("Ontem: " + ontem.format(formatoData));
        
        LocalTime horaAtual = LocalTime.now();
        LocalTime menosUmaHora = horaAtual.minusHours(1);
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Horas atuais: " + horaAtual.format(formatoHora));
        System.out.println("Horas atuais: " + menosUmaHora.format(formatoHora));

    }
}
