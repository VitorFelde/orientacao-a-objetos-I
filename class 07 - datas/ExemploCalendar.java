import java.util.Calendar;
import java.util.GregorianCalendar;

public class ExemploCalendar {
    public static void main(String[] args) {
        //creating an abstratct class, this basically allow us to created inheranced classes, like the gregorian calendar that we set down there
        Calendar agora = Calendar.getInstance(); //thats how we create an object of type calendar
        System.out.println("Agora: " + agora);

        Calendar dtVencimento = agora;
        dtVencimento.add(Calendar.DATE, 7); //messing in the date, and adding 7 days
        System.out.println("Data de vencimento: " + dtVencimento);
        
        dtVencimento.add(Calendar.MONTH, -1); //messing in the month, and subbing 1 month
        System.out.println("Data de vencimento: " + dtVencimento);

        GregorianCalendar gc = new GregorianCalendar();
        
        System.out.println("Ano: " + gc.get(Calendar.YEAR));
        System.out.println("Mês: " + gc.get(Calendar.MONTH));
        System.out.println("Dia do mes: " + gc.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia da semana: " + gc.get(Calendar.DAY_OF_WEEK));
        System.out.println("Dia do ano: " + gc.get(Calendar.DAY_OF_YEAR));
        System.out.println("Semana do mes: " + gc.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Semana do ano: " + gc.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Dia da semana no mês: " + gc.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        
            
    }
}
